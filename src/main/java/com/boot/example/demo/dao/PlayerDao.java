package com.boot.example.demo.dao;

import com.boot.example.demo.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="player")
public interface PlayerDao extends CrudRepository<Player, Long> {
}
