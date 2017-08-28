package com.guru.managmentapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SNotice extends android.app.Fragment {


    public SNotice() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_snotice, container, false);
        String[] schoolnotice_menu={"notice one","Notice two","NOtice item three"};
        ListView listView=(ListView) view.findViewById(R.id.schoolnoticelist);
        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,schoolnotice_menu);
        listView.setAdapter(listViewAdapter);

        return view;
    }

}
