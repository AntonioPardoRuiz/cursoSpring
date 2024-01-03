Vue.use(HighchartsVue.default)
Vue.component('v-select', VueSelect.VueSelect);
 
var app = new Vue({
    el: "#app",
    data() {
        return {
            title: '',
            options: ['spline', 'line'],
            modo: 'spline',
            series: [
                        {
                          data: [30, 3, 6, 2, 6, 4, 5, 5]
                        },
                        {
                          data: [0, 1, 4, 3, 8, 1, 3, 7]
                        },
                        ],
        }
    },
    computed: {
        chartOptions() { 
            return {
                    chart: {  type: this.modo},
                    title: {  text: this.title  },
                    series: this.series,
              }
        },
    },
    template:
    `
    <div>
    <div class="title-row">
            <span>Chart title:</span>
            <input type="text" v-model="title">
            <span>Estilo:</span>
            <v-select :options="options" v-model="modo" crearable=False></v-select>
        </div>
         
        <highcharts :options="chartOptions" ></highcharts>
    </div>
    `
})