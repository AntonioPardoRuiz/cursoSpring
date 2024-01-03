Vue.component('child-comp', {
  props: ['message'], // declare the props
  template: '<p>At child-comp, using props in the template: {{ message }}</p>',
  mounted: function () {
    console.log('The props are also available in JS:', this.message);
  }
})

new Vue({
  el: '#prueba',
  data: {
    variableAtParent: 'DATA FROM PARENT!'
  }
})