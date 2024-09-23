import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './css/styles.css'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'animate.css';

// FontAwesome
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faLock, faLaptopCode, faDatabase, faMicrochip, faFolder, faFile, faEnvelope } from '@fortawesome/free-solid-svg-icons'
import { faFacebook, faGithub, faGoogle } from '@fortawesome/free-brands-svg-icons'

library.add(faLock, faLaptopCode, faDatabase, faMicrochip, faFolder, faFile, faFacebook, faGithub, faGoogle, faEnvelope)

createApp(App)
  .component('font-awesome-icon', FontAwesomeIcon)
  .use(store)
  .use(router)
  .mount('#app')
