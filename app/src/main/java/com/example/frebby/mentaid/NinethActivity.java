package com.example.frebby.mentaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class NinethActivity extends AppCompatActivity implements View.OnClickListener {
    Button update;
    Intent intent;

    @Override
    public void onClick(View view) {
        if(update.isPressed()) {
            intent = new Intent(this, EleventhActivity.class);
            startActivity(intent);}

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth);
        update = findViewById(R.id.update);
        update.setOnClickListener(this);



    }
}