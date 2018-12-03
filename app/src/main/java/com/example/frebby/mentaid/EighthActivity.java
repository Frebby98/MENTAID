package com.example.frebby.mentaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Eight extends AppCompatActivity implements View.OnClickListener {
    TextView message;
    Intent intent;

    @Override
    public void onClick(View view) {
        if (message.isSelected()){
            intent = new Intent(this, EightActivity.class);
            startActivity(intent);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);



    }
}
