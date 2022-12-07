package controller;

import bean.Carts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CartService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
public class Cart {
    @Autowired
    private CartService service;

    @RequestMapping(value = "/Cart" ,method = RequestMethod.GET)
    @ResponseBody
    public Carts ShowCart(HttpServletRequest request, Model model){
        bean.User user = (bean.User) request.getSession().getAttribute("user");
        LinkedList<bean.Cart> cart = service.getCartBYUser(user);
        for (bean.Cart c:cart
             ) {
            c.setSum();
        }
        Carts carts = new Carts();
        carts.setCarts(cart);
        return carts;
    }

    @RequestMapping(value = "/Cart" ,method = RequestMethod.POST)
    @ResponseBody
    public String UpdateCart(int cartItemId,int buyCount){
            service.UpdateCart(cartItemId,buyCount);
            return "OK";
    }


//    @RequestMapping(value = "/test")
//    @ResponseBody
//    public Map<String,Object> test(@RequestParam List<String> list){
//        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
//        list
//                .forEach(System.out::println);
//        stringObjectHashMap.put("hello","test!");
//        return stringObjectHashMap;
//    }
    @RequestMapping("/test")
    public void test(){
        System.out.println("test");
    }
}
