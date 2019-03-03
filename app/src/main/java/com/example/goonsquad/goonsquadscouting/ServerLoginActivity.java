package com.example.goonsquad.goonsquadscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ServerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_login);
    }

    public void checkPassword(View view) {

        EditText editText = findViewById(R.id.password);
        String enteredPassword = editText.getText().toString();

        if(enteredPassword.equals("")) {
            Intent intent = new Intent(this, ServerActivity.class);
            startActivity(intent);
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
