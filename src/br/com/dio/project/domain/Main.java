package br.com.dio.project.domain;

import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        course.setTitle("Java Course");
        course.setDescription("Help to learn Java");
        course.setHourCourse(8);

        Course course1 = new Course();
        course1.setTitle("Javascript Course");
        course1.setDescription("Better way to learn Javascript");
        course1.setHourCourse(8);

        Mentor mentor =new Mentor();
        mentor.setTitle("Java Mentor Help");
        mentor.setDescription("Help to learn Java better and fast");
        mentor.setDate(LocalDate.now());

        System.out.println(course);
        System.out.println(course1);
        System.out.println(mentor);
    }
}