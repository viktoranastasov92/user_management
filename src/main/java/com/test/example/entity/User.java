package com.test.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Getter
@Setter
//@Table(name = "\"USER\"")
@Document(collection = "users")
public class User {
    @Id
    private String userName;
    private String password;
    private String surname;
    private String firstName;
}
