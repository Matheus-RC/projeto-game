package com.projetogame.demo.services;


import com.projetogame.demo.dto.GameListDTO;
import com.projetogame.demo.entities.GameList;
import com.projetogame.demo.repositories.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> listDTO = result.stream().map(x -> new GameListDTO(x)).toList();
        return listDTO;
    }




}
