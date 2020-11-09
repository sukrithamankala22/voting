package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class regionscreen extends AppCompatActivity {
    Spinner region_spinner;
    Button next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regionscreen);
        next_button=(Button)findViewById(R.id.next_button);
        region_spinner=(Spinner)findViewById(R.id.region_spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.region));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        region_spinner.setAdapter(adapter);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(region_spinner.getSelectedItem().toString().equals("Select your region")){
                    Toast.makeText(getApplicationContext(),"Select a region!",Toast.LENGTH_SHORT).show();
                }
                if(region_spinner.getSelectedItem().toString().equals("Hyderabad")){
                    openHydActivity();
                }
                if(region_spinner.getSelectedItem().toString().equals("Khammam")){
                    openKhaActivity();
                }
                if(region_spinner.getSelectedItem().toString().equals("Mahabubnagar")){
                    openMehActivity();
                }
                if(region_spinner.getSelectedItem().toString().equals("Nizamabad")){
                    openNizActivity();
                }
                if(region_spinner.getSelectedItem().toString().equals("Siddipet")){
                    openSidActivity();
                }
                if(region_spinner.getSelectedItem().toString().equals("Warangal")){
                    openWarActivity();
                }
            }
        });

    }
    public void openHydActivity(){
        Intent i=new Intent(this,HyderabadDB.class);
        startActivity(i);
    }
    public void openKhaActivity(){
        Intent i=new Intent(this,KhammamDB.class);
        startActivity(i);
    }
    public void openMehActivity(){
        Intent i=new Intent(this,MahabubnagarDB.class);
        startActivity(i);
    }
    public void openNizActivity(){
        Intent i=new Intent(this,NizamabadDB.class);
        startActivity(i);
    }
    public void openSidActivity(){
        Intent i=new Intent(this,SiddipetDB.class);
        startActivity(i);
    }
    public void openWarActivity(){
        Intent i=new Intent(this,WarangalDB.class);
        startActivity(i);
    }

}
