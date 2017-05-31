package com.example.pokocorp.animelistapp.activities.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Adapters.RecyclerViewAdapterLinear;
import com.example.pokocorp.animelistapp.activities.Models.Anime;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Mylist extends Fragment {
    private LinearLayoutManager layoutManager;
    private ArrayList<Anime> animes;
    @BindView(R.id.RV_anime_mylist)
    RecyclerView animeList;

    public Mylist() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mylist, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        layoutManager = new LinearLayoutManager(this.getContext());

        animeList.setHasFixedSize(true);
        animeList.setLayoutManager(layoutManager);

        RecyclerViewAdapterLinear adapter = new RecyclerViewAdapterLinear(getContext(), animes);
        animeList.setAdapter(adapter);
        return view;
    }

    private void initializeData() {

        animes = new ArrayList<>();
        animes.add(new Anime(R.drawable.tsukigakirei, "Tsukigakirei", "Tsuki ga kirei", "TV", "Romance, School", "Kotarou Azumi and Akane Mizuno became third year students at junior high school and are classmates for the first time. These two, along with fellow classmates, Chinatsu Nishio and Takumi Hira, relate to their peers through mutual understandings and feelings. As their final year at junior high school progresses, the group overcome their challenges to mature and become aware of changes in themselves.", 7, 7, true, false, 0));
    }
}
