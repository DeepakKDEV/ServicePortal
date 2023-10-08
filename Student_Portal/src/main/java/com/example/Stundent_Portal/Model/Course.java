package com.example.Stundent_Portal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Validated
@Entity
public class Course {

    @Id
    private String id;
    private String title;
    private String description;
    private String duration;
    @ManyToMany
    @JoinTable(name="KeyCource",
            joinColumns=@JoinColumn(name="courcec"),
            inverseJoinColumns = @JoinColumn(name="studentc"))
       Set<Student> studentSet;
}
