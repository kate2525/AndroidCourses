package com.example.kate.home14;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kate.R;

import java.util.ArrayList;
import java.util.List;


public class CountryAdapter extends BaseAdapter{

    Context context;
    List<Countries> countries = new ArrayList<>();

    public CountryAdapter(Context context, List<Countries> countries) {
        this.context = context;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    public Countries getItemModel(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Countries cont = countries.get(position);
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View item = inflater.inflate(R.layout.item_county, parent, false);

        TextView textCountry = (TextView) item.findViewById(R.id.textCountry);
        textCountry.setText(cont.getName());

        return item;
    }






}
