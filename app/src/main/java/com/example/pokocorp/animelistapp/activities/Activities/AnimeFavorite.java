package com.example.pokocorp.animelistapp.activities.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Models.Anime;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ivan Somarriba on 5/31/2017.
 */

public class AnimeFavorite extends AppCompatActivity {
    Anime anime;
    @BindView(R.id.anime_image_detail)
    ImageView IV_image;
    @BindView(R.id.anime_title)
    TextView TV_title;
    @BindView(R.id.anime_type)
    TextView TV_type;
    @BindView(R.id.genres_detail)
    TextView TV_genres;
    @BindView(R.id.episodes_detail)
    TextView TV_episodes;
    @BindView(R.id.anime_sysnopsis)
    TextView TV_synopsis;
    @BindView(R.id.anime_score)
    TextView TV_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_favorite_detail);
        ButterKnife.bind(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            anime = (Anime) extras.getSerializable("ANIME");

            IV_image.setImageResource(anime.getImage());
            TV_title.setText(anime.getName());
            TV_type.setText(anime.getType());
            TV_episodes.setText(String.valueOf(anime.getEpisodes()));
            TV_score.setText(String.valueOf(anime.getScore()));
            TV_genres.setText(anime.getGenre());
            TV_synopsis.setText(anime.getSynopsis());
        }
    }
}
