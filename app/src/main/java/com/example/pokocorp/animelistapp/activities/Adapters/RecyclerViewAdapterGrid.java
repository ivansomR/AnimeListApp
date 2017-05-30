package com.example.pokocorp.animelistapp.activities.Adapters;

import android.content.Context;
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
import com.example.pokocorp.animelistapp.activities.Models.Anime;
import com.example.pokocorp.animelistapp.activities.Adapters.RecyclerViewAdapterGrid.RecyclerViewHolders;

import java.util.List;

/**
 * Created by Ivan Somarriba on 5/30/2017.
 */

public class RecyclerViewAdapterGrid extends RecyclerView.Adapter<RecyclerViewHolders>{
    private List<Anime> animeList;
    private Context context;

    public RecyclerViewAdapterGrid(Context context, List<Anime> animeList) {
        this.animeList = animeList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.animeImage.setImageResource(animeList.get(position).getImage());
        holder.animeName.setText(animeList.get(position).getTag());
    }

    @Override
    public int getItemCount() {
        return this.animeList.size();
    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.IV_anime_image)
        ImageView animeImage;
        @BindView(R.id.TV_anime_name)
        TextView animeName;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}


