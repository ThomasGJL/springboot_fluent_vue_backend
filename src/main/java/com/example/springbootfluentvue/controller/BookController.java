package com.example.springbootfluentvue.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootfluentvue.entity.BookEntity;
import com.example.springbootfluentvue.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getBooks")
    public JSONObject getAllBook(){

        List<BookEntity> books = bookService.getAllBook();

        JSONObject jsonObject = new JSONObject();

        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(books));
        jsonObject.put("result", jsonArray);

        return jsonObject;
    }

    @GetMapping("/getBook")
    public JSONObject getAllBook(@RequestParam String tag){

        List<BookEntity> books = bookService.getBookbyTag(tag);

        JSONObject jsonObject = new JSONObject();

        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(books));
        jsonObject.put("result", jsonArray);

        return jsonObject;
    }

}
