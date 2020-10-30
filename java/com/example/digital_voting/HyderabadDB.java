package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class HyderabadDB extends AppCompatActivity {
    Button hyd_leaf_vote, hyd_dev_vote, hyd_farmer_vote,hyd_people_vote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad_d_b);
        hyd_leaf_vote=(Button)findViewById(R.id.hyd_leaf_vote);
        hyd_dev_vote=(Button)findViewById(R.id.hyd_dev_vote);
        hyd_farmer_vote=(Button)findViewById(R.id.hyd_farmer_vote);
        hyd_people_vote=(Button)findViewById(R.id.hyd_people_vote);

    }
}