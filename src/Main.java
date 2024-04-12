import br.com.dio.project.domain.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Java Developer");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(mentor);

        Dev dev = new Dev();
        dev.setName("Mark");
        dev.subscribeBootcamp(bootcamp);
        System.out.println("Mark content to do " + dev.getContentSet());
        dev.progress();
        dev.progress();

        System.out.println("-------------------------------------------------");
        System.out.println("Mark content to do " + dev.getContentSet());
        System.out.println("Mark content finished " + dev.getContentEnded());
        System.out.println("XP " + dev.gainXP());

        Dev dev1 = new Dev();
        dev1.setName("Joao");
        dev1.subscribeBootcamp(bootcamp);
        System.out.println("Joao content to do " + dev1.getContentSet());
        dev1.progress();

        System.out.println("-------------------------------------------------");
        System.out.println("Joao content to do " + dev1.getContentSet());
        System.out.println("Joao content finished " + dev1.getContentEnded());
        System.out.println("XP " + dev1.gainXP());

    }
}