package com.example.goonsquad.goonsquadscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

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
        Intent intent = new Intent (this, settingActivity.class);
        startActivity(intent);
    }

}
