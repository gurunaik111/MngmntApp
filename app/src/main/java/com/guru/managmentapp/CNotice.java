package com.guru.managmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CNotice extends android.app.Fragment {


    public CNotice() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_cnotice, container, false);
        String[] classnotice_menu={"notice one","Notice two","NOtice item three"};
        ListView listView=(ListView) view.findViewById(R.id.classnoticelist);
        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,classnotice_menu);
        listView.setAdapter(listViewAdapter);

        return view;
    }
}
