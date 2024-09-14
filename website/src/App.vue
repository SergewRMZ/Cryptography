<template>
  <!-- <Navbar/>
  <router-view/> -->
  <router-view name="navbar"></router-view>
  <router-view/>
</template>

<script lang="ts">
import { defineComponent, defineAsyncComponent } from 'vue';

export default defineComponent({
  name: 'App',
  components: {
    // Navbar: defineAsyncComponent(() =>
    //   import(/* webpackChunkName: "Navbar" */ '@/modules/shared/components/Navbar.vue')
    // ),
  },
});
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

/* nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
} */
</style>
