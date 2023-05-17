package com.example.hcibookapp.model;

import java.util.ArrayList;
import java.util.List;

public class MainCourse {

    String mainCourseName;
    List<CourseSlides> slidesList = new ArrayList<>();

    public MainCourse(String mainCourseName, List<CourseSlides> slidesList) {
        this.mainCourseName = mainCourseName;
        this.slidesList = slidesList;
    }

    public String getMainCourseName() {
        return mainCourseName;
    }

    public List<CourseSlides> getSlidesList() {
        return slidesList;
    }
}
