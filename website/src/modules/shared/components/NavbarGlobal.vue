<template>
  <nav class="navbar navbar-expand-lg shadow-sm bg-light">
    <div class="container-fluid">
      
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav montserrat-regular link-global__container">
          <li class="nav-item">
            <router-link class="nav-link link-global" :to="{ name: 'Home' }">Inicio</router-link>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-global" :to="{ name: 'AboutMe' }">Sobre Mí</router-link>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-global">Archivos</router-link>
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
    font-weight: bold;
    width: 250px;
    border-radius: 10px;
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