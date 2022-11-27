package com.bookstore.bookstore_two.Mapper;

import bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {

    Book getBookById(@Param("id") int id);
}
