package com.example.springbootfluentvue.resolver;

import com.example.springbootfluentvue.entity.BookEntity;
import com.example.springbootfluentvue.service.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {

    @Autowired
    BookService bookService;

    public List<BookEntity> getAllBook(){

        return bookService.getAllBook();
    }
}
