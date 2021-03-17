package com.sajidur.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Welcome extends AppCompatActivity {
    private SharedPreferences prefs = null;
    private MaterialButton materialButtonStartJourney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        materialButtonStartJourney=findViewById(R.id.materialButtonStartJourney);



        prefs = getPreferences(Context.MODE_PRIVATE);
        if(prefs.getBoolean("firstRun",true)){
            System.out.println("2nd");
            materialButtonStartJourney.setVisibility(View.GONE);
        }else{
            materialButtonStartJourney.setVisibility(View.VISIBLE);
            materialButtonStartJourney.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Welcome.this,SplashActivity.class));
                }
            });

          // System.out.println("1st");
          //  prefs.edit().putBoolean("firstRun", false).commit();
        }
    }
}