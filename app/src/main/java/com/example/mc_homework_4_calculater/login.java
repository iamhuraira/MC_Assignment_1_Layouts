package com.example.mc_homework_4_calculater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private Button button, button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        button = (Button) findViewById(R.id.calc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalc();
            }
        });
        button1 = (Button) findViewById(R.id.aboutBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });
    }
    public void openCalc(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openAbout(){
        Intent intent1 = new Intent(this, profile.class);
        startActivity(intent1);
    }
}
