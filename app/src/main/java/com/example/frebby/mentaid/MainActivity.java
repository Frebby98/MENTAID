package com.example.frebby.mentaid;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button login;
    Intent intent;

    @Override
    public void onClick(View view) {
        if(login.isPressed()) {
            intent = new Intent(this, SeventhActivity.class);
            startActivity(intent);}

    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);



    }
}
