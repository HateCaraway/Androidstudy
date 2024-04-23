package com.example.androdid0417;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private TextView textViewshow;
    private ActivityResultLauncher<Intent> register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        textView =findViewById(R.id.sent_content);
        textViewshow=findViewById(R.id.returntvshow);
        findViewById(R.id.send_button).setOnClickListener(this);


        register = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

            @Override
            public void onActivityResult(ActivityResult result) {
                if (result!=null){
                    Intent intent=result.getData();
                    if (intent!=null && result.getResultCode()== Activity.RESULT_OK){
                        Bundle bundle=intent.getExtras();
                        textViewshow.setText(String.format(bundle.getString("return_content")));
                    }
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,ReesiveActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("send_content",textView.getText().toString());
        intent.putExtras(bundle);
        register.launch(intent);


    }
}