package com.pradeep.sundayclasses;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               int id=menuItem.getItemId();
                if(id==R.id.navigation_about)
                {
                   AboutFragment  fragment=new AboutFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fragment);
                    fragmentTransaction.commit();
                }
              /* if(id==R.id.navigation_join)
               {
                   JoinFragment fragment=new JoinFragment();
                   FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container, fragment);
                   fragmentTransaction.commit();
               }

               */

                if(id==R.id.navigation_contact)
                {
                     ContactFragment fragment=new ContactFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fragment);
                    fragmentTransaction.commit();
                }


                if(id==R.id.navigation_advantage)
                {
                    AdvantageFragment fragment=new AdvantageFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fragment);
                    fragmentTransaction.commit();
                }
                return true;
            }
        });

        navView.setSelectedItemId(R.id.navigation_about);

    }
    @Override
    public void onBackPressed() {
        BottomNavigationView mBottomNavigationView = findViewById(R.id.nav_view);
        if (mBottomNavigationView.getSelectedItemId() == R.id.navigation_about)
        {
            super.onBackPressed();
            finish();
        }
        else
        {
            mBottomNavigationView.setSelectedItemId(R.id.navigation_about);
        }

    }
}