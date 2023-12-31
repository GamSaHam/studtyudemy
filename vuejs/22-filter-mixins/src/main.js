import Vue from "vue";
import App from "./App.vue";

Vue.filter("toLowrecase", function(value) {
  return value.toLowerCase();
});

Vue.mixin({
  created() {
    console.log("Global Mixin - Createed Hook");
  }
});

new Vue({
  el: "#app",
  render: h => h(App)
});
