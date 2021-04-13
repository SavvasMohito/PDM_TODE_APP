package com.example.pdmtode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link newsfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class newsfragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public newsfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment newsfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static newsfragment newInstance(String param1, String param2) {
        newsfragment fragment = new newsfragment();
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
        View v = inflater.inflate(R.layout.fragment_news, container, false);
        //Trigger RSS Read
        Feed feed = newsReader.read();

        LinearLayout news1 = v.findViewById((R.id.new1));
        TextView nTitle1 = v.findViewById(R.id.nTitle1);
        TextView nDate1 = v.findViewById(R.id.nDate1);
        TextView nDesc1 = v.findViewById(R.id.nDesc1);

        LinearLayout news2 = v.findViewById((R.id.new2));
        TextView nTitle2 = v.findViewById(R.id.nTitle2);
        TextView nDate2 = v.findViewById(R.id.nDate2);
        TextView nDesc2 = v.findViewById(R.id.nDesc2);

        LinearLayout news3 = v.findViewById((R.id.new3));
        TextView nTitle3 = v.findViewById(R.id.nTitle3);
        TextView nDate3 = v.findViewById(R.id.nDate3);
        TextView nDesc3 = v.findViewById(R.id.nDesc3);

        LinearLayout news4 = v.findViewById((R.id.new4));
        TextView nTitle4 = v.findViewById(R.id.nTitle4);
        TextView nDate4 = v.findViewById(R.id.nDate4);
        TextView nDesc4 = v.findViewById(R.id.nDesc4);

        LinearLayout news5 = v.findViewById((R.id.new5));
        TextView nTitle5 = v.findViewById(R.id.nTitle5);
        TextView nDate5 = v.findViewById(R.id.nDate5);
        TextView nDesc5 = v.findViewById(R.id.nDesc5);

        nTitle1.setText(feed.getMessages().get(0).getTitle());
        nDate1.setText(feed.getMessages().get(0).getPubDate());
        nDesc1.setText(feed.getMessages().get(0).getDescription());
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(feed.getMessages().get(0).getLink()));
                startActivity(intent);
            }
        });

        nTitle2.setText(feed.getMessages().get(1).getTitle());
        nDate2.setText(feed.getMessages().get(1).getPubDate());
        nDesc2.setText(feed.getMessages().get(1).getDescription());
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(feed.getMessages().get(1).getLink()));
                startActivity(intent);
            }
        });

        nTitle3.setText(feed.getMessages().get(2).getTitle());
        nDate3.setText(feed.getMessages().get(2).getPubDate());
        nDesc3.setText(feed.getMessages().get(2).getDescription());
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(feed.getMessages().get(2).getLink()));
                startActivity(intent);
            }
        });

        nTitle4.setText(feed.getMessages().get(3).getTitle());
        nDate4.setText(feed.getMessages().get(3).getPubDate());
        nDesc4.setText(feed.getMessages().get(3).getDescription());
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(feed.getMessages().get(3).getLink()));
                startActivity(intent);
            }
        });

        nTitle5.setText(feed.getMessages().get(4).getTitle());
        nDate5.setText(feed.getMessages().get(4).getPubDate());
        nDesc5.setText(feed.getMessages().get(4).getDescription());
        news5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(feed.getMessages().get(4).getLink()));
                startActivity(intent);
            }
        });

        return v;
    }
}