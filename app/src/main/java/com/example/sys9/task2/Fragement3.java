package com.example.sys9.task2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragement3  extends Fragment{
    ImageView I1;
    ImageView I2;
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {




            View view = inflater.inflate(R.layout.frag1, container, false);
            I1=view.findViewById(R.id.image1);
            I2=view.findViewById(R.id.image2);
            I1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Fragement5 frag5=new Fragement5();
                    FragmentManager manager=getFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    transaction.replace(R.id.framelayout,frag5);
                    transaction.commit();

                }
            });
            return view;
        }

    }

