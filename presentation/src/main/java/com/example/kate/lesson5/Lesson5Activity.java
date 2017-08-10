package com.example.kate.lesson5;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kate.R;
import com.example.kate.home3.Home3Activity;


import java.util.ArrayList;

public class Lesson5Activity extends Activity {
    private RecyclerView recyclerView;
   private ArrayList<MyLink> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5);

        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);

        MyLink myLink = new MyLink();
        myLink.setLink("https://img.tyt.by/720x720s/n/obshchestvo/03/b/den_sotrudnika_torgovli_20170801_bun_tutby_phsl-1016-2.jpg");
        Log.d("AAAAA", "image");
        myLink.setName("item 1");
        list.add(myLink);

        MyLink myLink2 = new MyLink();
        myLink2.setLink("http://bm.img.com.ua/nxs/img/prikol/images/large/0/0/307600.jpg");
        myLink2.setName("item 2");
        list.add(myLink2);

        MyLink myLink3 = new MyLink();
        myLink3.setLink("http://images.all-free-download.com/images/graphiclarge/beautiful_nature_landscape_02_hd_picture_166206.jpg");
        myLink3.setName("item 3");
        list.add(myLink3);

        MyLink myLink4 = new MyLink();
        myLink4.setLink("https://pbs.twimg.com/profile_images/640666088271839233/OTKlt5pC_400x400.jpg");
        myLink4.setName("item 4");
        list.add(myLink4);

        MyLink myLink5 = new MyLink();
        myLink5.setLink("http://bm.img.com.ua/nxs/img/prikol/images/large/0/0/307600.jpg");
        myLink5.setName("item 5");
        list.add(myLink5);

        MyLink myLink6 = new MyLink();
        myLink6.setLink("http://bm.img.com.ua/nxs/img/prikol/images/large/0/0/307600.jpg");
        myLink6.setName("item 6");
        list.add(myLink6);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Class5Adapter classAdapter = new Class5Adapter(list);


       // classAdapter.setListener(new Class5Adapter.OnItemClickListener(){


        recyclerView.setAdapter(classAdapter);


    }
}
