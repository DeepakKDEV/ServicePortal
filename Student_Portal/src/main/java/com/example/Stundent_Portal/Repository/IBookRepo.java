package com.example.Stundent_Portal.Repository;

import com.example.Stundent_Portal.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo  extends JpaRepository<Book,String> {
}
