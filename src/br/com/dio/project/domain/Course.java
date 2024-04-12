package br.com.dio.project.domain;

import java.time.LocalDate;

public class Course extends Content {

    private int hourCourse;

    public Course() {
    }

    public int getHourCourse() {
        return hourCourse;
    }

    public void setHourCourse(int hourCourse) {
        this.hourCourse = hourCourse;
    }

    @Override
    public double calculateXP() {
    return XP_PADRAO * hourCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", hourCourse=" + hourCourse +
                '}';
    }
}
