package com.pradeep.sundayclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_team);

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
        suraj=findViewById(R.id.suraj);
        ayush=findViewById(R.id.ayush);
        amit=findViewById(R.id.amit);
        akarsh=findViewById(R.id.akarsh);
        kartik=findViewById(R.id.kartik);
        yuvraj=findViewById(R.id.yuvraj);
        simran=findViewById(R.id.simran);
        ankita =findViewById(R.id.ankita);
        pallavi=findViewById(R.id.pallavi);
        mamta=findViewById(R.id.mamta);
        abha=findViewById(R.id.abha);
        shubham=findViewById(R.id.shubham);

        toolbar=findViewById(R.id.toolbar);
       /* toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Team.this, com.pradeep.sundayclasses.HomeActivity.class);
                startActivity(i);
                finish();
            }
        });

        */

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
    }
}
