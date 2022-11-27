package service;

import bean.Cart;
import bean.User;


import java.util.LinkedList;

public interface CartService {
    LinkedList<Cart> getCartBYUser(User user);
    void UpdateCart(int cartItemId,int buyCount);
}
