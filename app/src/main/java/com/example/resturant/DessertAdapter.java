package com.example.thedessert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DessertAdapter extends BaseAdapter
    {
        Context context;
        int resource;
        ArrayList<dessertmenu> menud;

    public DessertAdapter(Context context, int res, ArrayList<dessertmenu> menud)
        {
            this.context = context;
            this.resource = res;
            this.menud = menud;
        }

        @Override
        public int getCount() {
        return menud.size();
    }

        @Override
        public dessertmenu getItem(int i) {
        return menud.get(i);
    }

        @Override
        public long getItemId(int i) {
        return 0;
    }


        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
        View v_iew= view;
        if(v_iew== null)
        {
            v_iew= LayoutInflater.from(context).inflate(resource,null,false);
        }
        TextView textview1=v_iew.findViewById(R.id._name);
        TextView textview2=v_iew.findViewById(R.id._price);
        ImageView imageview=v_iew.findViewById(R.id._image);

        dessertmenu de=getItem(i);
        textview1.setText(de.getText1());
        textview2.setText(de.getText2());
        imageview.setImageResource(de.getImage());

        return v_iew;

    }
    }
