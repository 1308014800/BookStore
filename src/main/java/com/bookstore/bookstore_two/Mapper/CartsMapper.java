package com.bookstore.bookstore_two.Mapper;


import bean.Carts;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface CartsMapper {
    Carts getCarts(int userid);
}
