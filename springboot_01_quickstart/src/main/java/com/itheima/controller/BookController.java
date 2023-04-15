package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在首次添加的时候我发现目标地址显示“空白页”，
 * 查询后才知道，该java文件扫描所在文件夹里面的同级文件，
 * 如果按照初始，它在另外一个文件夹下，就扫描不到BookController
 * 自然/books/1也就得不到返回
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==> " + id);
        return "hello, spring boot!";
    }
}
