package com.example.androdid0417;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReesiveActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reesive);
        textView=findViewById(R.id.Recesive_content);
        Bundle bundle= getIntent().getExtras();
        textView.setText(bundle.getString("send_content"));
        findViewById(R.id.ReturnButton).setOnClickListener(this);

        TextView textView1=findViewById(R.id.Returntv);
        textView1.setText("大家好才是真的好");



    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        bundle.putString("return_content","大家好才是真的好");
        intent.putExtras(bundle);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}