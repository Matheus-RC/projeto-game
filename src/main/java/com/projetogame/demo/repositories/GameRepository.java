package com.projetogame.demo.repositories;

import com.projetogame.demo.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;



public interface GameRepository extends JpaRepository<Game, Long> {
}
