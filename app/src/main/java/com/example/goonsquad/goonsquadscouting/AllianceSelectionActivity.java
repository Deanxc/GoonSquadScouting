package com.example.goonsquad.goonsquadscouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.Iterator;

import static com.example.goonsquad.goonsquadscouting.Global.*;

public class AllianceSelectionActivity extends AppCompatActivity implements TeamAdapter.ItemClickListener{

    TeamAdapter adapter;
    TeamAdapter adapter1;
    TeamAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alliance_selection);
//All team view
        RecyclerView allTeams = findViewById(R.id.eventTeamList);
        allTeams.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TeamAdapter(this,teamList);
        adapter.setClickListener(this);
        allTeams.setAdapter(adapter);
//first pick view
        RecyclerView first = findViewById(R.id.firstPickView);
        first.setLayoutManager(new LinearLayoutManager(this));
        adapter1 = new TeamAdapter(this,firstPick);
        adapter1.setClickListener(this);
        first.setAdapter(adapter1);
//second pick view
        RecyclerView second = findViewById(R.id.secondPickView);
        second.setLayoutManager(new LinearLayoutManager(this));
        adapter2 = new TeamAdapter(this, secondPick);
        adapter2.setClickListener(this);
        second.setAdapter(adapter2);
    }

    @Override
    public void onItemClick(View view, int position) {

        view.getTag();
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "You clicked tag: " + view.getTag(1), Toast.LENGTH_SHORT).show();

        Iterator itr = firstPick.iterator();
        while (itr.hasNext())
        {
            String x = (String) itr.next();
            int i = Integer.parseInt(x);
            if (x.equals(adapter1.getItem(position)))
                itr.remove();
                adapter1.notifyItemRemoved(position);
        }
    }
}