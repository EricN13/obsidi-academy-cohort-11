package com.bptn.course.exercises.ModelinUniversityStudent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods.

        // Create a bunch of student objects
        // (Make sure one student has the following studentId: 123)
        // (Make sure one other student has the following username: testUsername1)
        // Start by looking in the University and Student classes. Implement the methods.
        University university = new University();
        //created a date format to use for date
        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Create a bunch of student objects
        // First student
        Student st1 = new Student();

        st1.setStudentId(123);
        st1.setUserName("testUsername1");
        st1.setPassword("pass00");
        st1.setFirstName("Eric");
        st1.setLastName("N");
        st1.setEmail("eric@example.com");
        st1.setPhone("1234567890");
        st1.setAddress("Montreal");
        st1.setGender("Male");
        st1.setBirthdate(new Date());
        st1.setAdmissionDate(new Date());
        st1.setRollNumber(1);
        st1.setCurriculumName("Computer Science");


        // Second student
        Student st2 = new Student();

        st2.setStudentId(124);
        st2.setUserName("testUsername2");
        st2.setPassword("pass124");
        st2.setFirstName("Ade");
        st2.setLastName("B");
        st2.setEmail("ade@example.com");
        st2.setPhone("1234567891");
        st2.setAddress("Toronto");
        st2.setGender("Male");
        st2.setBirthdate(new Date());
        st2.setAdmissionDate(new Date());
        st2.setRollNumber(2);
        st2.setCurriculumName("Software Engineering");


        // Third student
        Student st3 = new Student();

        st3.setStudentId(125);
        st3.setUserName("testUsername3 ");
        st3.setPassword("pass125");
        st3.setFirstName("Ilhan");
        st3.setLastName("A");
        st3.setEmail("ilhan@example.com");
        st3.setPhone("1234567892");
        st3.setAddress("Ottawa");
        st3.setGender("Female");
        st3.setBirthdate(new Date());
        st3.setAdmissionDate(new Date());
        st3.setRollNumber(3);
        st3.setCurriculumName("Computer Science");


        // Add students to university
        university.addStudent(st1);
        university.addStudent(st2);
        university.addStudent(st3);



        // Create instance of university called "university" and populate it with the students.

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}