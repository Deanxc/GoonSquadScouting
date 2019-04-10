package com.example.goonsquad.goonsquadscouting;

import java.util.ArrayList;
import java.util.Arrays;

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
     static final String COL_L41 = "Defense_Played_On";


     static final String Table_Match_Creation_Query = "CREATE TABLE " + TABLE_MATCH_STATS + " ("
            + COL_L0 + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            + COL_L1 + " INTEGER, "
            + COL_L2 + " INTEGER, "
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
            + COL_L40 + " TEXT, "
            + COL_L41 + " INTEGER "
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
     static int defensePlayedOnVal = 0;

    /**
        SANDSTORM FRAGMENT VARIABLES
     */

    //First activity variables
     static int teamId = -1;
     static int matchId = -1;
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




    /**
     *
     * Current Team List Use REGEX
     *
     * Search for ([^,]*)(,|$)
     * Replace with "$1"$2,
     *
     * Currently set for Jackson 2019
     *
     */

    static ArrayList<String> teamList = new ArrayList<>(Arrays.asList(
            "27",
            "33",
            "51",
            "66",
            "67",
            "68",
            "85",
            "107",
            "123",
            "141",
            "217",
            "226",
            "245",
            "302",
            "308",
            "314",
            "494",
            "503",
            "548",
            "573",
            "862",
            "904",
            "910",
            "1023",
            "1025",
            "1076",
            "1188",
            "1189",
            "1250",
            "1322",
            "1481",
            "1506",
            "1596",
            "1684",
            "1718",
            "1918",
            "1940",
            "2048",
            "2054",
            "2075",
            "2137",
            "2224",
            "2337",
            "2474",
            "2586",
            "2611",
            "2619",
            "2767",
            "2771",
            "2832",
            "2834",
            "2851",
            "2959",
            "2960",
            "3175",
            "3357",
            "3414",
            "3452",
            "3458",
            "3534",
            "3536",
            "3538",
            "3542",
            "3546",
            "3572",
            "3602",
            "3603",
            "3604",
            "3618",
            "3620",
            "3641",
            "3655",
            "3656",
            "3667",
            "3688",
            "3707",
            "3767",
            "3770",
            "3875",
            "4003",
            "4004",
            "4130",
            "4216",
            "4325",
            "4362",
            "4377",
            "4381",
            "4391",
            "4392",
            "4409",
            "4568",
            "4680",
            "4737",
            "4768",
            "4776",
            "4855",
            "4956",
            "4967",
            "4970",
            "5046",
            "5048",
            "5050",
            "5084",
            "5086",
            "5150",
            "5152",
            "5166",
            "5205",
            "5216",
            "5234",
            "5282",
            "5424",
            "5436",
            "5460",
            "5501",
            "5505",
            "5509",
            "5530",
            "5561",
            "5567",
            "5577",
            "5641",
            "5675",
            "5676",
            "5712",
            "5860",
            "5901",
            "5907",
            "5926",
            "5927",
            "6002",
            "6020",
            "6079",
            "6087",
            "6088",
            "6090",
            "6120",
            "6121",
            "6344",
            "6548",
            "6569",
            "6573",
            "6591",
            "6637",
            "6753",
            "6861",
            "6963",
            "7154",
            "7160",
            "7211",
            "7491",
            "7501",
            "7553",
            "7656",
            "7658",
            "7660",
            "7769",
            "7782",
            "7809",
            "7823"
    ));

    static ArrayList<String> teamListColor = new ArrayList<>(Arrays.asList(
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0",
            "0"
    ));

    static int rowCount = 0;
}
