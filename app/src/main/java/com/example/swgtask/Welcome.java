package com.example.swgtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    private TextView NAME,ROLLNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        NAME = findViewById(R.id.NAME2);
        ROLLNO = findViewById(R.id.ROLLNO2);

        String name = getIntent().getStringExtra( "Name");
        String RollNo = getIntent().getStringExtra( "RollNo.");

        NAME.setText(name);
        ROLLNO.setText(RollNo);

    }
}