package com.example.hacunamatata.rikkeisoft_activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.hacunamatata.rikkeisoft_activity.R;

public class MainActivity extends AppCompatActivity {

    public static final String STUDENT_NAME = "Student Name";

    Button mNext;
    EditText mName;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize variables
        mName = (EditText) findViewById(R.id.Text_StudentName);
        mNext = (Button) findViewById(R.id.nextBtn);



        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent
                intent = new Intent(getBaseContext(), StudentActivity.class);
                String name = mName.getText().toString();
                intent.putExtra(STUDENT_NAME, name);
                startActivity(intent);
            }
        });
    }
}
