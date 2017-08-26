package com.example.kate.lesson13;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kate.R;

public class Lesson13Fragment extends Fragment {

    public static final String KEY = "KEY";
    private String text;

    public static Lesson13Fragment newInstance(FragmentManager fragmentManager, String text) {

        Fragment fragment =fragmentManager.findFragmentByTag(Lesson13Fragment.class.getName());

        Lesson13Fragment lesson13Fragment;
        if(fragment !=null && fragment instanceof Lesson13Fragment){
            lesson13Fragment= (Lesson13Fragment) fragment;
        }else {
            lesson13Fragment = new Lesson13Fragment();
            Bundle bundle = new Bundle();
            bundle.putString(KEY, text);
            lesson13Fragment.setArguments(bundle);
        }


       // Lesson13Fragment fragment = new Lesson13Fragment();
        //Bundle как hashmap
//        Bundle bundle = new Bundle();
//        bundle.putString(KEY, text);
//        fragment.setArguments(bundle);
        return lesson13Fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();

        if (bundle != null) {
            text = bundle.getString(KEY);
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lesson13, container,false);
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
