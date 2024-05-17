package com.kipper.picpay.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String documentNumber;

    @Column(unique = true)
    private String email;
    private String pswdCustomer;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
