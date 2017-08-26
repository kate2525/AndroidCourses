package com.example.kate.home9;


import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kate.R;
import com.kate.domain.Entity.ResycleURL;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyResycleViewAdapter extends RecyclerView.Adapter<MyResycleViewAdapter.MyViewHolder> {

    private List<ResycleURL> resycleURLs = new ArrayList<>();
    private Activity context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            textView = (TextView) itemView.findViewById(R.id.textView);

        }
    }
 //сетер объекта,который ушел в viewModel
    public void setResycleURLs(List<ResycleURL> resycleURLs) {
        this.resycleURLs = resycleURLs;
        //обновляет экран данных
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //из xml в объект
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_wiev, parent, false);
        return new MyViewHolder(root);
    }

    @Override
    public void onBindViewHolder(MyResycleViewAdapter.MyViewHolder holder, int position) {
        //заполнение данными
        ResycleURL item = resycleURLs.get(position);
        holder.textView.setText(item.getName());
        Picasso.with(holder.itemView.getContext()).load(item.getUrl()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return resycleURLs ==null ? 0 : resycleURLs.size();
    }
}
