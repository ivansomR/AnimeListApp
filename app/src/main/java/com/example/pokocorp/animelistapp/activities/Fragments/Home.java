package com.example.pokocorp.animelistapp.activities.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokocorp.animelistapp.R;
import com.example.pokocorp.animelistapp.activities.Adapters.RecyclerViewAdapterGrid;
import com.example.pokocorp.animelistapp.activities.Models.Anime;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private GridLayoutManager gLayout;
    @BindView(R.id.RV_anime_home)
    RecyclerView animeHome;
    private List<Anime> animes;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        gLayout = new GridLayoutManager(this.getContext(), 4);

        animeHome.setHasFixedSize(true);
        animeHome.setLayoutManager(gLayout);

        RecyclerViewAdapterGrid rcAdapter = new RecyclerViewAdapterGrid(getContext(), animes);
        animeHome.setAdapter(rcAdapter);

        return view;
    }

    private void initializeData() {

        animes = new ArrayList<>();
        animes.add(new Anime(R.drawable.ansatsu, "Ansatsu Kyoushitsu","Ansatsu Kyoushitsu", "TV", "Action, Comedy, School, Shounen", "When a mysterious creature chops the moon down to a permanent crescent, the students of class 3-E of Kunugigaoka Middle School find themselves confronted with an enormous task: assassinate the creature responsible for the disaster before Earth suffers a similar fate. However, the monster, dubbed Koro-sensei (the indestructible teacher), is able to fly at speeds of up to Mach 20, which he demonstrates freely, leaving any attempt to subdue him in his extraterrestrial dust. Furthermore, the misfits of 3-E soon find that the strange, tentacled beast is more than just indomitable—he is the best teacher they have ever had!", 22, 8, false, false, 0));
        animes.add(new Anime(R.drawable.clockwork, "Clockwork Planet", "Clockwork Planet", "TV", "Sci-Fi, Fantasy", "One day, a black box suddenly crashed into the house of the high school dropout Naoto Miura. Inside it was a female automaton. The endless cycle of failure and success.\n" + "\n" + "The world that does change and the mankind that does not change. At a time where reality and fantasy are screaming, the encounters of these two make the gears of fate move!", 12, 6, false, false, 0));
        animes.add(new Anime(R.drawable.codegeass2, "Code Geass: R2", "Code Geass: Lelouch of the Rebellion R2", "TV", "Action, Military, Sci-Fi, Super Power, Drama, Mecha", "One year has passed since the Black Rebellion, a failed uprising against the Holy Britannian Empire led by the masked vigilante Zero, who is now missing. At a loss without their revolutionary leader, Area 11's resistance group—the Black Knights—find themselves too powerless to combat the brutality inflicted upon the Elevens by Britannia, which has increased significantly in order to crush any hope of a future revolt. \n" + "\n" + "Lelouch Lamperouge, having lost all memory of his double life, is living peacefully alongside his friends as a high school student at Ashford Academy. His former partner C.C., unable to accept this turn of events, takes it upon herself to remind him of his past purpose, hoping that the mastermind Zero will rise once again to finish what he started, in this thrilling conclusion to the series.", 25, 9, false, false, 0));
        animes.add(new Anime(R.drawable.dbs, "Dragon Ball Super", "Dragon Ball Super", "TV", "Action, Adventure, Comedy, Super Power, Martial Arts, Fantasy, Shounen", "Set just after the events of the Buu Saga of Dragon Ball Z, a deadly threat awakens once more. People lived in peace without knowing who the true heroes were during the devastating battle against Majin Buu. The powerful Dragon Balls have prevented any permanent damage, and our heroes also continue to live a normal life. In the far reaches of the universe, however, a powerful being awakens early from his slumber, curious about a prophecy of his defeat.\n" + "\n" + "Join Gokuu, Piccolo, Vegeta, Gohan, and the rest of the Dragon Ball crew as they tackle the strongest opponent they have ever faced. Beerus, the god of destruction, now sets his curious sights on Earth. Will the heroes save the day and prevent earth's destruction? Or will the whims of a bored god prove too powerful for the Saiyans? Gokuu faces impossible odds once more and fights for the safety of his loved ones and the planet.", 93, 7, false, false, 0));
        animes.add(new Anime(R.drawable.dungeonnideia, "Danmachi Oratoria", "Danmachi Sword Oratoria", "TV", "Action, Adventure, Fantasy", "Sword princess Aiz Wallenstein. Today, once again, the strongest female swordsman heads to the giant labyrinth known as the \"Dungeon\" along with her allies. On the 50th floor where mysteries and threats such as a decayed dragon's corpse that crumbles to ash and an irregularity that creeps ever closer to the party loom, Aiz calls for the wind and heads deeper into the darkness of the Dungeon. Eventually, she finds herself meeting a boy for the first time. \"Um, are you OK?\" In the Labyrinth City of Orario, the contrasting stories of the boy and the girl intersect!", 12, 7, false, false, 0));

    }

}
