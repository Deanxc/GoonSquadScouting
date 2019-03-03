package com.example.goonsquad.goonsquadscouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class settingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        final DatabaseHelper myDb = new DatabaseHelper(this);

        Button dbDelete = findViewById(R.id.button_delete);
        Button dbDeleteRow = findViewById(R.id.dbDeleteRow);

        dbDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                myDb.deleteDB(getApplicationContext());
            }
        });

        dbDeleteRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){

                if(view != null) {
                    TextView teamNum = findViewById(R.id.delete_team_num);
                    String team = teamNum.getText().toString();

                    TextView matchNum = findViewById(R.id.delete_match_num);
                    String match = matchNum.getText().toString();
                    Log.d("Team: ", team);
                    Log.d("Match: ", match);
                    myDb.deleteRow(team, match);
                }
            }
        });
    }
}
