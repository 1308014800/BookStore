package com.bookstore.bookstore_two.Mapper;

import bean.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User login(String username);
    User getUserById(@Param("id") int id);
    public void zhuce(@Param("uname") String uname,@Param("pwd") String pwd,@Param("email") String email);

    void ClearCarts(int id);
}
