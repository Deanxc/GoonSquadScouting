package com.example.goonsquad.goonsquadscouting;

 class Global {

    /**

        DATABASE TABLE Variables
     */

    static final String DATABASE_NAME = "scouting.db";

    static final String TABLE_MATCH_STATS = "matchTable";
    static final String COL_L0 = "id";
    static final String COL_L1 = "Team_id";
    static final String COL_L2 = "Match_id";

    //Teleop Rocket Column Names
     static final String COL_L3 = "TeleOp_cs1";
     static final String COL_L4 = "TeleOp_cf1";
     static final String COL_L5 = "TeleOp_cs2";
     static final String COL_L6 = "TeleOp_cf2";
     static final String COL_L7 = "TeleOp_cs3";
     static final String COL_L8 = "TeleOp_cf3";

     //////
     static final String COL_L9 = "TeleOp_cs";
     static final String COL_L10 = "TeleOp_cf";

     static final String COL_L11 = "TeleOp_hs1";
     static final String COL_L12 = "TeleOp_hf1";
     static final String COL_L13 = "TeleOp_hs2";
     static final String COL_L14 = "TeleOp_hf2";
     static final String COL_L15 = "TeleOp_hs3";
     static final String COL_L16 = "TeleOp_hf3";

     ////////
     static final String COL_L17 = "TeleOp_hs";
     static final String COL_L18 = "TeleOp_hf";

    //Sandstorm Rocket Column Names
     static final String COL_L19 = "Rocket_h1";
     static final String COL_L20 = "Rocket_h2";
     static final String COL_L21 = "Rocket_h3";

     static final String COL_L22 = "Rocket_c1";
     static final String COL_L23 = "Rocket_c2";
     static final String COL_L24 = "Rocket_c3";

    //Sandstorm Cargo Ship
     static final String COL_L29 = "CargoShip_front_c";
     static final String COL_L30 = "CargoShip_front_h";
     static final String COL_L31 = "CargoShip_Side_c";
     static final String COL_L32 = "CargoShip_Side_h";

    //Radio buttons
     static final String COL_L33 = "Habitat";
     static final String COL_L34 = "Assisted";
     static final String COL_L35 = "Level_Climbed";
     static final String COL_L36 = "You_Assisted";
     static final String COL_L37 = "Starting_Level";
     static final String COL_L38 = "Leave_Habitat";
     static final String COL_L40 = "Notes";
     static final String COL_L39 = "Defense_Played";


     static final String Table_Match_Creation_Query = "CREATE TABLE " + TABLE_MATCH_STATS + " ("
            + COL_L0 + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            + COL_L1 + " TEXT, "
            + COL_L2 + " TEXT, "
            + COL_L3 + " INTEGER, "
            + COL_L4 + " INTEGER, "
            + COL_L5 + " INTEGER, "
            + COL_L6 + " INTEGER, "
            + COL_L7 + " INTEGER, "
            + COL_L8 + " INTEGER, "
            + COL_L9 + " INTEGER, "
            + COL_L10 + " INTEGER, "
            + COL_L11 + " INTEGER, "
            + COL_L12 + " INTEGER, "
            + COL_L13 + " INTEGER, "
            + COL_L14 + " INTEGER, "
            + COL_L15 + " INTEGER, "
            + COL_L16 + " INTEGER, "
            + COL_L17 + " INTEGER, "
            + COL_L18 + " INTEGER, "
            + COL_L19 + " INTEGER, "
            + COL_L20 + " INTEGER, "
            + COL_L21 + " INTEGER, "
            + COL_L22 + " INTEGER, "
            + COL_L23 + " INTEGER, "
            + COL_L24 + " INTEGER, "
            + COL_L29 + " INTEGER, "
            + COL_L30 + " INTEGER, "
            + COL_L31 + " INTEGER, "
            + COL_L32 + " INTEGER, "
            + COL_L33 + " INTEGER, "
            + COL_L34 + " INTEGER, "
            + COL_L35 + " INTEGER, "
            + COL_L36 + " INTEGER, "
            + COL_L37 + " INTEGER, "
            + COL_L38 + " INTEGER, "
            + COL_L39 + " INTEGER, "
            + COL_L40 + " TEXT"
            + ")";


    /**
        TELEOP FRAGMENT VARIABLES
     */

    //Rocket level 1
    //Success
     static int level_1_cs = 0;
     static int level_1_hs = 0;
    //Failure
     static int level_1_cf = 0;
     static int level_1_hf = 0;

    //Rocket level 2
    //Success
     static int level_2_cs = 0;
     static int level_2_hs = 0;
    //Failure
     static int level_2_cf = 0;
     static int level_2_hf = 0;

    //Rocket level 3
    //Success
     static int level_3_cs = 0;
     static int level_3_hs = 0;
    //Failure
     static int level_3_cf = 0;
     static int level_3_hf = 0;

    //Cargo ship
    //Success
     static int ship_cs = 0;
     static int ship_hs = 0;
    //Failure
     static int ship_cf = 0;
     static int ship_hf = 0;

    //Radio Button Groups
    //Habitat reached
     static int habitatVal = 0;

    //Were you assisted
     static int assistedVal = 0;

    //Level climbed too
     static int levelClimbedVal = 0;

    //Level you assisted someone too
     static int youAssistedVal = 0;

     static int defensePlayedVal = 0;

    /**
        SANDSTORM FRAGMENT VARIABLES
     */

    //First activity variables
     static String teamId = null;
     static String matchId = null;
     static String sandstorm_cargo_text = "Cargo";
     static String sandstorm_hatch_text = "Hatch";

    //Switch variable
     static boolean isSwitched = false;

    //Cargo variables for the cargo ship in auton
     static int cs1Val = 0;
     static int cs2Val = 0;
     static int cs3Val = 0;
     static int cs6Val = 0;
     static int cs7Val = 0;
     static int cs8Val = 0;
        //Front of ship
     static int cs4Val = 0;
     static int cs5Val = 0;

    //Hatch panel variables for the cargo ship in auton
     static int hs1Val = 0;
     static int hs2Val = 0;
     static int hs3Val = 0;
     static int hs6Val = 0;
     static int hs7Val = 0;
     static int hs8Val = 0;
        //Front of ship
     static int hs4Val = 0;
     static int hs5Val = 0;

    //Combined cargo ship vals
     static int cargo_front_c = 0;
     static int cargo_front_h = 0;
     static int cargo_side_c = 0;
     static int cargo_side_h = 0;

    //Hatch panel variables for rocket ship
     static int rsh1 = 0;
     static int rsh2 = 0;
     static int rsh3 = 0;

    //Cargo variables for rocket ship
     static int rsc1 = 0;
     static int rsc2 = 0;
     static int rsc3 = 0;

    //Radio Button Groups
    //Starting level
    static int startingVal = 0;
    //leave Habitat
    static int leaveVal = 0;

    static int id = 0;
    static String notes = "None";
    static String input = "";


     /**

        Bluetooth stuff

      */
      static final int MESSAGE_STATE_CHANGE = 1;
      static final int MESSAGE_READ = 2;
      static final int MESSAGE_WRITE = 3;
      static final int MESSAGE_DEVICE_NAME = 4;
      static final int MESSAGE_TOAST = 5;

     // Key names received from the BluetoothChatService Handler
      static final String DEVICE_NAME = "device_name";
      static final String TOAST = "toast";

     //String that is sent from client side
     static String toSend = "";
}
