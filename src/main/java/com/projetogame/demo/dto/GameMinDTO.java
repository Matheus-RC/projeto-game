package com.projetogame.demo.dto;

import com.projetogame.demo.entities.Game;
import com.projetogame.demo.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game x){
        this.id = x.getId();
        this.title = x.getTitle();
        this.year = x.getYear();
        this.imgUrl = x.getImgUrl();
        this.shortDescription = x.getShortDescription();
    }
    public GameMinDTO(GameMinProjection x){
        this.id = x.getId();
        this.title = x.getTitle();
        this.year = x.getGameYear();
        this.imgUrl = x.getImgUrl();
        this.shortDescription = x.getShortDescription();
    }

    public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
