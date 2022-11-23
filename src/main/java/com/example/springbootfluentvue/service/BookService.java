package com.example.springbootfluentvue.service;

import com.example.springbootfluentvue.entity.BookEntity;
import com.example.springbootfluentvue.mapper.BookMapper;
import com.example.springbootfluentvue.wrapper.BookQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<BookEntity> getAllBook(){

        BookQuery bookQuery = BookQuery.query().selectAll();

        return bookMapper.listEntity(bookQuery);
    }
}
