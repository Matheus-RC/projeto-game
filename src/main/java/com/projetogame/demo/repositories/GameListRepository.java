package com.projetogame.demo.repositories;

import com.projetogame.demo.entities.Game;
import com.projetogame.demo.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}
