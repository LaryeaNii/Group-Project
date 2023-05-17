package com.example.hcibookapp.model;

public class CourseSlides {

    String slideName;
    String fileName;

    public CourseSlides(String courseName, String fileName) {
        this.slideName = courseName;
        this.fileName = fileName;
    }

    public String getSlideName() {
        return slideName;
    }

    public String getFileName() {
        return fileName;
    }
}
