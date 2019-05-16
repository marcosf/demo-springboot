package com.boot.example.demo;

import com.boot.example.demo.dao.TeamDao;
import com.boot.example.demo.model.Player;
import com.boot.example.demo.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private TeamDao teamDao;

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Thiago Volpi", "goleiro"));
		set.add(new Player("Pato", "Atacante"));
		set.add(new Player("Hernanes", "Meio Campista"));
		set.add(new Player("Nene", "Atacante"));

		Team team = new Team();
		team.setLocation("São Paulo");
		team.setName("São Paulo Futebol Clube");
		team.setMascot("Santo Paulo");
		team.setPlayers(set);
		list.add(team);

		Set<Player> set2 = new HashSet<>();
		set2.add(new Player("Pierre", "lateral esquerdo"));
		set2.add(new Player("Gui Mendes", "Atacante"));
		set2.add(new Player("Léo Rigo ", "zagueiro"));

		team = new Team();
		team.setLocation("Itu");
		team.setName("Ituano Futebol Clube");
		team.setMascot("Galo Ituano");
		team.setPlayers(set2);
		list.add(team);

		teamDao.saveAll(list);
	}
}