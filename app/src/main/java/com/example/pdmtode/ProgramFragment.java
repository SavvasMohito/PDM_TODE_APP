package com.example.pdmtode;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProgramFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProgramFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProgramFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProgramFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProgramFragment newInstance(String param1, String param2) {
        ProgramFragment fragment = new ProgramFragment();
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
        View v = inflater.inflate(R.layout.fragment_program, container, false);

        Spinner spinner = (Spinner) v.findViewById (R.id.spinner);
        LinearLayout exB = (LinearLayout)v.findViewById(R.id.exB);
        LinearLayout exD = (LinearLayout)v.findViewById(R.id.exD);
        LinearLayout exST = (LinearLayout)v.findViewById(R.id.exST);
        LinearLayout exH = (LinearLayout)v.findViewById(R.id.exH);

        spinner.setOnItemSelectedListener
                (new AdapterView.OnItemSelectedListener () {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        clearEx();
                        switch (position){
                            case 0:
                                exB.setVisibility(View.VISIBLE);
                            case 1:
                                exD.setVisibility(View.VISIBLE);
                            case 2:
                                exST.setVisibility(View.VISIBLE);
                            case 3:
                                exH.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                    private void clearEx(){
                        exB.setVisibility(View.GONE);
                        exD.setVisibility(View.GONE);
                        exST.setVisibility(View.GONE);
                        exH.setVisibility(View.GONE);
                    }
                });

        return v;
    }

}