<template>
  <div class="container mt-5">
    <div class="row container__aboutMe">

      <div class="col-12 col-md-6 d-flex flex-column align-items-center">
        <h1 class="montserrat-bold mt-3 color--primario border-bottom border-3 w-75">Mis interéses</h1>

        <div class="container-icon shadow-sm mt-3">
          <font-awesome-icon :icon="['fas', 'database']" class="fa-5x" />
          <font-awesome-icon :icon="['fas', 'laptop-code']" class="fa-5x" />
          <font-awesome-icon :icon="['fas', 'lock']" class="fa-5x" />
          <font-awesome-icon :icon="['fas', 'microchip']" class="fa-5x" />
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

          <img src="@/assets/Tecnología.webp" class="img-fluid" style="border-radius: 5px;">
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
          Durante de mi formación he desarrollado un fuerte interés en la ciberseguridad y el desarrollo de aplicaciones.
          Me motiva la idea de querer solucionar problemas complejos, establecer sistemas de comunicación viables y seguros 
          a la hora de hacer aplicaciones. En la escuela he trabajo diversos proyectos que me han gustado mucho, a pesar de 
          ser escolares, creo que algunos han sido grandes desafíos que han hecho que me guste mucho más mi carrera.
          A la hora de desarrollar aplicaciones, busco implementar seguridad en el backend, eso despertó más mi interés 
          por la criptografía y la ciberseguridad.
        </p>

        <div class="d-flex justify-content-center gap-3" target="_blank" rel="noopener noreferrer">
          <a href="https://www.facebook.com/profile.php?id=100089838310818&mibextid=ZbWKwL" target="_blank">
            <font-awesome-icon :icon="['fab', 'facebook']" class="fa-5x text-white"/>
          </a>

          <a href="https://github.com/SergewRMZ" target="_blank">
            <font-awesome-icon :icon="['fab', 'github']" class="fa-5x text-white"/>
          </a>
        </div>

        <div class="text-white d-flex gap-3 justify-content-center align-items-center mt-3 ">
          <font-awesome-icon :icon="['fas', 'envelope']" class="fa-5c text-white"/>
          <span>serge15games@gmail.com</span>
        </div>
        

      </div>

        <!--Sección sobre la historia de un algoritmo -->
      <div class="montserrat-regular text-start p--about text-black">
        <h1 class="mt-5">Historia del Algoritmo de Diffie-Hellman</h1>
        <p>El algoritmo de Diffie-Hellman debe su nombre a sus creadores <span class="montserrat-bold text-primary">Whitfield Diffie y Martin Hellman</span>.
          Es uno de los protocolos de intercambio de claves más antiguos que todavía se siguen usando en la actualidad.
          Sus creadores fueron galardonados con el premio A.M. Turing 2015 por este trabajo, con el que
          revolucionaron por completo la seguridad informática.<br>

          El algoritmo crea una clave simétrica que cifrará la comunicación entre ambos equipos,
          de forma que esta comunicación no podrá ser interceptada, aunque un tercero conozca
          los mensajes enviados por el protocolo. A pesar de que <span class="montserrat-bold text-primary">no es un
          algoritmo de cifrado</span>, permite una mejor manera de intercambiar claves. A través de este protocolo 
          se crean dos claves idénticas para los equipos que establecerán la comunicación, de esa manera solo 
          lo equipos conocerán la clave y podrán establecer la comunicación de forma segura.
        </p>

        <div class="text-center mt-5 bg-light">
          <img src="@/assets/Autores.jpg" class="img-fluid" style="width: 400px; border-radius: 5px;">
        </div>

        <p class="mt-3">
          En la década de 1970, la criptografía se utilizaba principalmente en el ámbito militar y se basaba en 
          sistemas de clave simétrica, donde la misma clave se usaba para cifrar como para descifrar mensajes.
          El problema es que las partes que quería comunicarse debían compartir la clave secreta de forma segura,
          lo cual era complicada.

          Diffie y Hellman, estaban interesados en encontrar una solución a este problema. En 1976, publicaron su 
          trabajo titulado "New Directions in Cryptography". En este documento, propusieron por primera vez la idea 
          de un intercambio de claves públicas, que permitía a dos partes establecer una clave compartida sin necesidad 
          de intercambiar la clave misma.
        </p>

        <h2>El logaritmo discreto</h2>

        <p>
          Utilizaron conceptos clave como el logaritmo discreto y la teoría de números, ya que la seguridad
          del intercambio de claves se basa en la dificultad de resolver el problema del logaritmo discreto, que implica
          encontrar la clave privada a partir de la clave pública. La invención de Diffie-Hellman marcó un hito en la criptografía, 
          permitiendo el desarrollo de sistemas de comunicación seguros en canales no seguros. Su trabajo abrió las puertas a la 
          criptografía asimétrica y sentó las bases para protocolos de seguridad modernos, como SSL/TLS, que protegen la 
          información en Internet.
        </p>
      </div>
    </div> <!--Sección de Algoritmo-->
  </div> <!--Container-->
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