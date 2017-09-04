package com.example.kate.home10;


import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kate.R;

import com.kate.domain.Entity.ResycleURL;
import com.kate.domain.Entity.UserDomain;

import java.util.ArrayList;
import java.util.List;

public class MyResycleViewAdapterHome10 extends RecyclerView.Adapter<MyResycleViewAdapterHome10.MyViewHolder> {

    private List<UserDomain> userDomains = new ArrayList<>();
    private OnItemClickListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textName;
        TextView textSurname;
        TextView textAge;

        public MyViewHolder(View itemView) {
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.textName);
            textSurname = (TextView) itemView.findViewById(R.id.textSurname);
            textAge = (TextView) itemView.findViewById(R.id.textAge);

        }
    }
 //сетер объекта,который ушел в viewModel
    public void setResycleRests(List<UserDomain> userDomains) {
        this.userDomains = userDomains;
        //обновляет экран данных
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //из xml в объект
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle, parent, false);
        return new MyViewHolder(root);
    }

    @Override
    public void onBindViewHolder(MyResycleViewAdapterHome10.MyViewHolder holder, int position) {
        //заполнение данными
       final UserDomain item = userDomains.get(position);
        holder.textName.setText(item.getName());
        holder.textSurname.setText(item.getSurname());
        holder.textAge.setText(String.valueOf(item.getAge()));


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
        return userDomains ==null ? 0 : userDomains.size();
    }


    interface OnItemClickListener{
        public void onItemClick(UserDomain item);
    }

    public void setListener(MyResycleViewAdapterHome10.OnItemClickListener listener) {
        this.listener = listener;
    }
}
