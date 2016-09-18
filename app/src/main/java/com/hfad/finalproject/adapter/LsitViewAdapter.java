package com.hfad.finalproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hfad.finalproject.modal.Info;
import com.hfad.finalproject.R;

import java.util.ArrayList;

/**
 * Created by user on 9/17/2016.
 */
public class LsitViewAdapter extends ArrayAdapter {
    ArrayList<Info> info;
    TextView name;
    TextView age;
    TextView gender;
    TextView email;
    TextView extraInfo;
    TextView enrolledInfo;
    TextView rating;
    Context context;
    public LsitViewAdapter(Context context, int resourse, ArrayList<Info> info){
        super(context,resourse,info);
        this.context=context;
        this.info=info;

    }

    @Override
    public int getCount() {return info.size();}
    @Override
    public Info getItem(int position) {return info.get(position);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.list_data,null);
        TextView name=(TextView)convertView.findViewById(R.id.dispName);
        TextView age=(TextView) convertView.findViewById(R.id.dispAge);
        TextView extraInfo=(TextView) convertView.findViewById(R.id.dispinfo);
        TextView gender=(TextView) convertView.findViewById(R.id.dispGender);
        TextView email=(TextView) convertView.findViewById(R.id.dispEmail);
        TextView id=(TextView) convertView.findViewById(R.id.dispId);
        TextView rating=(TextView) convertView.findViewById(R.id.dispRating);
        TextView enrolledIn=(TextView)convertView.findViewById(R.id.dispEnrolledIn);


        Info info=getItem(position);
        name.setText(info.getName());
        age.setText(info.getAge());
        gender.setText(info.getGender());
        id.setText(info.getId());
        email.setText(info.getEmail());
        rating.setText(info.getRatingInInt());

        extraInfo.setText(info.getExtraInfo());

        return convertView;
    }
    public void notifyData(ArrayList<Info> list) {
        this.info = list;
        notifyDataSetChanged();
    }


}
