package com.example.hacunamatata.rikkeisoft_activity.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String mName, mHomeTown, mDOB, mGender, mClass, mCourse;

    public Student(String name, String homeTown, String DOB, String gender, String aClass,
            String course) {
        mName = name;
        mHomeTown = homeTown;
        mDOB = DOB;
        mGender = gender;
        mClass = aClass;
        mCourse = course;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getHomeTown() {
        return mHomeTown;
    }

    public void setHomeTown(String homeTown) {
        mHomeTown = homeTown;
    }

    public String getDOB() {
        return mDOB;
    }

    public void setDOB(String DOB) {
        mDOB = DOB;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getAClass() {
        return mClass;
    }

    public void setAClass(String aClass) {
        mClass = aClass;
    }

    public String getCourse() {
        return mCourse;
    }

    public void setCourse(String course) {
        mCourse = course;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    protected Student(Parcel in) {
        mName = in.readString();
        mHomeTown = in.readString();
        mDOB = in.readString();
        mGender = in.readString();
        mClass = in.readString();
        mCourse = in.readString();
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mName);
        out.writeString(mHomeTown);
        out.writeString(mDOB);
        out.writeString(mGender);
        out.writeString(mClass);
        out.writeString(mCourse);
    }
}
