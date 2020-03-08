package com.pradeep.sundayclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Outcome_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_outcome);
        ImageView result1;
        ImageView result2;
        result1=findViewById(R.id.result1);
        result2=findViewById(R.id.result2);
        Glide.with(this).load(R.drawable.t).into(result1);
        Glide.with(this).load(R.drawable.toppers).into(result2);

    }
}
