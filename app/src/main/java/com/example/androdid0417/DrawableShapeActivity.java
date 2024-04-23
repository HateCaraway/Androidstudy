package com.example.androdid0417;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DrawableShapeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_shape);
        textView=findViewById(R.id.showShape);
        findViewById(R.id.BeRound).setOnClickListener(this);
        findViewById(R.id.BeSquare).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.BeRound:
                textView.setBackgroundResource(R.drawable.shape_round);
                break;
            case R.id.BeSquare:
                textView.setBackgroundResource(R.drawable.shape_square);

        }
    }
}