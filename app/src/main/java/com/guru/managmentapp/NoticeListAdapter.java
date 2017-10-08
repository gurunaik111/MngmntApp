package com.guru.managmentapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class NoticeListAdapter extends ArrayAdapter<GetNotice> {
    private static final String TAG="NoticeListAdapter";
    private Context mContext;
        int mResource;
    public NoticeListAdapter(Context context, int resource, ArrayList<GetNotice> objects)
    {
        super(context,resource,objects);
        mContext=context;
        mResource=resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get info
        String noticeT=getItem(position).getNoticeText();
        String noticeN=getItem(position).getNoticeNo();
        //create  param wid info
        GetNotice getNotice=new GetNotice(noticeT,noticeN);
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(mResource,parent,false);
        TextView tvTxt=(TextView) convertView.findViewById(R.id.adaptertextview);
        TextView tvNO=(TextView) convertView.findViewById(R.id.deleteButtonText);
        tvTxt.setText(noticeT);
        tvNO.setText(noticeN);
        return convertView;
    }
}
