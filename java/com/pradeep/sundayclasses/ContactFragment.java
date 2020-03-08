package com.pradeep.sundayclasses;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Text;

public class ContactFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.contact,container,false);
        Toolbar contactBar;
       final  BottomNavigationView navView = v.findViewById(R.id.nav_view);
        TextView callID1;
        TextView callID2;
        TextView callID3;
       final  LinearLayout back1;
        back1=v.findViewById(R.id.back1);
        final LinearLayout background;
        background=v.findViewById(R.id.background);

        callID1=v.findViewById(R.id.callID1);
        callID2=v.findViewById(R.id.callID2);
        callID3=v.findViewById(R.id.callID3);
        TextView join1;
        join1=v.findViewById(R.id.join1);

        TextView mail;
        mail=v.findViewById(R.id.mail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","vsmsundayclasses@gmail.com",null));
                i.putExtra(Intent.EXTRA_SUBJECT,"");
                getContext().startActivity(Intent.createChooser(i,null));
            }

        });

        Glide.with(this).load(R.drawable.cream).into(new CustomTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                background.setBackground(resource);
            }

            @Override
            public void onLoadCleared(@Nullable Drawable placeholder) {

            }
        });

        Glide.with(this).load(R.drawable.back).centerCrop().into(new CustomTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                back1.setBackground(resource);
            }

            @Override
            public void onLoadCleared(@Nullable Drawable placeholder) {

            }
        });


        callID1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8979802572"));
                startActivity(i);
            }

        });

        callID2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7060664058"));
                startActivity(i);
            }

        });

        callID3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7060143357"));
                startActivity(i);
            }

        });



        join1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/TMZHL9Vao6i2fiBU7"));
                startActivity(i);


            }
        });
        return v;
    }
}
