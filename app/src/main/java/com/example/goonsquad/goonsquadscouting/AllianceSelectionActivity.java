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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alliance_selection);

        //Gotta sort this team list first
        RecyclerView allTeams = findViewById(R.id.eventTeamList);
        allTeams.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TeamAdapter(this,teamList);
        adapter.setClickListener(this);
        allTeams.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {

        view.getTag();
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "You clicked tag: " + view.getTag(1), Toast.LENGTH_SHORT).show();

        Iterator itr = teamList.iterator();
        while (itr.hasNext())
        {
            String x = (String) itr.next();
            if (x.equals(adapter.getItem(position)))
                teamList.remove(position);
                adapter.notifyItemRemoved(position);
                break;
        }
    }
}