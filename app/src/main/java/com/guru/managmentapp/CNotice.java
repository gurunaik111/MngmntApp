package com.guru.managmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class CNotice extends android.app.Fragment {


    public CNotice() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_snotice, container, false);
        ListView mListView=(ListView)getActivity().findViewById(R.id.classnoticelist);
        //create GetNotice Object
        GetNotice note1=new GetNotice("holiday for day");
        GetNotice note2=new GetNotice("holi hai");
        GetNotice note3=new GetNotice("Coldplay");
        GetNotice note4=new GetNotice("holi hai");
        GetNotice note5=new GetNotice("Bruno Mars");
        GetNotice note6=new GetNotice("holi hai");
        GetNotice note7=new GetNotice("LP");
        //addoject to array list
        ArrayList<GetNotice> noticeList=new ArrayList<>();
        noticeList.add(note7);
        noticeList.add(note6);noticeList.add(note5);noticeList.add(note4);noticeList.add(note3);
        noticeList.add(note1);noticeList.add(note2);
        NoticeListAdapter adapter=new NoticeListAdapter(getActivity(),R.layout.adapter_view_layout,noticeList);
        mListView.setAdapter(adapter);

        return view;


    }
}
