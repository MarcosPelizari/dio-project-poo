package br.com.dio.project.domain;

import java.time.LocalDate;

public class Course {

    private String title;
    private String description;
    private int hourCourse;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHourCourse() {
        return hourCourse;
    }

    public void setHourCourse(int hourCourse) {
        this.hourCourse = hourCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hourCourse=" + hourCourse +
                '}';
    }
}
