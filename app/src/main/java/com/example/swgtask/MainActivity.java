package com.example.swgtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText NAME,ROLLNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NAME = findViewById(R.id.NAME);
        ROLLNO = findViewById(R.id.ROLLNO);


    }

    public void WelcomePage(View view) {
        Toast.makeText(this,"Data was entered Successfully",Toast.LENGTH_LONG).show();
        String name = NAME.getText().toString();
        String RollNo = ROLLNO.getText().toString();
        Intent i = new Intent(MainActivity.this, Welcome.class);
        i.putExtra("Name",name);
        i.putExtra("RollNo.",RollNo);
        startActivity(i);


    }
}