package com.pradeep.sundayclasses;


import android.media.Image;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment {


    public TeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.team, container, false);
        Toolbar toolbar;
        ImageView suraj;
        ImageView ayush;
        ImageView amit;
        ImageView akarsh;
        ImageView kartik;
        ImageView yuvraj;
        ImageView simran;
        ImageView ankita;
        ImageView pallavi;
        ImageView mamta;
        ImageView abha;
        ImageView shubham;
        suraj=v.findViewById(R.id.suraj);
        ayush=v.findViewById(R.id.ayush);
        amit=v.findViewById(R.id.amit);
        akarsh=v.findViewById(R.id.akarsh);
        kartik=v.findViewById(R.id.kartik);
        yuvraj=v.findViewById(R.id.yuvraj);
        simran=v.findViewById(R.id.simran);
        ankita =v.findViewById(R.id.ankita);
        pallavi=v.findViewById(R.id.pallavi);
        mamta=v.findViewById(R.id.mamta);
        abha=v.findViewById(R.id.abha);
        shubham=v.findViewById(R.id.shubham);

        toolbar=v.findViewById(R.id.toolbar);
       toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getFragmentManager().beginTransaction().replace(R.id.fragment_container,new AboutFragment()).commit();
            }
       });

        Glide.with(this).load(R.drawable.suraj).apply(RequestOptions.circleCropTransform()).into(suraj);
        Glide.with(this).load(R.drawable.ayush).apply(RequestOptions.circleCropTransform()).into(ayush);

        Glide.with(this).load(R.drawable.amit).apply(RequestOptions.circleCropTransform()).into(amit);
        Glide.with(this).load(R.drawable.akarsh).apply(RequestOptions.circleCropTransform()).into(akarsh);
        Glide.with(this).load(R.drawable.kartik).apply(RequestOptions.circleCropTransform()).into(kartik);
        Glide.with(this).load(R.drawable.yuvraj).apply(RequestOptions.circleCropTransform()).into(yuvraj);
        Glide.with(this).load(R.drawable.simran).apply(RequestOptions.circleCropTransform()).into(simran);
        Glide.with(this).load(R.drawable.ankita).apply(RequestOptions.circleCropTransform()).into(ankita);
        Glide.with(this).load(R.drawable.pallavi).apply(RequestOptions.circleCropTransform()).into(pallavi);
        Glide.with(this).load(R.drawable.mamta).apply(RequestOptions.circleCropTransform()).into(mamta);
        Glide.with(this).load(R.drawable.abha).apply(RequestOptions.circleCropTransform()).into(abha);
        Glide.with(this).load(R.drawable.shubham).apply(RequestOptions.circleCropTransform()).into(shubham);
        return v;

    }

}
