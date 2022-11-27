package controller;

import bean.Carts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CartService;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;

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
}
