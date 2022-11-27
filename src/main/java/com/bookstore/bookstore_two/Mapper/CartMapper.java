package com.bookstore.bookstore_two.Mapper;

import bean.Cart;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedList;
import java.util.Map;

@Mapper
public interface CartMapper {
    @MapKey("bookName")
    LinkedList<Cart> getCartByUser(int userid);


    void UpdateCart(@Param("cartItemId") int cartItemId,@Param("buyCount") int buyCount);
}
