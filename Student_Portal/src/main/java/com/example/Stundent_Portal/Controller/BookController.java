package com.example.Stundent_Portal.Controller;

import com.example.Stundent_Portal.Model.Address;
import com.example.Stundent_Portal.Model.Book;
import com.example.Stundent_Portal.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("post/book")
    public String postBooks(@RequestBody List<Book> newBooks){
        return  bookService.postBooks(newBooks);
    }
    @GetMapping("get/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @DeleteMapping("delete")
     public  String deleteRow(@PathVariable  String id) {
        return bookService.deleteRow(id);
    }
    @PutMapping("update/book/id/{id}")
    public String updateTitle(@PathVariable String id, @RequestParam String mytitle ){
        return   bookService.updateTitle(id, mytitle);
    }



}
