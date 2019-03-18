package com.example.goonsquad.goonsquadscouting;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

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
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "You clicked tag: " + view.getTag(1), Toast.LENGTH_SHORT).show();

        RecyclerView allTeams = findViewById(R.id.eventTeamList);
        View row = allTeams.getLayoutManager().findViewByPosition(position);

        if(teamListColor.get(position).equals("0")) {

            TextView tv = row.findViewById(R.id.teamNum);
            teamListColor.set(position, "1");
            //tv.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            tv.setBackgroundColor(Color.RED);
            tv.setTextColor(Color.WHITE);
            adapter.notifyDataSetChanged();
        }
        else {
            TextView tv = row.findViewById(R.id.teamNum);
            teamListColor.set(position, "0");
            //tv.setPaintFlags(Paint.LINEAR_TEXT_FLAG);
            if(position % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#DCDCDC"));
            else
                tv.setBackgroundColor(Color.WHITE);
            tv.setTextColor(Color.parseColor("#737373"));
            adapter.notifyDataSetChanged();
        }
    }
}