package com.example.frebby.mentaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button connect;
    Intent intent;

    @Override
    public void onClick(View view) {
        if (connect.isPressed()) {
            intent = new Intent(this, NinethActivity.class);
            startActivity(intent);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        connect = findViewById(R.id.connect);
        connect.setOnClickListener(this);


    }
}