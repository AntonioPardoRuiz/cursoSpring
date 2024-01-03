Vue.component('nombres', {
    template: ` 
    <input>
    `,
    data(){
        return{
            nombre:null
        }
    }

  })
  
  new Vue({
    el: '#nombre'
  })
