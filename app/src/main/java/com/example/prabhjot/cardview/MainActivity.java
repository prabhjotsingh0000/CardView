package com.example.prabhjot.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Card> cardsList = new ArrayList<>();
        RecyclerView recyclerView;
        CardAdapter mAdapter;

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter= new CardAdapter(cardsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);


            Card card = new Card("Hydrochlorothiazide","","25 MG", "1 Tablet", "Two times a day",
                    "Per Oral", "5 Days", "After Food",false);
            cardsList.add(card);

            card = new Card("Tessalon Perles","Single Dose","100 MG", "1 Tablet", "",
                "Per Oral", "", "Immediate",true);

            cardsList.add(card);

            card = new Card("Hydrochlorothiazide","","25 MG", "1 Tablet", "Two times a day",
                "Per Oral", "5 Days", "After Food",false);
            cardsList.add(card);

            card = new Card("Tessalon Perles","Single Dose","100 MG", "1 Tablet", "",
                "Per Oral", "", "Immediate",true);

            cardsList.add(card);

    }
}
