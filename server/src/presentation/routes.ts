import { Router } from 'express';
import { FileUploadController } from './controllers/file-upload-controller';
import { FileUploadService } from './services/file-upload-service';
import { FileUploadMiddleware } from './middlewares/file-upload-middleware';

export class AppRoutes {
  static get routes(): Router {
    const router = Router();
    const fileUploadService = new FileUploadService();
    const fileUploadController = new FileUploadController(fileUploadService);

    router.post('/api/uploadFile/:type', FileUploadMiddleware.containFiles, fileUploadController.FileUpload);
    router.get('/api/getDirectoryContents', fileUploadController.getDirectoryContent);
    router.get('/api/downloadFile', fileUploadController.downloadFile);

    return router;
  }
}
