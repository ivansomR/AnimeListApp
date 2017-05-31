package com.example.pokocorp.animelistapp.activities.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Activities.AnimeDetail;
import com.example.pokocorp.animelistapp.activities.Activities.AnimeFavorite;
import com.example.pokocorp.animelistapp.activities.Models.Anime;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ivan Somarriba on 5/31/2017.
 */

public class RecyclerViewAdapterFav extends RecyclerView.Adapter<RecyclerViewAdapterFav.FavViewHolder>{

    private ArrayList<Anime> animeList;
    private Context context;

    public RecyclerViewAdapterFav(Context context, ArrayList<Anime> animeList){
        this.animeList = animeList;
        this.context = context;

    }

    @Override
    public FavViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        FavViewHolder v = new FavViewHolder(layoutView, context, animeList);
        return v;
    }

    @Override
    public void onBindViewHolder(FavViewHolder holder, int position) {
        Anime anime = animeList.get(position);

        holder.animeImage.setImageResource(anime.getImage());
        holder.animeName.setText(anime.getName());
        holder.animeType.setText(anime.getType());
        holder.animeScore.setText(String.valueOf(anime.getScore()));
        holder.animeEpisode.setText(String.valueOf(anime.getEpisodes()));
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }


    public class FavViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        List<Anime> animeList = new ArrayList<>();
        Context context;
        @BindView(R.id.IV_image)
        ImageView animeImage;
        @BindView(R.id.TV_name)
        TextView animeName;
        @BindView(R.id.TV_type)
        TextView animeType;
        @BindView(R.id.TV_score)
        TextView animeScore;
        @BindView(R.id.TV_episode)
        TextView animeEpisode;

        public FavViewHolder(View view, Context context, List<Anime> animeList) {
            super(view);
            this.animeList = animeList;
            this.context = context;
            view.setOnClickListener(this);
            ButterKnife.bind(this, view);
        }

        @Override
        public void onClick(View v) {
            Anime anime = this.animeList.get(getAdapterPosition());
            Intent intent = new Intent(this.context, AnimeFavorite.class);

            intent.putExtra("ANIME", anime);
            this.context.startActivity(intent);
        }
    }
}
