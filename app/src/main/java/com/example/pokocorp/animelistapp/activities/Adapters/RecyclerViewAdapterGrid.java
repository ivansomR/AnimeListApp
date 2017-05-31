package com.example.pokocorp.animelistapp.activities.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Activities.AnimeDetail;
import com.example.pokocorp.animelistapp.activities.Models.Anime;
import com.example.pokocorp.animelistapp.activities.Adapters.RecyclerViewAdapterGrid.HomeViewHolders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Somarriba on 5/30/2017.
 */

public class RecyclerViewAdapterGrid extends RecyclerView.Adapter<HomeViewHolders> {
    private ArrayList<Anime> animeList;
    private Context context;

    public RecyclerViewAdapterGrid(Context context, ArrayList<Anime> animeList) {
        this.animeList = animeList;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public HomeViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, null);
        HomeViewHolders v = new HomeViewHolders(layoutView, context, animeList);
        return v;
    }

    @Override
    public void onBindViewHolder(HomeViewHolders holder, int position) {
        holder.animeImage.setImageResource(animeList.get(position).getImage());
        holder.animeName.setText(animeList.get(position).getTag());
    }

    @Override
    public int getItemCount() {
        return this.animeList.size();
    }

    public class HomeViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
        ArrayList<Anime> animeList = new ArrayList<>();
        Context context;
        @BindView(R.id.IV_anime_image)
        ImageView animeImage;
        @BindView(R.id.TV_anime_name)
        TextView animeName;
        @BindView(R.id.card_view_home)
        CardView CV_home;

        public HomeViewHolders(View view, Context context, ArrayList<Anime> animeList) {
            super(view);
            this.animeList = animeList;
            this.context = context;
            view.setOnClickListener(this);
            ButterKnife.bind(this, view);
        }

        @Override
        public void onClick(View v) {
            Anime anime = this.animeList.get(getAdapterPosition());
            Intent intent = new Intent(this.context, AnimeDetail.class);

            intent.putExtra("ANIME", anime);
            this.context.startActivity(intent);
        }
    }
}


