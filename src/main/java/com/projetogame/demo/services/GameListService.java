package com.projetogame.demo.services;


import com.projetogame.demo.dto.GameListDTO;
import com.projetogame.demo.entities.GameList;
import com.projetogame.demo.projections.GameMinProjection;
import com.projetogame.demo.repositories.GameListRepository;

import com.projetogame.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> listDTO = result.stream().map(x -> new GameListDTO(x)).toList();
        return listDTO;
    }
    @Transactional
    public void move(Long listId, int sourcePosition, int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourcePosition);
        list.add(destinationIndex, obj);

        int min = sourcePosition < destinationIndex? sourcePosition: destinationIndex;
        int max = sourcePosition < destinationIndex? destinationIndex: sourcePosition;

        for(int i = min; i <= max; i++){
           gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }


}
