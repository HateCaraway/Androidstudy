package com.example.androdid0417;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReadStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_string);
        TextView textView=findViewById(R.id.tv_resoure);
        textView.setText(     getString(R.string.company_name));
    }
}