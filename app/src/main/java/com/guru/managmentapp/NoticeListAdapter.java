package com.guru.managmentapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;



public class NoticeListAdapter extends ArrayAdapter<GetNotice> {
    Context context;
    int layoutResourceId;



    public NoticeListAdapter(Context context, int layoutResourceId,          List<GetNotice> items) {
        super(context, layoutResourceId, items);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        //  this.listener=callback;
    }



    /*private view holder class*/
    private class ViewHolder {

        TextView txtTitle;
        TextView txtDetail;
        ImageView imageview;

    }
    ViewHolder holder = null;

    public View getView(int position, View convertView, ViewGroup parent) {
        final GetNotice lists = getItem(position);
        final int pos=position;


        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_view_layout, null);
            holder = new ViewHolder();
            holder.txtTitle = (TextView) convertView.findViewById(R.id.subjectName);
            holder.txtDetail = (TextView) convertView.findViewById(R.id.subjectHomework);
            holder.imageview = (ImageView) convertView.findViewById(R.id.imageview);

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtTitle.setText(lists.getTitle());
        holder.txtDetail.setText(lists.getDetail());

        try {
            holder.imageview.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    switch (v.getId()) {
                        case R.id.imageview:

                            PopupMenu popup = new PopupMenu(getApplicationContext(), v);
                            popup.getMenuInflater().inflate(R.menu.clipboard_popup,
                                    popup.getMenu());
                            popup.show();
                            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                @Override

                                public boolean onMenuItemClick(MenuItem item) {

                                    switch (item.getItemId()) {
                                        case R.id.install:

                                            //Or Some other code you want to put here.. This is just an example.
                                            Toast.makeText(getApplicationContext(), " Install Clicked at position " + " : " + position, Toast.LENGTH_LONG).show();

                                            break;
                                        case R.id.delete:

                                            Toast.makeText(getApplicationContext(), "Add to Wish List Clicked at position " + " : " + position, Toast.LENGTH_LONG).show();

                                            break;

                                        default:
                                            break;
                                    }

                                    return true;
                                }
                            });

                            break;

                        default:
                            break;
                    }


                }
            });

        } catch (Exception e) {

            e.printStackTrace();
        }

        return convertView;
    }

}
    /*
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
    } */
}
