import { Server } from './presentation/server';
import { AppRoutes } from './presentation/routes';

const main = async () => {
  const server = new Server({
    port: 8000,
    routes: AppRoutes.routes,
  }); 

  server.start();
}

(async () => {
  main();
})();
