package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HyderabadDB extends AppCompatActivity {
    Button hyd_leaf_vote, hyd_dev_vote, hyd_farmer_vote,hyd_people_vote;
    Button hp1viewc,hp2viewc,hp3viewc,hp4viewc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad_d_b);
        hyd_leaf_vote=(Button)findViewById(R.id.hyd_leaf_vote);
        hyd_dev_vote=(Button)findViewById(R.id.hyd_dev_vote);
        hyd_farmer_vote=(Button)findViewById(R.id.hyd_farmer_vote);
        hyd_people_vote=(Button)findViewById(R.id.hyd_people_vote);
        hp1viewc=(Button)findViewById(R.id.hp1viewc);
        hp2viewc=(Button)findViewById(R.id.hp2viewc);
        hp3viewc=(Button)findViewById(R.id.hp3viewc);
        hp4viewc=(Button)findViewById(R.id.hp4viewc);
        hp1viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhc1();
            }
        });
        hp2viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhc2();
            }
        });
        hp3viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhc3();
            }
        });
        hp4viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhc4();
            }
        });
        hyd_leaf_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });


    }
    public void openhc1(){
        Intent i =new Intent(this,hyd_c_one.class);
        startActivity(i);
    }
    public void openhc2(){
        Intent i=new Intent(this, hyd_c_two.class);
        startActivity(i);
    }
    public void openhc3(){
        Intent i=new Intent(this, hyd_c_three.class);
        startActivity(i);
    }
    public void openhc4(){
        Intent i=new Intent(this,hyd_c_four.class);
        startActivity(i);
    }
    public void openFingerprintauth(){
        Intent i=new Intent(this,fingerprintauth.class);
        startActivity(i);
    }


}