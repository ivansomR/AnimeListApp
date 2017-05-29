package com.example.pokocorp.animelistapp.activities.Models;

public class Anime {
    private int image;
    private String name;
    private int type;
    private int episodes;
    private int rate;


    public Anime(int image, String name, int type, int episodes, int rate) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getRate() {
        return rate;
    }

    public int getImage() {
        return image;
    }
}
