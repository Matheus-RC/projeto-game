package com.projetogame.demo.controllers;

import com.projetogame.demo.dto.GameDTO;
import com.projetogame.demo.dto.GameListDTO;
import com.projetogame.demo.dto.GameMinDTO;
import com.projetogame.demo.services.GameListService;
import com.projetogame.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/list")
public class GameListControler {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
