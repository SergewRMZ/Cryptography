import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    components: {
      navbar: () => import (/* webpackChunkName: "Navbar" */ '@/modules/shared/components/Navbar.vue'),
    }
  },

  {
    path: '/about',
    name: 'AboutMe',
    components: {
      default: () => import (/* webpackChunkName: "About" */ '@/modules/shared/pages/AboutMe.vue'),
      navbar: () => import (/* webpackChunkName: "NavbarGlobal" */ '@/modules/shared/components/NavbarGlobal.vue')
    }
  },

  {
    path: '/files',
    name: 'Files',
    components: {
      default: () => import (/* webpackChunkName: "Files" */ '@/modules/shared/pages/ViewFiles.vue'),
      navbar: () => import (/* webpackChunkName: "NavbarGlobal" */ '@/modules/shared/components/NavbarGlobal.vue')
    }
  },

  {
    path: '/cv',
    name: 'CV',
    components: {
      default: () => import (/* webpackChunkName: "CV" */ '@/modules/shared/pages/ViewFiles.vue'),
      navbar: () => import (/* webpackChunkName: "NavbarGlobal" */ '@/modules/shared/components/NavbarGlobal.vue')
    }
  }
  
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
