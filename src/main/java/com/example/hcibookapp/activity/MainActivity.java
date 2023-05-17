package com.example.hcibookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.hcibookapp.R;
import com.example.hcibookapp.adapter.CustomAdapter;
import com.example.hcibookapp.model.CourseSlides;
import com.example.hcibookapp.model.MainCourse;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<MainCourse>mainCourseList;
    List<CourseSlides>slidesList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    expandableListView= (ExpandableListView) findViewById(R.id.expandableListView);

    addData();

    }
    void addData()
    {
        mainCourseList = new ArrayList<>();
        slidesList = new ArrayList<>();

        //course 1
        slidesList.add(new CourseSlides("Chapter 1","mL1"));
        slidesList.add(new CourseSlides("Chapter 2","mL2"));
        slidesList.add(new CourseSlides("Chapter 3","mL3"));
        slidesList.add(new CourseSlides("Chapter 4","mL4"));
        slidesList.add(new CourseSlides("Chapter 5","mL5"));
        slidesList.add(new CourseSlides("Chapter 6","mL6"));
        mainCourseList.add(new MainCourse("Human Computer Interaction",slidesList));

        slidesList = new ArrayList<>();
        slidesList.add(new CourseSlides("Chapter 1","mL1"));
        slidesList.add(new CourseSlides("Chapter 2","mL2"));
        slidesList.add(new CourseSlides("Chapter 3","mL3"));
        slidesList.add(new CourseSlides("Chapter 4","mL4"));
        slidesList.add(new CourseSlides("Chapter 5","mL5"));
        slidesList.add(new CourseSlides("Chapter 6","mL6"));
        mainCourseList.add(new MainCourse("Software Engineering",slidesList));





        sendData();

    }

    void sendData()
    {
        customAdapter = new CustomAdapter(mainCourseList, MainActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}