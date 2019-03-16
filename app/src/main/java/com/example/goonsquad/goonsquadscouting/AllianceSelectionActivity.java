package com.example.goonsquad.goonsquadscouting;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "You clicked tag: " + view.getTag(1), Toast.LENGTH_SHORT).show();

        RecyclerView allTeams = findViewById(R.id.eventTeamList);
        View row = allTeams.getLayoutManager().findViewByPosition(position);

        TextView tv = row.findViewById(R.id.teamNum);
        tv.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        adapter.notifyDataSetChanged();

        //Changes
        /*
        Iterator itr = teamList.iterator();
        while (itr.hasNext())
        {
            String x = (String) itr.next();
            if (x.equals(adapter.getItem(position))) {

                TextView tv = findViewById(R.id.teamNum);
                tv.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                adapter.removeItem(position);
                adapter.notifyItemRemoved(position);

                adapter.addItem(x);
                adapter.notifyDataSetChanged();

                RecyclerView allTeams = findViewById(R.id.eventTeamList);
                Log.d("Position", "Position: "+(adapter.getItemCount()-1));

                for(int i = 1; i < rowCount+1; i++ ) {
                    try {
                        RecyclerView.ViewHolder hold = allTeams.findViewHolderForLayoutPosition(adapter.getItemCount() - i);
                        hold.itemView.setBackgroundColor(Color.RED);
                    }
                    catch(NullPointerException e){
                        Log.d("Position", "Position: "+(adapter.getItemCount()));
                    }

                }
                adapter.notifyDataSetChanged();

                break;

            }
        }
        */
    }
}