package com.example.frebby.mentaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button register;
    Intent intent;

    @Override
    public void onClick(View view) {
        if (register.isPressed()) {
            intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
register = findViewById(R.id.register);
        register.setOnClickListener(this);


    }
}