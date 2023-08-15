package com.projetogame.demo.services;

import com.projetogame.demo.dto.GameDTO;
import com.projetogame.demo.dto.GameMinDTO;
import com.projetogame.demo.entities.Game;
import com.projetogame.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Optional result = gameRepository.findById(id);
        if(!result.isEmpty()){
            Game game = (Game) result.get();
            GameDTO gameDTO = new GameDTO(game);
            return gameDTO;
        }else{
            return null;
        }
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }




}
