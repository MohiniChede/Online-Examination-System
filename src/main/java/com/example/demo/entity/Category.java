package com.example.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    private String title;
    private String description;

    // 1. Default Constructor (Khup garjeche aahe)
    public Category() {}

    // 2. Getters and Setters (Postman ani MySQL sathi)
    public Long getCid() { return cid; }
    public void setCid(Long cid) { this.cid = cid; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}