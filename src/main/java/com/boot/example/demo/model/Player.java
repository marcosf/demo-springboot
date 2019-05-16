package com.boot.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Player {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String position;

    public Player() {
        super();
    }

    public Player(String name, String position) {
        super();
        this.name = name;
        this.position = position;
    }
}
