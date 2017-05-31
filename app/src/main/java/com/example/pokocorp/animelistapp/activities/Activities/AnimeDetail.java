package com.example.pokocorp.animelistapp.activities.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Models.Anime;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ivan Somarriba on 5/30/2017.
 */

public class AnimeDetail extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);
        ButterKnife.bind(this);

        IV_image.setImageResource(getIntent().getIntExtra("anime_img", 0));
        TV_title.setText(getIntent().getStringExtra("title"));
        TV_type.setText(getIntent().getStringExtra("type"));
        TV_genres.setText(getIntent().getStringExtra("genres"));
        TV_synopsis.setText(getIntent().getStringExtra("synopsis"));

    }

}
