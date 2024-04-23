package com.example.androdid0417;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private TextView textView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_check_box);
        textView=findViewById(R.id.descripcheck);
        CheckBox checkBox=findViewById(R.id.check_sys);
        checkBox.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        textView.setText(isChecked ?"点击了":"取消了");
    }
}