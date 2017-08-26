package com.example.kate.lesson13;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kate.R;

public class Lesson13FragmentSecond extends Fragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lesson13_second, container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //именно здесь делать все действия
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //в этом методе доступ к Activity
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        //добавили на активити
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        //убрали из активити
        super.onDetach();
    }
}
