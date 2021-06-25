import Vue from "vue"
import router from "vue-router"
import Login from "./views/login.vue"

Vue.use(router);

export default new router({
    mode: "history",
    base: process.env.BASE_URL,
    routes: [{
        path: "*",
        redirect: "/login",
    }, {
        path: "",
        redirect: "/login",
    }, {
        path: "/login",
        component: Login
    }
    ]
})
