package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class otpscreen extends AppCompatActivity {
    Button mobilenumber_button;
    Button mailid_button;
    Button submit_button;
    TextView sentto_textview;
    EditText enterotp_edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpscreen);
        submit_button=(Button)findViewById(R.id.submit_button);
        mobilenumber_button=(Button)findViewById(R.id.mobilenumber_button);
        mailid_button=(Button)findViewById(R.id.mailid_button);
        sentto_textview=(TextView)findViewById(R.id.sentto_textview);
        enterotp_edittext=(EditText)findViewById(R.id.enterotp_edittext);
        final Random random=new Random();
        final int i = random.nextInt(10000);
        mobilenumber_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add send otp to mobile num\
                try {
                    SmsManager smgr=SmsManager.getDefault();
                    String test_mob_num="9704469907";
                    //Random random=new Random();
                    //int i = random.nextInt(10000);
                    smgr.sendTextMessage(test_mob_num,null, "Your OTP is "+ i,null,null);
                    Toast.makeText(getApplicationContext(),"OTP sent to registered mobile number",Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                Toast.makeText(getApplicationContext(),"Could'nt send OTP",Toast.LENGTH_SHORT).show();
            }
            }
        });
        mailid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add send otp to mail
                try{
                    String email="sukrithamankala@gmail.com";
                    Intent intent=new Intent();
                    intent.setType("message/rfc822");
                    intent.putExtra(Intent.EXTRA_EMAIL,email);
                    intent.putExtra(intent.EXTRA_TEXT,"Your OTP is"+i);
                    startActivity(intent.createChooser(intent,"select a mail"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext(),"OTP sent to registered mail ID",Toast.LENGTH_SHORT).show();
            }
        });
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add if to validate the given otp with the sent otp

                if(enterotp_edittext.getText().toString().equals(String.valueOf(i))) {
                    Toast.makeText(getApplicationContext(),"OTP Validated!",Toast.LENGTH_SHORT).show();
                    openRegionScreen();
                }
                else if(enterotp_edittext.getText().toString().equals(String.valueOf(i))){
                    Toast.makeText(getApplicationContext(),"OTP from mail Validated",Toast.LENGTH_SHORT).show();
                    openRegionScreen();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid OTP!",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void openRegionScreen(){
        Intent intent=new Intent(this,regionscreen.class);
        startActivity(intent);
    }
}