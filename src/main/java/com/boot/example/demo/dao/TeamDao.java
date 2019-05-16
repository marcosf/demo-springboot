package com.boot.example.demo.dao;

import com.boot.example.demo.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="teams", rel="team")

public interface TeamDao extends CrudRepository<Team, Long> {
}
