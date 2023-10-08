package com.example.Stundent_Portal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private String description;
    private double price;

    @ManyToOne
    @JoinColumn(name = "Fk_Student_id" )
    Student student;
}
