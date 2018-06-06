package com.example.kevin.activity_fragment.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kevin.activity_fragment.R;

public class Fragment1 extends Fragment{

    private static final String Param1 = "parametro1";


    private String mParam1;
    private View view;

    public static Fragment1 newInstance(String param1 ){
        Fragment1 fragment1= new Fragment1();
        Bundle arg = new Bundle();
        arg.putString(Param1,param1);
        fragment1.setArguments(arg);
        return fragment1;
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.layout_fragmento1,container,false);

        return view;
    }
}
