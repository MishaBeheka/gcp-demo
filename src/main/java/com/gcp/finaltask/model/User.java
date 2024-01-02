//package com.gcp.finaltask.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Table(name = "users")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString(onlyExplicitlyIncluded = true)
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "user_name", nullable = false)
//    @ToString.Include
//    private String userName;
//
//    @Column(name = "user_comment", nullable = false)
//    @ToString.Include
//    private String userComment;
//}
