package com.pradeep.sundayclasses;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        final LinearLayout lay;
        ImageView view2;
        TextView outcome;
        lay= findViewById(R.id.lay);
        view2=findViewById(R.id.view2);
        TextView yes;
        yes=findViewById(R.id.yes);
        outcome=findViewById(R.id.outcome);



        Animation anim2=new AlphaAnimation(0.0f,1.0f);
        anim2.setDuration(75);
        anim2.setStartOffset(20);
        anim2.setRepeatMode(Animation.REVERSE);
        anim2.setRepeatCount(Animation.INFINITE);
        yes.startAnimation(anim2);


        Glide.with(this).load(R.drawable.sir).into(view2);

        Glide.with(this).load(R.drawable.grad).centerCrop().into(new CustomTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                lay.setBackground(resource);
            }

            @Override
            public void onLoadCleared(@Nullable Drawable placeholder) {

            }
        });

        outcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, com.pradeep.sundayclasses.Outcome_Activity.class);

                startActivity(i);
            }

        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, com.pradeep.sundayclasses.HomeActivity.class);

                startActivity(i);
            }

        });



    }
}
