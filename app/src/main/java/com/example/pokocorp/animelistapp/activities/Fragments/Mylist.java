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
    Anime anime;
    private LinearLayoutManager layoutManager;
    public ArrayList<Anime> animes;
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
        animes.add(new Anime(R.drawable.fukumenkeinoise, "Fuumenkei Noise", "Fuumenkei Noise", "TV", "Music, Romance, Shoujo", "Every day, a young girl wearing a mask stands by the beach and sings a nostalgic melody. After experiencing two sudden heart-wrenching partings when she was only a child, Nino Arisugawa has been singing her songs to the ocean, bound by a promise made with her two childhood friends—her first love, Momo Sakaki, and a boy who composed music, Kanade \"Yuzu\" Yuzuhira. Having never met each other, the boys both individually promised that if Nino was ever separated from them, her voice would be the beacon to reunite them once again.\n" + "\n" +"After six long years, destiny has finally placed Nino, Momo, and Yuzu in the same high school. However, the passage of time has changed many things in their lives—while Nino relentlessly attempts to fulfill her childhood promise with the boys, Yuzu's feelings for her from the past resurface, and Momo goes to great lengths to prevent a reunion with Nino. Through music, will they be able to mend their friendship and overcome all the feelings involved in this complicated love triangle?", 12, 6, false, false, 0));
        animes.add(new Anime(R.drawable.shingeki2, "Shingeki no Kyojin 2", "Shingeki no Kyojin Season 2", "TV", "Action, Adventure, Fantasy", "Second season of Shingeki no Kyojin.", 12, 8, false, false, 0));
        animes.add(new Anime(R.drawable.eromanga_sensei, "Eromanga-Sensei", "Eromanga-Sensei", "TV", "Comedy, Drama, Romance", "The \"new sibling romantic comedy\" revolves around Masamune Izumi, a light novel author in high school. Masamune's little sister is Sagiri, a shut-in girl who hasn't left her room for an entire year. She even forces her brother to make and bring her meals when she stomps the floor. Masamune wants his sister to leave her room, because the two of them are each other's only family.\n" + "\n" +"Masamune's novel illustrator, pen name \"Eromanga,\" draws extremely perverted drawings, and is very reliable. Masamune had never met his illustrator, and figured he was just a disgusting, perverted otaku. However, the truth is revealed... that his \"Eromanga-sensei\" is his own younger sister! To add to the chaos that erupts between the siblings, a beautiful, female, best-selling shoujo manga creator becomes their rival!", 12, 7, false, false, 0));
        animes.add(new Anime(R.drawable.dbs, "Dragon Ball Super", "Dragon Ball Super", "TV", "Action, Adventure, Comedy, Super Power, Martial Arts, Fantasy, Shounen", "Set just after the events of the Buu Saga of Dragon Ball Z, a deadly threat awakens once more. People lived in peace without knowing who the true heroes were during the devastating battle against Majin Buu. The powerful Dragon Balls have prevented any permanent damage, and our heroes also continue to live a normal life. In the far reaches of the universe, however, a powerful being awakens early from his slumber, curious about a prophecy of his defeat.\n" + "\n" + "Join Gokuu, Piccolo, Vegeta, Gohan, and the rest of the Dragon Ball crew as they tackle the strongest opponent they have ever faced. Beerus, the god of destruction, now sets his curious sights on Earth. Will the heroes save the day and prevent earth's destruction? Or will the whims of a bored god prove too powerful for the Saiyans? Gokuu faces impossible odds once more and fights for the safety of his loved ones and the planet.", 93, 7, false, false, 0));
    }

}
