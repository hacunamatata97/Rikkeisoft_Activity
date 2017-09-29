package com.example.hacunamatata.rikkeisoft_activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.example.hacunamatata.rikkeisoft_activity.R;
import com.example.hacunamatata.rikkeisoft_activity.model.Student;

public class StudentInfoActivity extends AppCompatActivity {

    private TextView mName, mHomeTown, mDOB, mGender, mClass, mCourse;
    private Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        //Initialize variables
        mName = (TextView) findViewById(R.id.Display_StudentName);
        mHomeTown = (TextView) findViewById(R.id.Display_HomeTown);
        mDOB = (TextView) findViewById(R.id.Display_DOB);
        mGender = (TextView) findViewById(R.id.Display_Gender);
        mClass = (TextView) findViewById(R.id.Display_Class);
        mCourse = (TextView) findViewById(R.id.Display_Course);

        //Get bundle
        Bundle bundle = getIntent().getExtras();
        mStudent = bundle.getParcelable("ParcelKey");

        //Set data to views
        if(mStudent != null) {
            mName.setText(mStudent.getName());
            mHomeTown.setText(mStudent.getHomeTown());
            mDOB.setText(mStudent.getDOB());
            mGender.setText(mStudent.getGender());
            mClass.setText(mStudent.getAClass());
            mCourse.setText(mStudent.getCourse());
        } else {
            Log.d("Debug: ", "Here");
        }
    }
}
