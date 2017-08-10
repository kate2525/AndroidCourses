package com.example.kate.lesson5;


import android.app.Activity;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kate.R;
import com.example.kate.home3.Home3Activity;
import com.example.kate.lesson5.MyLink;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Class5Adapter extends RecyclerView.Adapter<Class5Adapter.Holder> {

    //Adapter нужен для заполнения элементов данными
    private ArrayList<MyLink> items;
    private Activity context;
    private OnItemClickListener listener;

    public Class5Adapter(ArrayList<MyLink>items){
        this.items = items;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //из xml в объект
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_wiev, parent, false);
        Log.d("AAAA", "onCreateViewHolder()");
        return new Holder(root);
    }

    //заполнения элементов данными
    @Override
    public void onBindViewHolder(Holder holder, int position) {
        final MyLink item = items.get(position);
        //holder.image
        Picasso.with(holder.itemView.getContext()).load(item.getLink()).into(holder.image);
//        Glide.with(holder.itemView.getContext())
//                .load(item.getLink())
//                .apply(RequestOptions.circleCropTransform())
//                .into(holder.imageView);
        //holder.text
        holder.textView.setText(item.getName());
        //вешаем клик
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null ){
                    listener.onItemClick(item);
                }

            }
        });
    }



    @Override
    public int getItemCount() {
        return items ==null ? 0 : items.size();
    }

    public static class Holder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView textView;
        public Holder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }

    //клик на по списку
    interface OnItemClickListener{
        public void onItemClick(MyLink item);
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
