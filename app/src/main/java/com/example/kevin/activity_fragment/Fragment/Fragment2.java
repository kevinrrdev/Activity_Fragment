package com.example.kevin.activity_fragment.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kevin.activity_fragment.R;

public class Fragment2 extends Fragment{

    private static final String Param1 = "parametro1";


    private String mParam1;
    private View view;

    public static Fragment2 newInstance(String param1 ){
        Fragment2 fragment2= new Fragment2();
        Bundle arg = new Bundle();
        arg.putString(Param1,param1);
        fragment2.setArguments(arg);
        return fragment2;
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.layout_fragmento2,container,false);

        return view;
    }
}