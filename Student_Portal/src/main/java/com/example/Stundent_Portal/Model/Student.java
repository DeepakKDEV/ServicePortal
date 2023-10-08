package com.example.Stundent_Portal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Long phone_number;
    @Enumerated(value = EnumType.STRING)
    private BranchType branch;
    @Enumerated(value = EnumType.STRING)
    private TypeDp department;


   @OneToOne
   @JoinColumn(name = "Fk_address_ID" )
    private Address address;

   @OneToMany(cascade = CascadeType.ALL)
    Set<Course> courseSet;

}
