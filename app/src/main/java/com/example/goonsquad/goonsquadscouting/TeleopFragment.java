package com.example.goonsquad.goonsquadscouting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.goonsquad.goonsquadscouting.Global.*;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TeleopFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TeleopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeleopFragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TeleopFragment()
    {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TeleopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TeleopFragment newInstance(String param1, String param2)
    {
        TeleopFragment fragment = new TeleopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_teleop, container, false);

        //Stage 1 buttons
        Button level_1_csi = v.findViewById(R.id.stage_1_cs_increment);
        Button level_1_csd = v.findViewById(R.id.stage_1_cs_decrement);
        Button level_1_cfi = v.findViewById(R.id.stage_1_cf_increment);
        Button level_1_cfd = v.findViewById(R.id.stage_1_cf_decrement);
        Button level_1_hsi = v.findViewById(R.id.stage_1_hs_increment);
        Button level_1_hsd = v.findViewById(R.id.stage_1_hs_decrement);
        Button level_1_hfi = v.findViewById(R.id.stage_1_fh_increment);
        Button level_1_hfd = v.findViewById(R.id.stage_1_hf_decrement);

            //Sets listeners on buttons
        level_1_csi.setOnClickListener(this);
        level_1_csd.setOnClickListener(this);
        level_1_cfi.setOnClickListener(this);
        level_1_cfd.setOnClickListener(this);
        level_1_hsi.setOnClickListener(this);
        level_1_hsd.setOnClickListener(this);
        level_1_hfi.setOnClickListener(this);
        level_1_hfd.setOnClickListener(this);

        //Stage 2 buttons
        Button level_2_csi = v.findViewById(R.id.stage_2_cs_increment);
        Button level_2_csd = v.findViewById(R.id.stage_2_cs_decrement);
        Button level_2_cfi = v.findViewById(R.id.stage_2_cf_increment);
        Button level_2_cfd = v.findViewById(R.id.stage_2_cf_decrement);
        Button level_2_hsi = v.findViewById(R.id.stage_2_hs_increment);
        Button level_2_hsd = v.findViewById(R.id.stage_2_hs_decrement);
        Button level_2_hfi = v.findViewById(R.id.stage_2_hf_increment);
        Button level_2_hfd = v.findViewById(R.id.stage_2_hf_decrement);

            //Sets listeners for buttons
        level_2_csi.setOnClickListener(this);
        level_2_csd.setOnClickListener(this);
        level_2_cfi.setOnClickListener(this);
        level_2_cfd.setOnClickListener(this);
        level_2_hsi.setOnClickListener(this);
        level_2_hsd.setOnClickListener(this);
        level_2_hfi.setOnClickListener(this);
        level_2_hfd.setOnClickListener(this);

        //Stage 3 buttons
        Button level_3_csi = v.findViewById(R.id.stage_3_cs_increment);
        Button level_3_csd = v.findViewById(R.id.stage_3_cs_decrement);
        Button level_3_cfi = v.findViewById(R.id.stage_3_cf_increment);
        Button level_3_cfd = v.findViewById(R.id.stage_3_cf_decrement);
        Button level_3_hsi = v.findViewById(R.id.stage_3_hs_increment);
        Button level_3_hsd = v.findViewById(R.id.stage_3_hs_decrement);
        Button level_3_hfi = v.findViewById(R.id.stage_3_hf_increment);
        Button level_3_hfd = v.findViewById(R.id.stage_3_hf_decrement);

            //Sets up listeners for buttons
        level_3_csi.setOnClickListener(this);
        level_3_csd.setOnClickListener(this);
        level_3_cfi.setOnClickListener(this);
        level_3_cfd.setOnClickListener(this);
        level_3_hsi.setOnClickListener(this);
        level_3_hsd.setOnClickListener(this);
        level_3_hfi.setOnClickListener(this);
        level_3_hfd.setOnClickListener(this);


        //Cargo ship buttons
        Button cs_cs_i = v.findViewById(R.id.cs_cs_increment);
        Button cs_cs_d = v.findViewById(R.id.cs_cs_decrement);
        Button cs_cf_i = v.findViewById(R.id.cs_cf_increment);
        Button cs_cf_d = v.findViewById(R.id.cs_cf_decrement);
        Button cs_hs_i = v.findViewById(R.id.cs_hs_increment);
        Button cs_hs_d = v.findViewById(R.id.cs_hs_decrement);
        Button cs_hf_i = v.findViewById(R.id.cs_hf_increment);
        Button cs_hf_d = v.findViewById(R.id.cs_hf_decrement);

            //Sets up listeners for buttons
        cs_cs_i.setOnClickListener(this);
        cs_cs_d.setOnClickListener(this);
        cs_cf_i.setOnClickListener(this);
        cs_cf_d.setOnClickListener(this);
        cs_hs_i.setOnClickListener(this);
        cs_hs_d.setOnClickListener(this);
        cs_hf_i.setOnClickListener(this);
        cs_hf_d.setOnClickListener(this);

        //Radio Button Groups
        final RadioGroup habitatReached = v.findViewById(R.id.defense_played);
        RadioGroup wasAssisted = v.findViewById(R.id.assisted_yn);
        RadioGroup climbLevel = v.findViewById(R.id.climb_level);
        RadioGroup levelAssistedToo = v.findViewById(R.id.level_assisted_to);
        final RadioGroup defensePlayed = v.findViewById(R.id.defense_played);

        //Radio Button listeners
        habitatReached.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.habitat_yes:
                        habitatVal = 1;
                        //Toast.makeText(getActivity(), "Made it to the habitat " + habitatVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.habitat_no:
                        habitatVal = 0;
                        //Toast.makeText(getActivity(), "Made it to the habitat " + habitatVal, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        wasAssisted.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.assisted_yes:
                        assistedVal = 1;
                        //Toast.makeText(getActivity(), "You were assisted" + assistedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.assisted_no:
                        assistedVal = 0;
                        //Toast.makeText(getActivity(), "You were assisted" + assistedVal, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        climbLevel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.climb_level_none:
                        levelClimbedVal = 0;
                        //Toast.makeText(getActivity(), "Climbed to level" + levelClimbedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.climb_level_1:
                        levelClimbedVal = 1;
                        //Toast.makeText(getActivity(), "Climbed to level" + levelClimbedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.climb_level_2:
                        levelClimbedVal = 2;
                        //Toast.makeText(getActivity(), "Climbed to level" + levelClimbedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.climb_level_3:
                        levelClimbedVal = 3;
                        //Toast.makeText(getActivity(), "Climbed to level" + levelClimbedVal, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        levelAssistedToo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.helped_0:
                        youAssistedVal = 0;
                        //Toast.makeText(getActivity(), "Assist to level: " + youAssistedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.assist_level_1:
                        youAssistedVal = 1;
                        //Toast.makeText(getActivity(), "Assist to level: " + youAssistedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.assist_level_2:
                        youAssistedVal = 2;
                        //Toast.makeText(getActivity(), "Assist to level: " + youAssistedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.assist_level_3:
                        youAssistedVal = 3;
                        //Toast.makeText(getActivity(), "Assist to level: " + youAssistedVal, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        defensePlayed.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.defense_no:
                        defensePlayedVal = 0;
                        //Toast.makeText(getActivity(), "Assist to level: " + youAssistedVal, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.defense_yes:
                        defensePlayedVal = 1;
                        //Toast.makeText(getActivity(), "Assist to level: " + youAssistedVal, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        //Button to go to new activity
        Button sendInformation = v.findViewById(R.id.send_Info);
        sendInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), clientSendInformationActivity.class);
                startActivity(intent);
            }
        });


        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri)
    {
        if (mListener != null)
        {
            mListener.onTeleopFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener)
        {
            mListener = (OnFragmentInteractionListener) context;
        }
        else
        {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener
    {
        // TODO: Update argument type and name
        void onTeleopFragmentInteraction(Uri uri);
    }

    public void onClick(View view)
    {
        View v = getView();
        TextView viewToChange;
        switch(view.getId())
        {
            //Level 1 Cargo success
            case R.id.stage_1_cs_increment:
                level_1_cs++;
                viewToChange = v.findViewById(R.id.level_1cs_text);
                viewToChange.setText(Integer.toString(level_1_cs));
                break;
            case R.id.stage_1_cs_decrement:
                if(level_1_cs > 0) {
                    level_1_cs--;
                    viewToChange = v.findViewById(R.id.level_1cs_text);
                    viewToChange.setText(Integer.toString(level_1_cs));
                }
                break;

            //Level 1 Cargo Failure
            case R.id.stage_1_cf_increment:
                level_1_cf++;
                viewToChange = v.findViewById(R.id.level_1cf_text);
                viewToChange.setText(Integer.toString(level_1_cf));
                break;
            case R.id.stage_1_cf_decrement:
                if(level_1_cf > 0) {
                    level_1_cf--;
                    viewToChange = v.findViewById(R.id.level_1cf_text);
                    viewToChange.setText(Integer.toString(level_1_cf));
                }
                break;

            //Level 1 Hatch Success
            case R.id.stage_1_hs_increment:
                level_1_hs++;
                viewToChange = v.findViewById(R.id.level_1sh_text);
                viewToChange.setText(Integer.toString(level_1_hs));
                break;

            case R.id.stage_1_hs_decrement:
                if(level_1_hs > 0) {
                    level_1_hs--;
                    viewToChange = v.findViewById(R.id.level_1sh_text);
                    viewToChange.setText(Integer.toString(level_1_hs));
                }
                break;

            //Level 1 Hatch Failure
            case R.id.stage_1_fh_increment:
                level_1_hf++;
                viewToChange = v.findViewById(R.id.level_1hf_text);
                viewToChange.setText(Integer.toString(level_1_hf));
                break;

            case R.id.stage_1_hf_decrement:
                if(level_1_hf > 0) {
                    level_1_hf--;
                    viewToChange = v.findViewById(R.id.level_1hf_text);
                    viewToChange.setText(Integer.toString(level_1_hf));
                }
                 break;

            //Level 2 Cargo success
            case R.id.stage_2_cs_increment:
                level_2_cs++;
                viewToChange = v.findViewById(R.id.level_2cs_text);
                viewToChange.setText(Integer.toString(level_2_cs));
                break;

            case R.id.stage_2_cs_decrement:
                if(level_2_cs > 0) {
                    level_2_cs--;
                    viewToChange = v.findViewById(R.id.level_2cs_text);
                    viewToChange.setText(Integer.toString(level_2_cs));
                }
                break;

            //Level 2 Cargo Failure
            case R.id.stage_2_cf_increment:
                level_2_cf++;
                viewToChange = v.findViewById(R.id.level_2cf_text);
                viewToChange.setText(Integer.toString(level_2_cf));
                break;

            case R.id.stage_2_cf_decrement:
                if(level_2_cf > 0) {
                    level_2_cf--;
                    viewToChange = v.findViewById(R.id.level_2cf_text);
                    viewToChange.setText(Integer.toString(level_2_cf));
                }
                break;

            //Level 2 Hatch Success
            case R.id.stage_2_hs_increment:
                level_2_hs++;
                viewToChange = v.findViewById(R.id.level_2hs_text);
                viewToChange.setText(Integer.toString(level_2_hs));
                break;

            case R.id.stage_2_hs_decrement:
                if(level_2_hs > 0) {
                    level_2_hs--;
                    viewToChange = v.findViewById(R.id.level_2hs_text);
                    viewToChange.setText(Integer.toString(level_2_hs));
                }
                break;

            //Level 2 Hatch Failure
            case R.id.stage_2_hf_increment:
                level_2_hf++;
                viewToChange = v.findViewById(R.id.level_2hf_text);
                viewToChange.setText(Integer.toString(level_2_hf));
                break;

            case R.id.stage_2_hf_decrement:
                if(level_2_hf > 0) {
                    level_2_hf--;
                    viewToChange = v.findViewById(R.id.level_2hf_text);
                    viewToChange.setText(Integer.toString(level_2_hf));
                }
                break;

            //Level 3 Cargo success
            case R.id.stage_3_cs_increment:
                level_3_cs++;
                viewToChange = v.findViewById(R.id.level_3cs_text);
                viewToChange.setText(Integer.toString(level_3_cs));
                break;

            case R.id.stage_3_cs_decrement:
                if(level_3_cs > 0) {
                    level_3_cs--;
                    viewToChange = v.findViewById(R.id.level_3cs_text);
                    viewToChange.setText(Integer.toString(level_3_cs));
                }
                break;

            //Level 3 Cargo Failure
            case R.id.stage_3_cf_increment:
                level_3_cf++;
                viewToChange = v.findViewById(R.id.level_3cf_text);
                viewToChange.setText(Integer.toString(level_3_cf));
                break;

            case R.id.stage_3_cf_decrement:
                if(level_3_cf > 0) {
                    level_3_cf--;
                    viewToChange = v.findViewById(R.id.level_3cf_text);
                    viewToChange.setText(Integer.toString(level_3_cf));
                }
                break;
            //Level 3 Hatch Success
            case R.id.stage_3_hs_increment:
                level_3_hs++;
                viewToChange = v.findViewById(R.id.level_3hs_text);
                viewToChange.setText(Integer.toString(level_3_hs));
                break;

            case R.id.stage_3_hs_decrement:
                if(level_3_hs > 0) {
                    level_3_hs--;
                    viewToChange = v.findViewById(R.id.level_3hs_text);
                    viewToChange.setText(Integer.toString(level_3_hs));
                }
                break;

            //Level 3 Hatch Failure
            case R.id.stage_3_hf_increment:
                level_3_hf++;
                viewToChange = v.findViewById(R.id.level_3hf_text);
                viewToChange.setText(Integer.toString(level_3_hf));
                break;

            case R.id.stage_3_hf_decrement:
                if(level_3_hf > 0) {
                    level_3_hf--;
                    viewToChange = v.findViewById(R.id.level_3hf_text);
                    viewToChange.setText(Integer.toString(level_3_hf));
                }
                break;

            //Cargo Ship Cargo Success
            case R.id.cs_cs_increment:
                ship_cs++;
                viewToChange = v.findViewById(R.id.cs_cs_text);
                viewToChange.setText(Integer.toString(ship_cs));
                break;

            case R.id.cs_cs_decrement:
                if(ship_cs > 0) {
                    ship_cs--;
                    viewToChange = v.findViewById(R.id.cs_cs_text);
                    viewToChange.setText(Integer.toString(ship_cs));
                }
                break;

            //Cargo Ship Cargo Failure
            case R.id.cs_cf_increment:
                ship_cf++;
                viewToChange = v.findViewById(R.id.cs_cf_text);
                viewToChange.setText(Integer.toString(ship_cf));
                break;

            case R.id.cs_cf_decrement:
                if(ship_cf > 0) {
                    ship_cf--;
                    viewToChange = v.findViewById(R.id.cs_cf_text);
                    viewToChange.setText(Integer.toString(ship_cf));
                }
                break;

            //Cargo Ship Hatch Success
            case R.id.cs_hs_increment:
                ship_hs++;
                viewToChange = v.findViewById(R.id.cs_hs_text);
                viewToChange.setText(Integer.toString(ship_hs));
                break;

            case R.id.cs_hs_decrement:
                if(ship_hs > 0) {
                    ship_hs--;
                    viewToChange = v.findViewById(R.id.cs_hs_text);
                    viewToChange.setText(Integer.toString(ship_hs));
                }
                break;

            //Cargo Ship Hatch Failure
            case R.id.cs_hf_increment:
                ship_hf++;
                viewToChange = v.findViewById(R.id.cs_hf_text);
                viewToChange.setText(Integer.toString(ship_hf));
                break;

            case R.id.cs_hf_decrement:
                if(ship_hf > 0) {
                    ship_hf--;
                    viewToChange = v.findViewById(R.id.cs_hf_text);
                    viewToChange.setText(Integer.toString(ship_hf));
                }
                break;
        }
    }
}
