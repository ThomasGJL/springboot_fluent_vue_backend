package com.example.springbootfluentvue.service;

import cn.org.atool.fluent.mybatis.base.crud.IQuery;
import cn.org.atool.fluent.mybatis.base.crud.JoinBuilder;
import cn.org.atool.fluent.mybatis.segment.JoinQuery;
import cn.org.atool.fluent.mybatis.segment.model.Parameters;
import com.example.springbootfluentvue.entity.BookEntity;
import com.example.springbootfluentvue.mapper.BookMapper;
import com.example.springbootfluentvue.wrapper.BookQuery;
import com.example.springbootfluentvue.wrapper.BooktagQuery;
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

    public List <BookEntity> getBookbyTag(String tag) {

        IQuery bookQurey = JoinBuilder
                .<BookQuery> from(new BookQuery("b")
                        .select.name().author().end())
                .join(new BooktagQuery("bt")
                        .select.tagName().end()
                        .where.id().eq(tag).end())
                .on(l -> l.where.tid(), r -> r.where.id()).endJoin()
                .build();

        List <BookEntity> books = bookMapper.listEntity(bookQurey);

        return books;
    }
}
