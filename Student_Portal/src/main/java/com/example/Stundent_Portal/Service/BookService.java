package com.example.Stundent_Portal.Service;


import com.example.Stundent_Portal.Model.Book;
import com.example.Stundent_Portal.Repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;

    public String postBooks(List<Book> newBook) {
        iBookRepo.saveAll(newBook);
        return  "added";
    }

    public List<Book> getBooks() {
       return  iBookRepo.findAll();
    }

    public String deleteRow(String id) {
        iBookRepo.deleteById(id);
         return  "delete Row";
    }

    public String updateTitle(String id, String mytitle) {
        Book book=iBookRepo.findById(id).orElse(null);
          if(book!=null){
              book.setTitle(mytitle);
              iBookRepo.save(book);
          }
        return  "update";
    }
}
