package com.example.goonsquad.goonsquadscouting;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import static com.example.goonsquad.goonsquadscouting.Global.*;

/**
 * A simple launcher activity containing a summary sample description, sample log and a custom
 * {@link android.support.v4.app.Fragment} which can display a view.
 * <p>
 * For devices with displays with a width of 720dp or greater, the sample log is always visible,
 * on other devices it's visibility is controlled by an item on the Action Bar.
 */


/**
 *
 * Todo verify team is valid and prompt them to change if not
 *
 */
public class clientSendInformationActivity extends AppCompatActivity {

    public static final String TAG = "ClientSendInfo";
    DatabaseHelper myDb;
    // Whether the Log Fragment is currently shown
    private boolean mLogShown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_send_information);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BluetoothChatFragment fragment = new BluetoothChatFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }

        /*

            Database stuff from here below

         */
        myDb = new DatabaseHelper(this);

        cargo_front_c = cs4Val + cs5Val;
        cargo_front_h = hs4Val + hs5Val;
        cargo_side_c = cs1Val + cs2Val + cs3Val + cs6Val + cs7Val + cs8Val;
        cargo_side_h = hs1Val + hs2Val + hs3Val + hs6Val + hs7Val + hs8Val;

        //If left 0, the first column/id should autoincrement
        myDb.insertLocal(teamId, matchId, level_1_cs,level_1_cf,
                level_2_cs, level_2_cf, level_3_cs, level_3_cf, ship_cs, ship_cf, level_1_hs, level_1_hf,
                level_2_hs, level_2_hf, level_3_hs, level_3_hf, ship_hs, ship_hf, rsh1, rsh2, rsh3,
                rsc1, rsc2, rsc3, cargo_front_c, cargo_front_h, cargo_side_c, cargo_side_h, habitatVal,
                assistedVal, levelClimbedVal, youAssistedVal, startingVal, leaveVal, defensePlayedVal, notes, defensePlayedOnVal);
/*
        Cursor cur = myDb.getAll();
        StringBuffer buffer = new StringBuffer();

        while(cur.moveToNext()) {
            buffer.append(cur.getString(0) + "\n");
            buffer.append(cur.getString(1) + "\n");
            buffer.append(cur.getString(2) + "\n");
            buffer.append(cur.getString(3) + "\n");
            buffer.append(cur.getString(4) + "\n");
            buffer.append(cur.getString(5) + "\n");
            buffer.append(cur.getString(6) + "\n");
            buffer.append(cur.getString(7) + "\n");
            buffer.append(cur.getString(8) + "\n");
            buffer.append(cur.getString(9) + "\n");
            buffer.append(cur.getString(10) + "\n");
            buffer.append(cur.getString(11) + "\n");
            buffer.append(cur.getString(12) + "\n");
            buffer.append(cur.getString(13) + "\n");
            buffer.append(cur.getString(14) + "\n");
            buffer.append(cur.getString(15) + "\n");
            buffer.append(cur.getString(16) + "\n");
            buffer.append(cur.getString(17) + "\n");
            buffer.append(cur.getString(18) + "\n");
            buffer.append(cur.getString(19) + "\n");
            buffer.append(cur.getString(20) + "\n");
            buffer.append(cur.getString(21) + "\n");
            buffer.append(cur.getString(22) + "\n");
            buffer.append(cur.getString(23) + "\n");
            buffer.append(cur.getString(24) + "\n");
            buffer.append(cur.getString(25) + "\n");
            buffer.append(cur.getString(25) + "\n");
            buffer.append(cur.getString(26) + "\n");
            buffer.append(cur.getString(27) + "\n");
            buffer.append(cur.getString(28) + "\n");
            buffer.append(cur.getString(29) + "\n");
            buffer.append(cur.getString(30) + "\n");
            buffer.append(cur.getString(31) + "\n");
            buffer.append(cur.getString(32) + "\n");
            buffer.append(cur.getString(33) + "\n");
            buffer.append(cur.getString(34) + "\n");
            buffer.append(cur.getString(35) + "\n");
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Test stuff");
        builder.setMessage(buffer);
        builder.show();
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
