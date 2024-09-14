<template>
  <div class="container mt-5">
    <div class="row container__aboutMe">

      <div class="col-12 col-md-6 d-flex flex-column align-items-center">
        <h1 class="montserrat-bold mt-3 color--primario border-bottom border-3 w-75">Mis interéses</h1>

        <div class="container-icon shadow-sm mt-3">
          <font-awesome-icon :icon="['fas', 'database']" class="fa-5x"/>
          <font-awesome-icon :icon="['fas', 'laptop-code']" class="fa-5x"/>
          <font-awesome-icon :icon="['fas', 'lock']" class="fa-5x"/>
          <font-awesome-icon :icon="['fas', 'microchip']" class="fa-5x"/>
        </div>

        <div class="p--about mx-2">
          <p class="mt-3 text-start montserrat-regular">Las áreas que despiertan mi curiosidad y motivan mi aprendizaje,
            son las matemáticas,
            la integración y confidecialidad de la información, la comunicación entre dispositivos en red, así como el
            desarrollo de aplicaciones web y móviles, especialmente en el backend.</p>

          <p class="text-start montserrat-regular">
            Disfruto de la <span class="montserrat-bold text-primary">creatividad y lógica</span> que se debe
            implementar
            para <span class="montserrat-bold text-primary">crear soluciones eficientes</span>. Mi interés en
            estas áreas me impulsa a explorar nuevas tecnologías
            y a perfeccionar mis habilidades. Además, me gustaría aprender sobre redes neuronales e inteligencia
            artificial,
            pienso que son áreas muy interesantes.
          </p>
        </div>
      </div>

      <div class="col-12 col-md-6 bg-black">
        <div class="mt-5">
          <img src="@/assets/MiPerfil.jpg" class="img-fluid img-container">
        </div>

        <div class="container-information  mt-3">
          <span :class="{ 'animate': animate }">Serge Eduardo</span>
        </div>

        <p class="montserrat-regular text--information text-start mt-3 text-white mx-2">

          Nací el 12 de febrero del 2003 en la Ciudad de México. Soy estudiante de la Escuela Superior de Cómputo del
          <span class="montserrat-bold text-primary">Instituto Politécnico Nacional</span>.
          Tengo 21 años y me gusta mucho la tecnología, sobre todo el campo de la ciberseguridad y desarrollo de
          aplicaciones.

          Además de ello, me gusta la música y los videojuegos, especialmente los juegos de terror.

        </p>


      </div>
    </div>

  </div><!--Container-->
</template>

<script>
export default {
  data() {
    return {
      animate: false
    }
  },

  mounted() {
    this.animate = true;
  }
}
</script>

<style scoped>
.container__aboutMe {
  height: 80vh;
}

.container-icon {
  /* Ajustando el icono */
  display: flex;
  gap: 50px;
  color: black;
}

.p--about {
  font-size: 18px;
}

.img-container {
  width: 250px;
  height: 250px;
  border-radius: 50%;
}

/** Contenedor de la información del contenedor derecho de la vista */
.container-information {
  font-size: 30px;
  display: flex;
  justify-content: center;
}

.text--information {
  font-size: 18px;
}

.container-information span {
  display: block;
  color: white;
  font-family: monospace;
  white-space: nowrap;
  border-right: 4px solid;
  width: 14ch;
  overflow: hidden;
}

.animate {
  animation:
    typing 2s steps(13),
    blink .5s infinite step-end alternate;
}

@keyframes typing {
  from {
    width: 0;
  }
}

@keyframes blink {
  50% {
    border-color: transparent
  }
}
</style>