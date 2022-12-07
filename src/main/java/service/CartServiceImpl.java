package service;

import bean.Cart;
import bean.User;

import com.bookstore.bookstore_two.Mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Override
    public LinkedList<Cart> getCartBYUser(User user) {
//        stringRedisTemplate.opsForValue();
        return cartMapper.getCartByUser(user.getId());
    }

    @Override
    public void UpdateCart(int cartItemId,int buyCount) {
        cartMapper.UpdateCart(cartItemId,buyCount);
    }
}
