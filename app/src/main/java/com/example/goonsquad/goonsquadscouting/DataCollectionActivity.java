package com.example.goonsquad.goonsquadscouting;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DataCollectionActivity extends AppCompatActivity {

    public static final String TAG = "ClientSendInfo";
    DatabaseHelper myDb;
    // Whether the Log Fragment is currently shown
    private boolean mLogShown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BluetoothServerFragment fragment = new BluetoothServerFragment();
            transaction.replace(R.id.sample_server_fragment, fragment);
            transaction.commit();
        }
    }
}
