package com.example.frebby.mentaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EighthActivity extends AppCompatActivity implements View.OnClickListener {
Button editProf;
    Intent intent;

    @Override
    public void onClick(View view) {
        if (editProf.isPressed()){
            intent = new Intent(this, NinethActivity.class);
            startActivity(intent);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        editProf = findViewById(R.id.edit_prof);
        editProf.setOnClickListener(this);
    }
}
