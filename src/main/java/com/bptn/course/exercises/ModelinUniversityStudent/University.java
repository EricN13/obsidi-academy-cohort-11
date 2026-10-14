package com.bptn.course.exercises.ModelinUniversityStudent;


import com.bptn.course.exercises.ModelinUniversityStudent.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

public class University {

    // created arraylist to store students

    ArrayList<Student> students = new ArrayList<>();

    // property - get inspired by the UML diagram

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
        students.add(s);
    }

    public Student getStudent(long studentId) {
        // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
        for (Student st : students) {
            if (st.getStudentId() == studentId) {
                return st;
            }

        }
        return null;
    }

    public List<Student> searchStudent(String userNamePrefix) {
        // return all students that have usernames beginning with the prefix
        List<Student> results = new ArrayList<>();
        for(Student student : students){
            if(student.getUserName().
                    startsWith(userNamePrefix)){
                results.add(student);
            }

        }

        return results;
    }

    public boolean deleteStudent(long studentId) {
        // return if a successful deletion happened
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStudentId()==studentId){
                students.remove(students.get(i));
                return true;
            }
        }
        return false;
    }

}