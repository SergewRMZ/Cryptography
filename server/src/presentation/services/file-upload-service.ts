import { UploadedFile } from "express-fileupload";
import { CustomError } from "../custom.error";
import path from 'path';
import fs from 'fs';

export class FileUploadService {
  constructor () {}

  private checkFolder ( folderPath:string) {
    if (!fs.existsSync(folderPath)) fs.mkdirSync(folderPath);
  }

  private getDirectoryTree(dirPath: string): any {
    const stats = fs.statSync(dirPath); 

    if (stats.isDirectory()) {
      const items = fs.readdirSync(dirPath);
      return {
        name: path.basename(dirPath),
        type: 'directory',
        children: items.map(item => this.getDirectoryTree(path.join(dirPath, item))) 
      };
    } 
    
    else {
      return {
        type: 'file',
        name: path.basename(dirPath)
      };
    }
  }

  public async uploadSingleFile (
    file: UploadedFile,
    folder:string = 'uploads',
    validExtensions: string[] = ['png', 'jpg', 'jpeg', 'webp', 'rar']
  ) {

    try {
      const fileExtension = file.mimetype.split('/').at(1) ?? '';

      if (!validExtensions.includes(fileExtension)) {
        throw CustomError.badRequest(`Invalid extension: ${fileExtension}`)
      }

      const destination = path.resolve( __dirname, '../../../', folder);
      this.checkFolder(destination);

      const originalName = file.name;

      await file.mv(`${destination}/${originalName}`);
    } catch (error) {
      throw error;
    }
  }

  public async downloadFile (filePath: string) {
    try {
      const fullPath = path.resolve(__dirname, '../../../', filePath);
      console.log('Archivo a descargar', fullPath);
      if (!fs.existsSync(fullPath)) {
        throw CustomError.notFound('Archivo no encontrado');
      }

      return fullPath;
    } catch (error) {
      throw CustomError.internalServer('Unable to read the directory');
    }
  }

  public async getDirectoryContents(dirPath: string) {
    try {
      const fullPath = path.resolve(__dirname, '../../../', dirPath);
      if (!fs.existsSync(fullPath)) {
        throw CustomError.notFound('Directory not found');
      }
      const tree = this.getDirectoryTree(fullPath);
      return tree;
    } catch (error) {
      throw CustomError.internalServer('Unable to read the directory');
    }
  }
}