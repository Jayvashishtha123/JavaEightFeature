package com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course {
    private String courseId;
    private String courseName;
    private Instructor instructor;

    private List<Student> enrolledStudent = new ArrayList<>();
    private Queue<Student> requests = new LinkedList<>();
    private List<Assignment> assignments = new ArrayList<>();

    public Course(String courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void requestEnrollment(Student s) {
        requests.offer(s);
    }

    public void approveEnrollment() {
        if (!requests.isEmpty()) {
            Student s = requests.poll();
            enrolledStudent.add(s);
            System.out.println(s.name + " enrolled Successfully.");
        } else {
            System.out.println("No pending enrollment requests yet.");
        }
    }

    public void addAssignment(String title) {
        assignments.add(new Assignment((title)));
    }

    public Assignment getAssignment(String title) {
        for (Assignment a : assignments) {
            if (a.title.equals(title)) return a;
        }
        return null;
    }

    public List<Student> getStudents() {
        return enrolledStudent;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
