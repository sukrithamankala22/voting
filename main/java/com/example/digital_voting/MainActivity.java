package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText aadhar_number;
    Button requestotp_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aadhar_number=(EditText) findViewById(R.id.aadhar_number);
        final String number = aadhar_number.toString();
        requestotp_button=(Button)findViewById(R.id.requestotp_button);
        requestotp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if ((aadhar_number.toString().length())==12) {
                  //  otpscreenintent();
                //}
                    if(validate()){
                        otpscreenintent();
                    }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid aadhar number",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
    public boolean validate(){
        if ((aadhar_number.length())==12){
            return true;
        }
        return false;
    }
    public void otpscreenintent(){
        Intent i= new Intent(this,otpscreen.class);
        startActivity(i);
    }
}