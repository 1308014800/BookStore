window.onload=function(){
    var vue = new Vue({
        el:"#cart_div",
        data:{
            cart:{}
        },
        methods:{
            getCart:function(){
                axios({
                    method:"GET",
                    url:"/Cart"
                })
                    .then(function (value) {
                        var cart = value.data ;
                        vue.cart = cart ;
                    })
                    .catch(function (reason) {alert(reason)  });
            },
            editCart:function(cartItemId , buyCount){
                axios({
                    method:"POST",
                    url:"/Cart",
                    params:{
                        cartItemId:cartItemId,
                        buyCount:buyCount
                    }
                })
                    .then(function (value) {
                        vue.getCart();
                    })
                    .catch(function (reason) { alert(reason) });
            }
        },
        mounted:function(){
            this.getCart() ;
        }
    });
}