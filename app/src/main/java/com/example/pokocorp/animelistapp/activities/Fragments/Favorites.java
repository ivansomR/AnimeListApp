package com.example.pokocorp.animelistapp.activities.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Adapters.RecyclerViewAdapterFav;
import com.example.pokocorp.animelistapp.activities.Adapters.RecyclerViewAdapterLinear;
import com.example.pokocorp.animelistapp.activities.Models.Anime;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class Favorites extends Fragment {
    private LinearLayoutManager layoutManager;
    public ArrayList<Anime> animes;
    @BindView(R.id.RV_anime_favorites)
    RecyclerView animeList;

    public Favorites() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorites, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        layoutManager = new LinearLayoutManager(this.getContext());

        animeList.setHasFixedSize(true);
        animeList.setLayoutManager(layoutManager);

        RecyclerViewAdapterFav adapter = new RecyclerViewAdapterFav(getContext(), animes);
        animeList.setAdapter(adapter);
        return view;
    }

    private void initializeData() {

        animes = new ArrayList<>();
        animes.add(new Anime(R.drawable.codegeass2, "Code Geass: R2", "Code Geass: Lelouch of the Rebellion R2", "TV", "Action, Military, Sci-Fi, Super Power, Drama, Mecha", "One year has passed since the Black Rebellion, a failed uprising against the Holy Britannian Empire led by the masked vigilante Zero, who is now missing. At a loss without their revolutionary leader, Area 11's resistance group—the Black Knights—find themselves too powerless to combat the brutality inflicted upon the Elevens by Britannia, which has increased significantly in order to crush any hope of a future revolt. \n" + "\n" + "Lelouch Lamperouge, having lost all memory of his double life, is living peacefully alongside his friends as a high school student at Ashford Academy. His former partner C.C., unable to accept this turn of events, takes it upon herself to remind him of his past purpose, hoping that the mastermind Zero will rise once again to finish what he started, in this thrilling conclusion to the series.", 25, 9, true, true, 0));
        animes.add(new Anime(R.drawable.shingeki2, "Shingeki no Kyojin 2", "Shingeki no Kyojin Season 2", "TV", "Action, Adventure, Fantasy", "Second season of Shingeki no Kyojin.", 12, 8, false, false, 0));
        animes.add(new Anime(R.drawable.haikyuu3, "Haikyu!! 3", "Haikyu!! 3rd Season", "TV", "Comedy, Sports, Drama, School, Shounen", "The third season of Haikyuu!!", 10, 9, false, false, 0));
        animes.add(new Anime(R.drawable.dbs, "Dragon Ball Super", "Dragon Ball Super", "TV", "Action, Adventure, Comedy, Super Power, Martial Arts, Fantasy, Shounen", "Set just after the events of the Buu Saga of Dragon Ball Z, a deadly threat awakens once more. People lived in peace without knowing who the true heroes were during the devastating battle against Majin Buu. The powerful Dragon Balls have prevented any permanent damage, and our heroes also continue to live a normal life. In the far reaches of the universe, however, a powerful being awakens early from his slumber, curious about a prophecy of his defeat.\n" + "\n" + "Join Gokuu, Piccolo, Vegeta, Gohan, and the rest of the Dragon Ball crew as they tackle the strongest opponent they have ever faced. Beerus, the god of destruction, now sets his curious sights on Earth. Will the heroes save the day and prevent earth's destruction? Or will the whims of a bored god prove too powerful for the Saiyans? Gokuu faces impossible odds once more and fights for the safety of his loved ones and the planet.", 93, 7, false, false, 0));

    }

}
