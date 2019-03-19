package com.example.goonsquad.goonsquadscouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ShowDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Button red1 = (Button) findViewById(R.id.submit_team_r1);
        Button red2 = (Button) findViewById(R.id.submit_team_r2);
        Button red3 = (Button) findViewById(R.id.submit_team_r3);
        Button blue1 = (Button) findViewById(R.id.submit_team_b1);
        Button blue2 = (Button) findViewById(R.id.submit_team_b2);
        Button blue3 = (Button) findViewById(R.id.submit_team_b3);

        red1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widget
                View view = findViewById(R.id.show_grid);
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                if (null != view) {

                    DecimalFormat numberFormat = new DecimalFormat("#.00");

                    //perform all queries, then change views
                    TextView text = findViewById(R.id.enter_team_num_r1);
                    int teamNum = Integer.parseInt(text.getText().toString());
                    int numOfMatches = myDb.getNumOfMatches(teamNum);
                    String lvlCross = myDb.getNumOfLeaveHab(teamNum);
                    String avgHatch = myDb.getNumOfHatchPanels(teamNum);
                    String avgCargo = myDb.getNumofCargo(teamNum);
                    String highHP3 = myDb.getNumOfHatchandCargo(teamNum);
                    String climb = myDb.getNumOfClimb(teamNum);
                    int defense = myDb.getNumDefensePlayed(teamNum);

                    TextView viewToChange = view.findViewById(R.id.show_num_of_matches_r1);
                    viewToChange.setText(Integer.toString(numOfMatches));
                    viewToChange = view.findViewById(R.id.show_num_of_cross_r1);
                    viewToChange.setText(lvlCross);
                    viewToChange = view.findViewById(R.id.show_avg_of_hp_r1);
                    viewToChange.setText(avgHatch);
                    viewToChange = view.findViewById(R.id.show_avg_of_c_r1);
                    viewToChange.setText(avgCargo);
                    viewToChange = view.findViewById(R.id.show_avg_RS_HPC_r1);
                    viewToChange.setText(highHP3);
                    viewToChange = view.findViewById(R.id.show_num_of_climb_r1);
                    viewToChange.setText(climb);
                    viewToChange = view.findViewById(R.id.show_num_of_defense_r1);
                    viewToChange.setText(Integer.toString(defense));
                }
            }
        });

        red2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widget
                View view = findViewById(R.id.show_grid);
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                if (null != view) {
                    //perform all queries, then change views
                    TextView text = findViewById(R.id.enter_team_num_r2);
                    int teamNum = Integer.parseInt(text.getText().toString());
                    int numOfMatches = myDb.getNumOfMatches(teamNum);
                    String lvlCross = myDb.getNumOfLeaveHab(teamNum);
                    String avgHatch = myDb.getNumOfHatchPanels(teamNum);
                    String avgCargo = myDb.getNumofCargo(teamNum);
                    String highHP3 = myDb.getNumOfHatchandCargo(teamNum);
                    String climb = myDb.getNumOfClimb(teamNum);
                    int defense = myDb.getNumDefensePlayed(teamNum);


                    TextView viewToChange = view.findViewById(R.id.show_num_of_matches_r2);
                    viewToChange.setText(Integer.toString(numOfMatches));
                    viewToChange = view.findViewById(R.id.show_num_of_cross_r2);
                    viewToChange.setText(lvlCross);
                    viewToChange = view.findViewById(R.id.show_avg_of_hp_r2);
                    viewToChange.setText(avgHatch);
                    viewToChange = view.findViewById(R.id.show_avg_of_c_r2);
                    viewToChange.setText(avgCargo);
                    viewToChange = view.findViewById(R.id.show_avg_RS_HPC_r2);
                    viewToChange.setText(highHP3);
                    viewToChange = view.findViewById(R.id.show_num_of_climb_r2);
                    viewToChange.setText(climb);
                    viewToChange = view.findViewById(R.id.show_num_of_defense_r2);
                    viewToChange.setText(Integer.toString(defense));
                }
            }
        });

        red3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widget
                View view = findViewById(R.id.show_grid);
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                if (null != view) {
                    //perform all queries, then change views
                    TextView text = findViewById(R.id.enter_team_num_r3);
                    int teamNum = Integer.parseInt(text.getText().toString());
                    int numOfMatches = myDb.getNumOfMatches(teamNum);
                    String lvlCross = myDb.getNumOfLeaveHab(teamNum);
                    String avgHatch = myDb.getNumOfHatchPanels(teamNum);
                    String avgCargo = myDb.getNumofCargo(teamNum);
                    String highHP3 = myDb.getNumOfHatchandCargo(teamNum);
                    String climb = myDb.getNumOfClimb(teamNum);
                    int defense = myDb.getNumDefensePlayed(teamNum);

                    TextView viewToChange = view.findViewById(R.id.show_num_of_matches_r3);
                    viewToChange.setText(Integer.toString(numOfMatches));
                    viewToChange = view.findViewById(R.id.show_num_of_cross_r3);
                    viewToChange.setText(lvlCross);
                    viewToChange = view.findViewById(R.id.show_avg_of_hp_r3);
                    viewToChange.setText(avgHatch);
                    viewToChange = view.findViewById(R.id.show_avg_of_c_r3);
                    viewToChange.setText(avgCargo);
                    viewToChange = view.findViewById(R.id.show_avg_RS_HPC_r3);
                    viewToChange.setText(highHP3);
                    viewToChange = view.findViewById(R.id.show_num_of_climb_r3);
                    viewToChange.setText(climb);
                    viewToChange = view.findViewById(R.id.show_num_of_defense_r3);
                    viewToChange.setText(Integer.toString(defense));
                }
            }
        });

        blue1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widget
                View view = findViewById(R.id.show_grid);
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                if (null != view) {
                    //perform all queries, then change views
                    TextView text = findViewById(R.id.enter_team_num_b1);
                    int teamNum = Integer.parseInt(text.getText().toString());
                    int numOfMatches = myDb.getNumOfMatches(teamNum);
                    String lvlCross = myDb.getNumOfLeaveHab(teamNum);
                    String avgHatch = myDb.getNumOfHatchPanels(teamNum);
                    String avgCargo = myDb.getNumofCargo(teamNum);
                    String highHP3 = myDb.getNumOfHatchandCargo(teamNum);
                    String climb = myDb.getNumOfClimb(teamNum);
                    int defense = myDb.getNumDefensePlayed(teamNum);


                    TextView viewToChange = view.findViewById(R.id.show_num_of_matches_b1);
                    viewToChange.setText(Integer.toString(numOfMatches));
                    viewToChange = view.findViewById(R.id.show_num_of_cross_b1);
                    viewToChange.setText(lvlCross);
                    viewToChange = view.findViewById(R.id.show_avg_of_hp_b1);
                    viewToChange.setText(avgHatch);
                    viewToChange = view.findViewById(R.id.show_avg_of_c_b1);
                    viewToChange.setText(avgCargo);
                    viewToChange = view.findViewById(R.id.show_avg_RS_HPC_b1);
                    viewToChange.setText(highHP3);
                    viewToChange = view.findViewById(R.id.show_num_of_climb_b1);
                    viewToChange.setText(climb);
                    viewToChange = view.findViewById(R.id.show_num_of_defense_b1);
                    viewToChange.setText(Integer.toString(defense));
                }
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widget
                View view = findViewById(R.id.show_grid);
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                if (null != view) {
                    //perform all queries, then change views
                    TextView text = findViewById(R.id.enter_team_num_b2);
                    int teamNum = Integer.parseInt(text.getText().toString());
                    int numOfMatches = myDb.getNumOfMatches(teamNum);
                    String lvlCross = myDb.getNumOfLeaveHab(teamNum);
                    String avgHatch = myDb.getNumOfHatchPanels(teamNum);
                    String avgCargo = myDb.getNumofCargo(teamNum);
                    String highHP3 = myDb.getNumOfHatchandCargo(teamNum);
                    String climb = myDb.getNumOfClimb(teamNum);
                    int defense = myDb.getNumDefensePlayed(teamNum);


                    TextView viewToChange = view.findViewById(R.id.show_num_of_matches_b2);
                    viewToChange.setText(Integer.toString(numOfMatches));
                    viewToChange = view.findViewById(R.id.show_num_of_cross_b2);
                    viewToChange.setText(lvlCross);
                    viewToChange = view.findViewById(R.id.show_avg_of_hp_b2);
                    viewToChange.setText(avgHatch);
                    viewToChange = view.findViewById(R.id.show_avg_of_c_b2);
                    viewToChange.setText(avgCargo);
                    viewToChange = view.findViewById(R.id.show_avg_RS_HPC_b2);
                    viewToChange.setText(highHP3);
                    viewToChange = view.findViewById(R.id.show_num_of_climb_b2);
                    viewToChange.setText(climb);
                    viewToChange = view.findViewById(R.id.show_num_of_defense_b2);
                    viewToChange.setText(Integer.toString(defense));
                }
            }
        });

        blue3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widget
                View view = findViewById(R.id.show_grid);
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                if (null != view) {
                    //perform all queries, then change views
                    TextView text = findViewById(R.id.enter_team_num_b3);
                    int teamNum = Integer.parseInt(text.getText().toString());
                    int numOfMatches = myDb.getNumOfMatches(teamNum);
                    String lvlCross = myDb.getNumOfLeaveHab(teamNum);
                    String avgHatch = myDb.getNumOfHatchPanels(teamNum);
                    String avgCargo = myDb.getNumofCargo(teamNum);
                    String highHP3 = myDb.getNumOfHatchandCargo(teamNum);
                    String climb = myDb.getNumOfClimb(teamNum);
                    int defense = myDb.getNumDefensePlayed(teamNum);

                    TextView viewToChange = view.findViewById(R.id.show_num_of_matches_b3);
                    viewToChange.setText(Integer.toString(numOfMatches));
                    viewToChange = view.findViewById(R.id.show_num_of_cross_b3);
                    viewToChange.setText(lvlCross);
                    viewToChange = view.findViewById(R.id.show_avg_of_hp_b3);
                    viewToChange.setText(avgHatch);
                    viewToChange = view.findViewById(R.id.show_avg_of_c_b3);
                    viewToChange.setText(avgCargo);
                    viewToChange = view.findViewById(R.id.show_avg_RS_HPC_b3);
                    viewToChange.setText(highHP3);
                    viewToChange = view.findViewById(R.id.show_num_of_climb_b3);
                    viewToChange.setText(climb);
                    viewToChange = view.findViewById(R.id.show_num_of_defense_b3);
                    viewToChange.setText(Integer.toString(defense));
                }
            }
        });
    }
}

