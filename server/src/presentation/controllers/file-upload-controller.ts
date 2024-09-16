import { Request, Response } from "express";
import { FileUploadService } from "../services/file-upload-service";
import { UploadedFile } from "express-fileupload";
import { CustomError } from "../custom.error";

export class FileUploadController {
  constructor (private readonly fileUploadService: FileUploadService) {}

  private handleError = (error: unknown, res: Response) => {
    if (error instanceof CustomError) {
      return res.status(error.statusCode).json({error: error.message})
    }
    console.log(`${error}`);
    return res.status(500).json({error: 'Internal server error'});
  }
  
  public FileUpload = async (req:Request, res:Response) => {
    const type = req.params.type   
    // const file = req.files!.file as UploadedFile; Esta opción cambió
    const file = req.body.files.at(0) as UploadedFile;

    this.fileUploadService.uploadSingleFile(file, `uploads/${type}`)
      .then(uploaded => res.json(uploaded))
      .catch(error => this.handleError(error, res))
  }

  public getDirectoryContent = async (req: Request, res: Response) => {
    this.fileUploadService.getDirectoryContents(req.query.path as string)
      .then(files => res.json({ files }))
      .catch(error => this.handleError(error, res));
  }

  public downloadFile = async (req: Request, res: Response) => {
    this.fileUploadService.downloadFile(req.query.file as string)
      .then(fullPath => res.download(fullPath))
      .catch(error => this.handleError(error, res))
  }
}