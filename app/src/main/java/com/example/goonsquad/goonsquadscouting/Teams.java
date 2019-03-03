package com.example.goonsquad.goonsquadscouting;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Teams")
public class Teams {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Team Number")
    private int teamNumber;

    @ColumnInfo(name = "Match #1")
    private int matchNumber1;
    /*
    private int matchNumber2;
    private int matchNumber3;
    private int matchNumber4;
    private int matchNumber5;
    private int matchNumber6;
    private int matchNumber7;
    private int matchNumber8;
    private int matchNumber9;
    private int matchNumber10;
    private int matchNumber11;
    private int matchNumber12;
    */
    @ColumnInfo(name = "Wins")
    private int wins;

    @ColumnInfo(name = "Losses")
    private int losses;

    @ColumnInfo(name = "Picture Location")
    private String picLocation;


    public Teams(@NonNull int teamNumber)
    {
        this.teamNumber = teamNumber;
        this.matchNumber1 = 0;
        /*
        this.matchNumber2 = 0;
        this.matchNumber3 = 0;
        this.matchNumber4 = 0;
        this.matchNumber5 = 0;
        this.matchNumber6 = 0;
        this.matchNumber7 = 0;
        this.matchNumber8 = 0;
        this.matchNumber9 = 0;
        this.matchNumber10 = 0;
        this.matchNumber11 = 0;
        this.matchNumber12 = 0;
        */
        this.wins = 0;
        this.losses = 0;
        this.picLocation = null;

    }

    public int getTeamNumber() {
        return this.teamNumber;
    }

    public int getMatchNumber1() {
        return this.matchNumber1;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public String getPicLocation() {
        return this.picLocation;
    }

    public void setTeamNumber(int teamNum) {
        this.teamNumber = teamNum;
    }

    public void setMatchNumber1(int matchNum) {
        this.matchNumber1 = matchNum;
    }

    public void setWins(int Win) {
        this.wins = Win;
    }

    public void setLosses(int Loss) {
        this.losses = Loss;
    }

    public void setPicLocation(String picLoc) {
        this.picLocation = picLoc;
    }
}
