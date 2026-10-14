package com.bptn.course.exercises.ModelinUniversityStudent;
import java.util.*;

import java.util.*;

public class Student {

// attributes of the student

    private long studentId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private Date birthdate;
    private Date admissionDate;
    private long rollNumber;
    private String curriculumName;

    public Student(long studentId,
                   String userName,
                   String password,
                   String firstName,
                   String lastName,
                   String email,
                   String phone,
                   String address,
                   String gender,
                   Date birthdate,
                   Date admissionDate,
                   long rollNumber,
                   String curriculumName) {
        this.studentId = studentId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.birthdate = birthdate;
        this.admissionDate = admissionDate;
        this.rollNumber = rollNumber;
        this.curriculumName = curriculumName;
    }
    public Student(){}

    /* Implement getters and setters */

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId=studentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate=birthdate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate=admissionDate;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber=rollNumber;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }
    /* ------end section of getters and setters----------*/

    public boolean editStudent(List<Student> universityStudents, Student student) {
        // Given a list of students, find by id a student that matches the id of the given student and replace it with the given student.
        for(Student s : universityStudents){
            if(s.getStudentId() == student.getStudentId()){
                universityStudents.set(universityStudents.indexOf(s), student);
                return true;
            }
        }
        return false;
        // CAN THIS BE REFACTORED? Think about it and give some comments here. Could this method be better placed in a different class? Maybe yes, maybe not. Why?
       /* This method definitely can be refactored, and placed within a different class.
          1. There are other ways of iterating the student list such as:
            for(int i=0; i<universityStudents.size();i++) universityStudents.get(i) ,
            universityStudents.forEach(System.out::println) ,
            or Iterator<Student> it = universityStudents.iterator();
          2. This methodology is also redundant, because the entire list of students is passed
            into the Student object. The editStudent() method should be placed
            within the University class since it retains the main list of students
        */
    }

    public String toString() {
        return "\nStudent: \n" +
                "studentId = " + this.studentId + "\n" +
                "userName = " + this.userName + "\n" +
                "password = " + this.password + "\n" +
                "firstName = " + this.firstName + "\n" +
                "lastName = " + this.lastName + "\n" +
                "email = " + this.email + "\n" +
                "phone = " + this.phone + "\n" +
                "address = " + this.address + "\n" +
                "gender = " + this.gender + "\n" +
                "birthdate = " + this.birthdate + "\n" +
                "admissionDate = " + this.admissionDate + "\n" +
                "rollNumber = " + this.rollNumber + "\n" +
                "curriculumName = " + this.curriculumName + "\n";
    }

}