package com.example.androdid0417;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Jumpchaptr01).setOnClickListener(this);
        findViewById(R.id.JumpDial).setOnClickListener(this);
        findViewById(R.id.JumpSMS).setOnClickListener(this);}
    @Override
    public void onClick(View v) {
        String fhonenum="12345";
        Intent intent=new Intent();
        switch (v.getId()){
            case R.id.JumpDial:

                intent.setAction(Intent.ACTION_DIAL);
                Uri uri=Uri.parse("tel:"+fhonenum);
                intent.setData(uri);
                startActivity(intent);
                break;
            case R.id.JumpSMS:
                intent.setAction(Intent.ACTION_SENDTO);
                Uri uri1=Uri.parse("smsto:"+fhonenum);
                intent.setData(uri1);
                startActivity(intent);
                break;
            case R.id.Jumpchaptr01:

               intent.setComponent(new ComponentName("com.example.chaptr01","com.example.chaptr01.MainActivity"));
                startActivity(intent);
                break;
        }}}