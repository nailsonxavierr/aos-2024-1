package com.marciobueno.aos.sb001;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sq")
    @SequenceGenerator(name = "users_sq", sequenceName = "users_sq", initialValue = 1, allocationSize = 1)
    private long id;

    private String name;

    private String bio;

    private String email;

    private boolean active;

    @CreationTimestamp
    private Date createDAt;

    @Column(unique = true)
    private String username;

    @UpdateTimestamp
    private Date updateDAt;
}