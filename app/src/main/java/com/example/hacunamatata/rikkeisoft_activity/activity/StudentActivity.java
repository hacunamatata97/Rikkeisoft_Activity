package com.example.hacunamatata.rikkeisoft_activity.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.hacunamatata.rikkeisoft_activity.R;
import com.example.hacunamatata.rikkeisoft_activity.model.Student;

public class StudentActivity extends AppCompatActivity {

    TextView mStudentName;
    EditText mHomeTown, mDOB, mGender, mClass, mCourse;
    Button mFinish;

    Student mStudent;

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        //Initialize variables
        mContext = this;

        mStudentName = (TextView) findViewById(R.id.Display_Name);

        mHomeTown = (EditText) findViewById(R.id.Text_HomeTown);
        mDOB = (EditText) findViewById(R.id.Text_DOB);
        mGender = (EditText) findViewById(R.id.Text_Gender);
        mClass = (EditText) findViewById(R.id.Text_Class);
        mCourse = (EditText) findViewById(R.id.Text_Course);

        mFinish = (Button) findViewById(R.id.finishBtn);



        //Get the Intent
        Intent intent = getIntent();
        final String studentName = intent.getStringExtra(MainActivity.STUDENT_NAME);

        mStudentName.setText(studentName);

        mFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStudent = new Student(mStudentName.getText().toString(),
                        mHomeTown.getText().toString(),
                        mHomeTown.getText().toString(),
                        mGender.getText().toString(),
                        mClass.getText().toString(),
                        mCourse.getText().toString());

                Bundle bundle = new Bundle();
                bundle.putParcelable("ParcelKey", mStudent);

                Intent secondIntent = new Intent(mContext, StudentInfoActivity.class);
                secondIntent.putExtras(bundle);
                mContext.startActivity(secondIntent);
            }
        });
    }
}
