package com.example.pokocorp.animelistapp.activities.Models;

import java.io.Serializable;

public class Anime implements Serializable{
    private int image;
    private String tag;
    private String name;
    private String type;
    private String genres;
    private String synopsis;
    private int episodes;
    private int score;
    private int status;
    private boolean mylist;
    private  boolean favorite;



    public Anime(int image, String tag ,String name, String type, String genres, String synopsis,
                 int episodes, int score, boolean mylist, boolean favorite, int status) {
        this.image = image;
        this.tag = tag;
        this.name = name;
        this.type = type;
        this.genres = genres;
        this.synopsis = synopsis;
        this.episodes = episodes;
        this.score = score;
        this.mylist = mylist;
        this.favorite = favorite;
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genres;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getScore() {
        return score;
    }

    public int getStatus(){
        return status;
    }

    public boolean isMylist() {
        return mylist;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setMylist(boolean mylist){
        if (mylist != false){
            mylist = true;
        }else{
            mylist = false;
        }
    }

    public void setFavorite(boolean favorite){
        if (favorite != false){
            favorite = true;
        }else{
            favorite = false;
        }
    }

}
