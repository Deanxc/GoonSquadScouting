package com.example.goonsquad.goonsquadscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toServer(View view){
        //Changes activity to password required activity to go to server portion of code
        //No information needs to be carried over to other portions of the app
        Intent intent = new Intent(this, ServerLoginActivity.class);
        startActivity(intent);
    }

    public void toClient(View view){
        //Changes activity to form/client portion of app to
        //No information needs to be carried over to other portions of the app
        Intent intent = new Intent(this, ClientActivity.class);
        startActivity(intent);
    }
}
