<template>
  <nav class="navbar navbar-expand-lg shadow-sm bg-light">
    <div class="container-fluid">
      
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav lilita link-global__container">
          <li class="nav-item">
            <router-link class="nav-link link-global" :to="{ name: 'Home' }">Inicio</router-link>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-global" :to="{ name: 'AboutMe' }">Sobre Mí</router-link>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-global" :to="{ name: 'Files' }">Archivos</router-link>
          </li>

          <li class="nav-item">
            <a class="nav-link link-global" href="/CV_Serge_Eduardo.pdf" download="CV_Serge_Eduardo.pdf">Mi CV</a>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-global" :to="{ path: '#' }">Mi Llave Pública</router-link>
          </li>
          
        </ul>
      </div>

      
    </div><!--Container Navbar-->
  </nav>

  
</template>

<script scoped>
export default {

}
</script>

<style>
  .router-link-exact-active {
    color: #075d9e;
  }

  div .link-global {
    color: black;
    font-size: 25px;
    width: 200px;
  }

  div .link-global:hover {
    color:#fff;
    background: #252525;
  }

  div .link-global__container {
    display: flex;
    gap: 50px;
  }

  div .collapse {
    display: flex;
    justify-content: center;
  }
</style>