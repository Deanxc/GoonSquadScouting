package com.example.goonsquad.goonsquadscouting;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.goonsquad.goonsquadscouting.Global.*;


public class HCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc);

        Button team1 = (Button) findViewById(R.id.send_team1);
        Button team2 = (Button) findViewById(R.id.send_team2);

        team1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                TextView text = findViewById(R.id.hc_team1);
                int teamNum = Integer.parseInt(text.getText().toString());

                //gets hatches and match num per each match of entered team
                Cursor cur = myDb.getTeamHatchPanels(teamNum);

                int matchNum = 0;
                int count = 1;
                while(cur.moveToNext()){
                    int hatchCount = 0;
                    hatchCount += Integer.valueOf(cur.getString(0));
                    hatchCount += Integer.valueOf(cur.getString(1));
                    hatchCount += Integer.valueOf(cur.getString(2));
                    hatchCount += Integer.valueOf(cur.getString(3));
                    hatchCount += Integer.valueOf(cur.getString(4));
                    hatchCount += Integer.valueOf(cur.getString(5));
                    hatchCount += Integer.valueOf(cur.getString(6));
                    hatchCount += Integer.valueOf(cur.getString(7));
                    hatchCount += Integer.valueOf(cur.getString(8));
                    matchNum = Integer.valueOf(cur.getString(9));

                    String buttonID = "team1_hatch" + count;
                    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    TextView vi = ((TextView) findViewById(resID));
                    vi.setText(Integer.toString(hatchCount));

                    String matchID = "team1_match" + count;
                    resID = getResources().getIdentifier(matchID, "id", getPackageName());
                    vi = ((TextView) findViewById(resID));
                    vi.setText(Integer.toString(matchNum));

                    count++;
                }

                count = 1;

                cur = myDb.getTeamCargo(teamNum);
                while(cur.moveToNext()){
                    int cargoCount = 0;
                    cargoCount += Integer.valueOf(cur.getString(0));
                    cargoCount += Integer.valueOf(cur.getString(1));
                    cargoCount += Integer.valueOf(cur.getString(2));
                    cargoCount += Integer.valueOf(cur.getString(3));
                    cargoCount += Integer.valueOf(cur.getString(4));
                    cargoCount += Integer.valueOf(cur.getString(5));
                    cargoCount += Integer.valueOf(cur.getString(6));
                    cargoCount += Integer.valueOf(cur.getString(7));
                    cargoCount += Integer.valueOf(cur.getString(8));

                    String buttonID = "team1_cargo" + count;
                    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    TextView vi = ((TextView) findViewById(resID));
                    vi.setText(Integer.toString(cargoCount));
                    count++;

                }

                for(int i = count; i < 12; i++){
                    String buttonID = "team1_cargo" + count;
                    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    TextView vi = ((TextView) findViewById(resID));
                    vi.setText("0");

                    buttonID = "team1_hatch" + count;
                    resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    vi = ((TextView) findViewById(resID));
                    vi.setText("0");

                    String matchID = "team1_match" + count;
                    resID = getResources().getIdentifier(matchID, "id", getPackageName());
                    vi = ((TextView) findViewById(resID));
                    vi.setText("0");
                }
            }
        });

        team2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseHelper myDb = new DatabaseHelper(getApplicationContext());
                TextView text = findViewById(R.id.hc_team2);
                int teamNum = Integer.parseInt(text.getText().toString());

                //gets hatches and match num per each match of entered team
                Cursor cur = myDb.getTeamHatchPanels(teamNum);

                int matchNum = 0;
                int count = 1;
                while(cur.moveToNext()){
                    int hatchCount = 0;
                    hatchCount += Integer.valueOf(cur.getString(0));
                    hatchCount += Integer.valueOf(cur.getString(1));
                    hatchCount += Integer.valueOf(cur.getString(2));
                    hatchCount += Integer.valueOf(cur.getString(3));
                    hatchCount += Integer.valueOf(cur.getString(4));
                    hatchCount += Integer.valueOf(cur.getString(5));
                    hatchCount += Integer.valueOf(cur.getString(6));
                    hatchCount += Integer.valueOf(cur.getString(7));
                    hatchCount += Integer.valueOf(cur.getString(8));
                    matchNum = Integer.valueOf(cur.getString(9));

                    String buttonID = "team2_hatch" + count;
                    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    TextView vi = ((TextView) findViewById(resID));
                    vi.setText(Integer.toString(hatchCount));

                    String matchID = "team2_match" + count;
                    resID = getResources().getIdentifier(matchID, "id", getPackageName());
                    vi = ((TextView) findViewById(resID));
                    vi.setText(Integer.toString(matchNum));

                    count++;
                }

                count = 1;

                cur = myDb.getTeamCargo(teamNum);
                while(cur.moveToNext()){
                    int cargoCount = 0;
                    cargoCount += Integer.valueOf(cur.getString(0));
                    cargoCount += Integer.valueOf(cur.getString(1));
                    cargoCount += Integer.valueOf(cur.getString(2));
                    cargoCount += Integer.valueOf(cur.getString(3));
                    cargoCount += Integer.valueOf(cur.getString(4));
                    cargoCount += Integer.valueOf(cur.getString(5));
                    cargoCount += Integer.valueOf(cur.getString(6));
                    cargoCount += Integer.valueOf(cur.getString(7));
                    cargoCount += Integer.valueOf(cur.getString(8));

                    String buttonID = "team2_cargo" + count;
                    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    TextView vi = ((TextView) findViewById(resID));
                    vi.setText(Integer.toString(cargoCount));
                    count++;
                }

                for(int i = count; i < 12; i++){
                    String buttonID = "team2_cargo" + count;
                    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    TextView vi = ((TextView) findViewById(resID));
                    vi.setText("0");

                    buttonID = "team2_hatch" + count;
                    resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    vi = ((TextView) findViewById(resID));
                    vi.setText("0");

                    String matchID = "team2_match" + count;
                    resID = getResources().getIdentifier(matchID, "id", getPackageName());
                    vi = ((TextView) findViewById(resID));
                    vi.setText("0");
                }
            }
        });
    }
}
