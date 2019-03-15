package com.example.goonsquad.goonsquadscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.goonsquad.goonsquadscouting.Global.*;


public class ServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        rowCount = 0;
        Intent intent = getIntent();
    }

    public void toDataCollect(View view) {
        Intent intent = new Intent(this, DataCollectionActivity.class);
        startActivity(intent);
    }

    public void toShowData(View view) {
        Intent intent = new Intent(this, ShowDataActivity.class);
        startActivity(intent);
    }

    public void toSetting(View view) {
        Intent intent = new Intent (this, SettingActivity.class);
        startActivity(intent);
    }

    public void toSelection(View view) {
        Intent intent = new Intent (this,AllianceSelectionActivity.class);
        startActivity(intent);
    }

}