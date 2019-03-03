package com.example.goonsquad.goonsquadscouting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import static com.example.goonsquad.goonsquadscouting.Global.*;

public class ClientActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener,
                                                                    SandstormFragment.OnFragmentInteractionListener,
                                                                    TeleopFragment.OnFragmentInteractionListener,
                                                                    NotesFragment.OnFragmentInteractionListener {

    //private TextView mTextMessage;
    final Fragment fragmentSandstorm = new SandstormFragment();
    final Fragment fragmentTeleop = new TeleopFragment();
    final Fragment fragmentInstructions = new NotesFragment();
    final FragmentManager manager = getSupportFragmentManager();
    Fragment active = fragmentSandstorm;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_sandstorm:
                    manager.beginTransaction().hide(active).show(fragmentSandstorm).commit();
                    active = fragmentSandstorm;
                    return true;
                case R.id.navigation_teleop_endgame:
                    manager.beginTransaction().hide(active).show(fragmentTeleop).commit();
                    active = fragmentTeleop;
                    return true;
                case R.id.navigation_instructions:
                    manager.beginTransaction().hide(active).show(fragmentInstructions).commit();
                    active = fragmentInstructions;
                    return true;
            }

            return false;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        manager.beginTransaction().add(R.id.client_container, fragmentInstructions, "3").hide(fragmentInstructions).commit();
        manager.beginTransaction().add(R.id.client_container, fragmentTeleop, "2").hide(fragmentTeleop).commit();
        manager.beginTransaction().add(R.id.client_container, fragmentSandstorm, "1").commit();

        //Rocket level 1
        //Success
        level_1_cs = 0;
        level_1_hs = 0;
        //Failure
        level_1_cf = 0;
        level_1_hf = 0;

        //Rocket level 2
        //Success
        level_2_cs = 0;
        level_2_hs = 0;
        //Failure
        level_2_cf = 0;
        level_2_hf = 0;

        //Rocket level 3
        //Success
        level_3_cs = 0;
        level_3_hs = 0;
        //Failure
        level_3_cf = 0;
        level_3_hf = 0;

        //Cargo ship
        //Success
        ship_cs = 0;
        ship_hs = 0;
        //Failure
        ship_cf = 0;
        ship_hf = 0;

        //Radio Button Groups
        //Habitat reached
        habitatVal = 0;

        //Were you assisted
        assistedVal = 0;

        //Level climbed too
        levelClimbedVal = 0;

        //Level you assisted someone too
        youAssistedVal = 0;

        //Defense
        defensePlayedVal = 0;

        teamId = null;
        matchId = null;
        sandstorm_cargo_text = "Cargo";
        sandstorm_hatch_text = "Hatch";

        //Switch variable
        isSwitched = false;

        //Cargo variables for the cargo ship in auton
        cs1Val = 0;
        cs2Val = 0;
        cs3Val = 0;
        cs6Val = 0;
        cs7Val = 0;
        cs8Val = 0;
        //Front of ship
        cs4Val = 0;
        cs5Val = 0;

        //Hatch panel variables for the cargo ship in auton
        hs1Val = 0;
        hs2Val = 0;
        hs3Val = 0;
        hs6Val = 0;
        hs7Val = 0;
        hs8Val = 0;
        //Front of ship
        hs4Val = 0;
        hs5Val = 0;

        //Combined cargo ship vals
        cargo_front_c = 0;
        cargo_front_h = 0;
        cargo_side_c = 0;
        cargo_side_h = 0;

        //Hatch panel variables for rocket ship
        rsh1 = 0;
        rsh2 = 0;
        rsh3 = 0;

        //Cargo variables for rocket ship
        rsc1 = 0;
        rsc2 = 0;
        rsc3 = 0;

        //Radio Button Groups
        //Starting level
        startingVal = 0;
        //leave Habitat
        leaveVal = 0;

        id = 0;
        notes = "None";
        input = "";


        Intent intent = getIntent();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public void onInstructionsFragmentInteraction(Uri uri) {

    }

    @Override
    public void onSandstormFragmentInteraction(Uri uri) {

    }

    @Override
    public void onTeleopFragmentInteraction(Uri uri) {

    }
}
