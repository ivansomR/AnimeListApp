package com.example.pokocorp.animelistapp.activities.Models;

public class Anime {
    private int image;
    private String tag;
    private String name;
    private String type;
    private String genres;
    private String synopsis;
    private int episodes;
    private int score;


    public Anime(int image, String tag ,String name, String type, String genres, String synopsis, int episodes, int score, boolean mylist, boolean favorite, int status) {
        this.image = image;
        this.tag = tag;
        this.name = name;
        this.type = type;
        this.genres = genres;
        this.synopsis = synopsis;
        this.episodes = episodes;
        this.score = score;

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

    public String getGendre() {
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


}
