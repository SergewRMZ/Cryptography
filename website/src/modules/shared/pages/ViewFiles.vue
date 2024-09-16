<template>
  <div class="container w-75">
    <h1 class="mt-5 mb-4 montserrat-bold text-primary border-bottom border-primary border-opacity-25 border-3">Archivos</h1>
    
    <!-- Botón para retroceder al directorio anterior -->
    <div v-if="currentPath !== 'uploads'" class="mt-3 mb-3">
      <button @click="goBack" class="btn btn-secondary">⬅️ Regresar</button>
    </div>

    <div v-if="tree">
      <ul class="bg-black text-start text-white list-unstyled rounded container mt-2">
        <li v-for="(item, index) in tree.children" :key="index">

          <span
            v-if="item.type === 'directory'" 
            @click="getDirectoryContent(item.name)" 
            class="cursor-pointer d-flex align-items-center gap-3">

            <font-awesome-icon :icon="['fas', 'folder']" 
            class="text-primary fa-2x mb-2 mt-2"/> {{ item.name }}
          </span>

          <span 
            v-if="item.type === 'file'" 
            @click="downloadFile(item.name)" 
            class="cursor-pointer d-flex align-items-center gap-4">

            <font-awesome-icon :icon="['fas', 'file']" 
            class="text-white fa-2x mb-2 mt-2"/> {{ item.name }}
          </span>

        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import { mostrarAlertaError } from '@/helpers/alert';

export default {
  data() {
    return {
      tree: {
        name: 'uploads',
        type: 'directory',
        children: []
      },
      currentPath: 'uploads', // Ruta actual
      pathHistory: [],        // Historial de rutas
      apiURL: process.env.VUE_APP_WEBSERVICE_URL
    };
  },

  methods: {
    async fetchDirectory(path) {
      try {
        const response = await fetch(`${this.apiURL}/getDirectoryContents?path=${path}`);
        if (!response.ok) throw new Error('No se pudo obtener el contenido del directorio');
        const data = await response.json();
        this.tree = data.files;
      } catch (error) {
        mostrarAlertaError('No se pudo obtener los directorios');
      }
    },

    async getDirectoryContent(directoryName) {
      const newPath = `${this.currentPath}/${directoryName}`;

      this.pathHistory.push(this.currentPath);
      this.currentPath = newPath;

      await this.fetchDirectory(this.currentPath);
    },

    async goBack() {
      if (this.pathHistory.length > 0) {
        this.currentPath = this.pathHistory.pop(); 
        await this.fetchDirectory(this.currentPath);
      }
    },

    async downloadFile(file) {
      const filePath = `${this.currentPath}/${file}`;
      console.log(filePath);
      const response = await fetch(`${this.apiURL}/downloadFile?file=${filePath}`);
      const blob = await response.blob();
      
      const url = window.URL.createObjectURL(blob);
      const link = document.createElement('a');
      link.href = url;
      link.setAttribute('download', file);

      link.click();
      
      console.log(url);
    }
  },

  mounted() {
    this.fetchDirectory(this.currentPath);
  }
};
</script>

<style>
  .cursor-pointer {
    cursor: pointer;
  }
</style>
