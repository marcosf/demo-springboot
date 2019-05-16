package com.boot.example.demo.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
@RestResource(path="teams", rel="team")
public class Team {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascot;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<Player> players;

    public Team () {
        super();
    }

    public Team (String name, String location, String mascot, Set<Player> players) {
        super();
        this.name = name;
        this.location = location;
        this.mascot = mascot;
        this.players = players;
    }

}
