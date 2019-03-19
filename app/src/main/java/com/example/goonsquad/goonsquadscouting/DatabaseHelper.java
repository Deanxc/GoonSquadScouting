package com.example.goonsquad.goonsquadscouting;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static com.example.goonsquad.goonsquadscouting.Global.*;



public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Table_Match_Creation_Query);
    }

    public void deleteDB(Context context) {
        context.deleteDatabase(DATABASE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MATCH_STATS);
        onCreate(db);
    }

    public boolean insertLocal(int Team_id, int Match_id, int col3, int col4, int col5,
                               int col6, int col7, int col8, int col9, int col10, int col11,
                               int col12, int col13, int col14, int col15, int col16, int col17,
                               int col18, int col19, int col20, int col21, int col22, int col23,
                               int col24, int col29, int col30, int col31, int col32, int col33,
                               int col34, int col35, int col36, int col37, int col38, int col39,
                               String col40, int col41) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        //contentValues.put(COL_L0, id);
        contentValues.put(COL_L1, Team_id);
        contentValues.put(COL_L2, Match_id);
        contentValues.put(COL_L3, col3);
        contentValues.put(COL_L4, col4);
        contentValues.put(COL_L5, col5);
        contentValues.put(COL_L6, col6);
        contentValues.put(COL_L7, col7);
        contentValues.put(COL_L8, col8);
        contentValues.put(COL_L9, col9);
        contentValues.put(COL_L10, col10);
        contentValues.put(COL_L11, col11);
        contentValues.put(COL_L12, col12);
        contentValues.put(COL_L13, col13);
        contentValues.put(COL_L14, col14);
        contentValues.put(COL_L15, col15);
        contentValues.put(COL_L16, col16);
        contentValues.put(COL_L17, col17);
        contentValues.put(COL_L18, col18);
        contentValues.put(COL_L19, col19);
        contentValues.put(COL_L20, col20);
        contentValues.put(COL_L21, col21);
        contentValues.put(COL_L22, col22);
        contentValues.put(COL_L23, col23);
        contentValues.put(COL_L24, col24);
        contentValues.put(COL_L29, col29);
        contentValues.put(COL_L30, col30);
        contentValues.put(COL_L31, col31);
        contentValues.put(COL_L32, col32);
        contentValues.put(COL_L33, col33);
        contentValues.put(COL_L34, col34);
        contentValues.put(COL_L35, col35);
        contentValues.put(COL_L36, col36);
        contentValues.put(COL_L37, col37);
        contentValues.put(COL_L38, col38);
        contentValues.put(COL_L39, col39);
        contentValues.put(COL_L40, col40);
        contentValues.put(COL_L41, col41);

        long result = db.insert(TABLE_MATCH_STATS, null, contentValues);
        return result != -1;

    }

    public Cursor getAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("select * from " + TABLE_MATCH_STATS, null);
    }

    public int getNumOfMatches(int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L1 + " from " + TABLE_MATCH_STATS + " where " + COL_L1 + " = " + teamNum;
        Cursor cur = db.rawQuery(query, null);
        Log.d("Team get count", Integer.toString(cur.getCount()));
        return cur.getCount();
    }

    public String getNumOfLeaveHab(int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L38 + ", " + COL_L37 + " from " + TABLE_MATCH_STATS + " where " + COL_L1 + " = " + teamNum + " AND " + COL_L38 + " = 1";
        Cursor cur = db.rawQuery(query, null);

        int lvl1 = 0;
        int lvl2 = 0;

        while(cur.moveToNext()) {
            if(cur.getString(1).equals("1")) {
                lvl1++;
            }
            else if(cur.getString(1).equals("2")) {
                lvl2++;
            }
        }
        String send = lvl1 + "/" + lvl2;
        Log.d("Num of lvl 1/2 Cross: ", send);
        return send;
    }

    public String getNumofCargo(int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L3 + ", " +
                COL_L5 + ", " + COL_L7 + ", " +
                COL_L9 + ", " + COL_L22 + ", " +
                COL_L23 + ", " + COL_L24 + ", " +
                COL_L29 + ", " + COL_L31 +
                " from " + TABLE_MATCH_STATS + " where " + COL_L1 + " = " + teamNum;
        Cursor cur = db.rawQuery(query, null);
        int cargoCount = 0;
        while(cur.moveToNext()){
            cargoCount += Integer.valueOf(cur.getString(0));
            cargoCount += Integer.valueOf(cur.getString(1));
            cargoCount += Integer.valueOf(cur.getString(2));
            cargoCount += Integer.valueOf(cur.getString(3));
            cargoCount += Integer.valueOf(cur.getString(4));
            cargoCount += Integer.valueOf(cur.getString(5));
            cargoCount += Integer.valueOf(cur.getString(6));
            cargoCount += Integer.valueOf(cur.getString(7));
            cargoCount += Integer.valueOf(cur.getString(8));

        }
        if(cur.getCount() > 0)
            cargoCount = cargoCount/cur.getCount();
        Log.d("Number of Cargo: ", Integer.toString(cargoCount));
        DecimalFormat form =  new DecimalFormat("#.0");
        //cargoCount = Integer.parseInt(form.format(cargoCount));
        return form.format(cargoCount);
    }

    public String getNumOfHatchPanels(int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L11 + ", " +
                COL_L13 + ", " + COL_L15 + ", " +
                COL_L17 + ", " + COL_L19 + ", " +
                COL_L20 + ", " + COL_L21 + ", " +
                COL_L30 + ", " + COL_L32 +
                " from " + TABLE_MATCH_STATS + " where " + COL_L1 + " = " + teamNum;
        Cursor cur = db.rawQuery(query, null);
        int hatchCount = 0;
        while(cur.moveToNext()){
            hatchCount += Integer.valueOf(cur.getString(0));
            hatchCount += Integer.valueOf(cur.getString(1));
            hatchCount += Integer.valueOf(cur.getString(2));
            hatchCount += Integer.valueOf(cur.getString(3));
            hatchCount += Integer.valueOf(cur.getString(4));
            hatchCount += Integer.valueOf(cur.getString(5));
            hatchCount += Integer.valueOf(cur.getString(6));
            hatchCount += Integer.valueOf(cur.getString(7));
            hatchCount += Integer.valueOf(cur.getString(8));

        }
        if(cur.getCount() > 0)
            hatchCount = hatchCount/cur.getCount();
        Log.d("Number of Hatch: ", Integer.toString(hatchCount));
        DecimalFormat form =  new DecimalFormat("#.0");
        //hatchCount = Integer.parseInt(form.format(hatchCount));

        return form.format(hatchCount);
    }

    public String getNumOfHatchandCargo (int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L5 + ", " +
                COL_L7 + ", " + COL_L13 + ", " +
                COL_L15 + ", " + COL_L20 + ", " +
                COL_L21 + ", " + COL_L23 + ", " +
                COL_L24 +
                " from " + TABLE_MATCH_STATS + " where " + COL_L1 + " = " + teamNum;
        Cursor cur = db.rawQuery(query, null);
        double hcCountlvl2 = 0;
        double hcCountlvl3 = 0;
        while(cur.moveToNext()){

            hcCountlvl2 += Integer.valueOf(cur.getString(0));
            hcCountlvl3 += Integer.valueOf(cur.getString(1));
            hcCountlvl2 += Integer.valueOf(cur.getString(2));
            hcCountlvl3 += Integer.valueOf(cur.getString(3));
            hcCountlvl2 += Integer.valueOf(cur.getString(4));
            hcCountlvl3 += Integer.valueOf(cur.getString(5));
            hcCountlvl2 += Integer.valueOf(cur.getString(6));
            hcCountlvl3 += Integer.valueOf(cur.getString(7));
        }
        if(cur.getCount() > 0) {
            hcCountlvl2 = hcCountlvl2 / cur.getCount();
            hcCountlvl3 = hcCountlvl3 / cur.getCount();
        }
        DecimalFormat form =  new DecimalFormat("#.0");
        String send = form.format(hcCountlvl2) + "/" + form.format(hcCountlvl3);
        Log.d("Number of HC: ", send);
        return send;
    }

    public String getNumOfClimb (int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L35 + " from " + TABLE_MATCH_STATS +
                " where " + COL_L35 + " > 0 " + " and " + COL_L1 + " = " + teamNum;
        Cursor cur = db.rawQuery(query, null);

        int lvl1 = 0;
        int lvl2 = 0;
        int lvl3 = 0;

        while(cur.moveToNext()) {
            if(cur.getString(0).equals("1")){
                lvl1++;
            }
            else if(cur.getString(0).equals("2")) {
                lvl2++;
            }
            else if(cur.getString(0).equals("3")) {
                lvl3++;
            }
        }

        String send = lvl1 + "/" + lvl2 + "/" + lvl3;
        Log.d("Num of climb: ", send);
        return send;
    }

    public int getNumDefensePlayed (int teamNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "select " + COL_L39 + " from " + TABLE_MATCH_STATS +
                " where " + COL_L39 + " = 1 " + " and " + COL_L1 + " = " + teamNum;
        Cursor cur = db.rawQuery(query, null);
        Log.d("Num of defense: ", Integer.toString(cur.getCount()));
        return cur.getCount();
    }

    public void deleteRow (int teamNum, int matchNum) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "delete" + " from " + TABLE_MATCH_STATS +
                " where " + COL_L1 + " = " + teamNum + " and " + COL_L2 + " = " + matchNum;
        Cursor cur = db.rawQuery(query, null);
        Log.d("Query :", query);
        Log.d("Deleting Row", Integer.toString(cur.getCount()));
    }
}