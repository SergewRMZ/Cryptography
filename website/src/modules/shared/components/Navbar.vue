<template>
  <nav class="navbar navbar-expand-lg custom-navbar">
    <div class="container-fluid container-main">
      
      <!-- <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button> -->
      <div class="collapse navbar-collapse navbar-container" id="navbarNav">
        <ul class="navbar-nav montserrat-regular">
          <li class="nav-item">
            <router-link class="nav-link link-home" :to="{ name: 'Home' }">Inicio</router-link>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-home" :to="{ name: 'AboutMe' }">Sobre Mí</router-link>
          </li>

          <li class="nav-item">
            <router-link class="nav-link link-home" :to="{ name: 'Files' }">Archivos</router-link>
          </li>
          
        </ul>
      </div>

      <div>
        <h1 class="montserrat-bold tittle animate__animated animate__fadeInDown">Criptografía</h1>
        <h2 class="subtittle animate__animated animate__fadeInLeft">Serge Eduardo Martínez Ramírez</h2>
      </div>
    </div><!--Container Navbar-->
  </nav>
</template>

<script>
export default {

}
</script>

<style scoped>
  .container-main {
    display: flex;
    flex-direction: column;
    height: 500px;
  }

  .tittle {
    letter-spacing: 0.5rem;
    font-size: 12rem;
    color: black;
  }

  .subtittle {
    letter-spacing: .5rem;
    font-size: 2rem;
    color: white;
    font-weight: bold;
  }
  
  .custom-navbar {
    background-image: url('@/assets/Bg.webp');
    background-size: cover;
    background-position: center;
    height: 100vh;
    color: white;
    display: flex;
    flex-direction: column;
    justify-content: center;
  }

  /** Se definen estilos que modifican el aspecto de la barra de navegación */
  .navbar-container {
    display: flex;
    justify-content: center;
  }

  .navbar-nav {
    display: flex;
    gap: 60px;
  }

  div .router-link-exact-active {
    color: #075d9e;
  }

  div .link-home {
    font-size: 28px;
    border-bottom: 2px solid #fff;
    width: 250px;
    display: inline-block;
    transition: transform 0.3s ease;
    color: #fff;
    font-weight: bold;
    box-shadow: 1px solid #000;
  }

  div .nav-link:hover {
    transform: scale(1.1);
    color: rgb(0, 0, 0);
    border-color: rgb(0, 0, 0);
  }
</style>
