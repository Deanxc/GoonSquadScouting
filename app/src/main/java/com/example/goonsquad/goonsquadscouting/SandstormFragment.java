package com.example.goonsquad.goonsquadscouting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import static com.example.goonsquad.goonsquadscouting.Global.*;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SandstormFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SandstormFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SandstormFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SandstormFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SandstormFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SandstormFragment newInstance(String param1, String param2) {
        SandstormFragment fragment = new SandstormFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_sandstorm,container,false);


        //Cargo ship buttons
        Button cs1 = v.findViewById(R.id.cs1);
        Button cs2 = v.findViewById(R.id.cs2);
        Button cs3 = v.findViewById(R.id.cs3);
        Button cs4 = v.findViewById(R.id.cs4);
        Button cs5 = v.findViewById(R.id.cs5);
        Button cs6 = v.findViewById(R.id.cs6);
        Button cs7 = v.findViewById(R.id.cs7);
        Button cs8 = v.findViewById(R.id.cs8);

        //Rocket ship buttons
        Button rs1i = v.findViewById(R.id.stage_1_increase);
        Button rs2i = v.findViewById(R.id.stage_2_increase);
        Button rs3i = v.findViewById(R.id.stage_3_increase);
        Button rs1d = v.findViewById(R.id.stage_1_decrease);
        Button rs2d = v.findViewById(R.id.stage_2_decrease);
        Button rs3d = v.findViewById(R.id.stage_3_decrease);

        //Setting listeners for buttons
        cs1.setOnClickListener(this);
        cs2.setOnClickListener(this);
        cs3.setOnClickListener(this);
        cs4.setOnClickListener(this);
        cs5.setOnClickListener(this);
        cs6.setOnClickListener(this);
        cs7.setOnClickListener(this);
        cs8.setOnClickListener(this);
        rs1i.setOnClickListener(this);
        rs2i.setOnClickListener(this);
        rs3i.setOnClickListener(this);
        rs1d.setOnClickListener(this);
        rs2d.setOnClickListener(this);
        rs3d.setOnClickListener(this);

        EditText teamID;
//connecting to the xml layout
        teamID = v.findViewById(R.id.team_id_Text);
        teamID.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0)
                    teamId = Integer.parseInt(s.toString());
            }
        });

        EditText matchNum;
//connecting to the xml layout
        matchNum = v.findViewById(R.id.match_id_Text);
        matchNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0)
                    matchId = Integer.parseInt(s.toString());
            }
        });

        //Bottom Radio Buttons
        final RadioGroup startingLevel = v.findViewById(R.id.Starting_Level);
        RadioGroup leaveHab = v.findViewById(R.id.Leave_Habitat);

        startingLevel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             public void onCheckedChanged(RadioGroup group, int checkedId) {
                 switch (checkedId) {
                     case R.id.level_1:
                         startingVal = 1;
                         //Toast.makeText(getContext(), "Left from level 1", Toast.LENGTH_LONG).show();
                         break;
                     case R.id.level_2:
                        startingVal = 2;
                         //Toast.makeText(getContext(), "Left from level 2", Toast.LENGTH_LONG).show();
                         break;

                 }
             }
        });

        leaveHab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.id_yes:
                        leaveVal = 1;
                        //Toast.makeText(getContext(), "Left the hab", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_no:
                        leaveVal = 0;
                        //Toast.makeText(getContext(), "Didn't leave the hab", Toast.LENGTH_LONG).show();
                        break;

                }
            }
        });

        //switch
        Switch s = v.findViewById(R.id.cargo_to_hatch);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isSwitched = isChecked;
                //Toast.makeText(getActivity(),"Switch is checked to "+ isSwitched, Toast.LENGTH_LONG).show();


                //Set up textView changes on true status

                //hatches
                if(isSwitched) {

                    //Hatch/Cargo Text notifier change

                    //cargo ship text changes for hatches
                    TextView viewToChange = v.findViewById(R.id.cs1Text);
                    viewToChange.setText(Integer.toString(hs1Val));
                    viewToChange = v.findViewById(R.id.cs2Text);
                    viewToChange.setText(Integer.toString(hs2Val));
                    viewToChange = v.findViewById(R.id.cs3Text);
                    viewToChange.setText(Integer.toString(hs3Val));
                    viewToChange = v.findViewById(R.id.cs4Text);
                    viewToChange.setText(Integer.toString(hs4Val));
                    viewToChange = v.findViewById(R.id.cs5Text);
                    viewToChange.setText(Integer.toString(hs5Val));
                    viewToChange = v.findViewById(R.id.cs6Text);
                    viewToChange.setText(Integer.toString(hs6Val));
                    viewToChange = v.findViewById(R.id.cs7Text);
                    viewToChange.setText(Integer.toString(hs7Val));
                    viewToChange = v.findViewById(R.id.cs8Text);
                    viewToChange.setText(Integer.toString(hs8Val));

                    //rocket ship text changes for hatches
                    viewToChange = v.findViewById(R.id.level_1_rocket_text);
                    viewToChange.setText(Integer.toString(rsh1));
                    viewToChange = v.findViewById(R.id.level_2_rocket_text);
                    viewToChange.setText(Integer.toString(rsh2));
                    viewToChange = v.findViewById(R.id.level_3_rocket_text);
                    viewToChange.setText(Integer.toString(rsh3));

                    //Hatch/Cargo Text notifier change
                    viewToChange = v.findViewById(R.id.cargo_hatch_text);
                    viewToChange.setText(sandstorm_hatch_text);

                }
                //cargo
                else {
                    //cargo ship text changes for cargo
                    TextView viewToChange = v.findViewById(R.id.cs1Text);
                    viewToChange.setText(Integer.toString(cs1Val));
                    viewToChange = v.findViewById(R.id.cs2Text);
                    viewToChange.setText(Integer.toString(cs2Val));
                    viewToChange = v.findViewById(R.id.cs3Text);
                    viewToChange.setText(Integer.toString(cs3Val));
                    viewToChange = v.findViewById(R.id.cs4Text);
                    viewToChange.setText(Integer.toString(cs4Val));
                    viewToChange = v.findViewById(R.id.cs5Text);
                    viewToChange.setText(Integer.toString(cs5Val));
                    viewToChange = v.findViewById(R.id.cs6Text);
                    viewToChange.setText(Integer.toString(cs6Val));
                    viewToChange = v.findViewById(R.id.cs7Text);
                    viewToChange.setText(Integer.toString(cs7Val));
                    viewToChange = v.findViewById(R.id.cs8Text);
                    viewToChange.setText(Integer.toString(cs8Val));

                    //cargo ship text changes for cargo
                    viewToChange = v.findViewById(R.id.level_1_rocket_text);
                    viewToChange.setText(Integer.toString(rsc1));
                    viewToChange = v.findViewById(R.id.level_2_rocket_text);
                    viewToChange.setText(Integer.toString(rsc2));
                    viewToChange = v.findViewById(R.id.level_3_rocket_text);
                    viewToChange.setText(Integer.toString(rsc3));

                    //Hatch/Cargo Text notifier change
                    viewToChange = v.findViewById(R.id.cargo_hatch_text);
                    viewToChange.setText(sandstorm_cargo_text);
                }
            }
        });


        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
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
    public interface OnFragmentInteractionListener {
        void onSandstormFragmentInteraction(Uri uri);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {

        View v = getView();
        if (v != null) {
            switch (view.getId()) {
                case R.id.cs1:
                    if (isSwitched) {
                        hs1Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs1Text);
                        viewToChange.setText(Integer.toString(hs1Val));
                    } else {
                        cs1Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs1Text);
                        viewToChange.setText(Integer.toString(cs1Val));
                    }
                    break;
                case R.id.cs2:
                    if (isSwitched) {
                        hs2Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs2Text);
                        viewToChange.setText(Integer.toString(hs2Val));
                    } else {
                        cs2Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs2Text);
                        viewToChange.setText(Integer.toString(cs2Val));
                    }
                    break;
                case R.id.cs3:
                    if (isSwitched) {
                        hs3Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs3Text);
                        viewToChange.setText(Integer.toString(hs3Val));
                    } else {
                        cs3Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs3Text);
                        viewToChange.setText(Integer.toString(cs3Val));
                    }
                    break;
                case R.id.cs4:
                    if (isSwitched) {
                        hs4Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs4Text);
                        viewToChange.setText(Integer.toString(hs4Val));
                    } else {
                        cs4Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs4Text);
                        viewToChange.setText(Integer.toString(cs4Val));
                    }
                    break;
                case R.id.cs5:
                    if (isSwitched) {
                        hs5Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs5Text);
                        viewToChange.setText(Integer.toString(hs5Val));
                    } else {
                        cs5Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs5Text);
                        viewToChange.setText(Integer.toString(cs5Val));
                    }
                    break;
                case R.id.cs6:
                    if (isSwitched) {
                        hs6Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs6Text);
                        viewToChange.setText(Integer.toString(hs6Val));
                    } else {
                        cs6Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs6Text);
                        viewToChange.setText(Integer.toString(cs6Val));
                    }
                    break;
                case R.id.cs7:
                    if (isSwitched) {
                        hs7Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs7Text);
                        viewToChange.setText(Integer.toString(hs7Val));
                    } else {
                        cs7Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs7Text);
                        viewToChange.setText(Integer.toString(cs7Val));
                    }
                    break;
                case R.id.cs8:
                    if (isSwitched) {
                        hs8Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs8Text);
                        viewToChange.setText(Integer.toString(hs8Val));
                    } else {
                        cs8Val += 1;
                        TextView viewToChange = v.findViewById(R.id.cs8Text);
                        viewToChange.setText(Integer.toString(cs8Val));
                    }
                    break;
                //rocket ship part of switch statement
                case R.id.stage_1_increase:
                    if (isSwitched) {
                        rsh1 += 1;
                        TextView viewToChange = v.findViewById(R.id.level_1_rocket_text);
                        viewToChange.setText(Integer.toString(rsh1));
                    } else {
                        rsc1 += 1;
                        TextView viewToChange = v.findViewById(R.id.level_1_rocket_text);
                        viewToChange.setText(Integer.toString(rsc1));
                    }
                    break;
                case R.id.stage_2_increase:
                    if (isSwitched) {
                        rsh2 += 1;
                        TextView viewToChange = v.findViewById(R.id.level_2_rocket_text);
                        viewToChange.setText(Integer.toString(rsh2));
                    } else {
                        rsc2 += 1;
                        TextView viewToChange = v.findViewById(R.id.level_2_rocket_text);
                        viewToChange.setText(Integer.toString(rsc2));
                    }
                    break;
                case R.id.stage_3_increase:
                    if (isSwitched) {
                        rsh3 += 1;
                        TextView viewToChange = v.findViewById(R.id.level_3_rocket_text);
                        viewToChange.setText(Integer.toString(rsh3));
                    } else {
                        rsc3 += 1;
                        TextView viewToChange = v.findViewById(R.id.level_3_rocket_text);
                        viewToChange.setText(Integer.toString(rsc3));
                    }
                    break;
                case R.id.stage_1_decrease:
                    if (isSwitched) {
                        if (rsh1 > 0) {
                            rsh1 -= 1;
                            TextView viewToChange = v.findViewById(R.id.level_1_rocket_text);
                            viewToChange.setText(Integer.toString(rsh1));
                        }
                    } else {
                        if (rsc1 > 0) {
                            rsc1 -= 1;
                            TextView viewToChange = v.findViewById(R.id.level_1_rocket_text);
                            viewToChange.setText(Integer.toString(rsc1));
                        }
                    }
                    break;
                case R.id.stage_2_decrease:
                    if (isSwitched) {
                        if (rsh2 > 0) {
                            rsh2 -= 1;
                            TextView viewToChange = v.findViewById(R.id.level_2_rocket_text);
                            viewToChange.setText(Integer.toString(rsh2));
                        }
                    } else {
                        if (rsc2 > 0) {
                            rsc2 -= 1;
                            TextView viewToChange = v.findViewById(R.id.level_2_rocket_text);
                            viewToChange.setText(Integer.toString(rsc2));
                        }
                    }
                    break;
                case R.id.stage_3_decrease:
                    if (isSwitched) {
                        if (rsh3 > 0) {
                            rsh3 -= 1;
                            TextView viewToChange = v.findViewById(R.id.level_3_rocket_text);
                            viewToChange.setText(Integer.toString(rsh3));
                        }
                    } else {
                        if (rsc3 > 0) {
                            rsc3 -= 1;
                            TextView viewToChange = v.findViewById(R.id.level_3_rocket_text);
                            viewToChange.setText(Integer.toString(rsc3));
                        }
                    }
                    break;

            }
        }
    }
}
