package com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary;

import com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary.Assignment;
import com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary.Course;
import com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary.Instructor;
import com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Map<String, Student> students = new HashMap<>();
    static Map<String, Instructor> instructors = new HashMap<>();
    static Map<String, Course> courses = new HashMap<>();

    static void main() {
        while (true) {
            System.out.println("\n======VIRTUAL CLASSROOM======");
            System.out.println("1. Add Student");
            System.out.println("2. Add Instructor");
            System.out.println("3. Create Course");
            System.out.println("4. Request Enrollment");
            System.out.println("5. Approve Enrollment");
            System.out.println("6. Add Assignment");
            System.out.println("7. Submit Assignment");
            System.out.println("8. Grade Assignment");
            System.out.println("9. View Grades");
            System.out.println("10. View All Students");
            System.out.println("11. View All Instructor");
            System.out.println("12. View All Courses");
            System.out.println("13. View Students in courses");
            System.out.println("14. View Instructor of course");
            System.out.println("15. View Assignment of Course");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch ((choice)) {
                case 1 -> addStudent();
                case 2 -> addInstructor();
                case 3 -> createCourse();
                case 4 -> requestEnrollment();
                case 5 -> approveEnrollment();
                case 6 -> addAssignment();
                case 7 -> submitAssignment();
                case 8 -> gradeAssignment();
                case 9 -> viewGrades();
                case 10 -> viewAllStudent();
                case 11 -> viewAllInstructor();
                case 12 -> viewAllCourses();
                case 13 -> viewStudentInCourse();
                case 14 -> viewInstructorOfCourse();
                case 15 -> viewAssignmentOfCourse();
                case 0 -> {
                    System.out.println(".......Exiting bye bye.......");
                    return;
                }
                default -> System.out.println(".......Invalid Choice.......");
            }
        }
    }

    static void addStudent() {
        System.out.println("Student Id : ");
        String id = sc.nextLine();
        System.out.print("Student Name : ");
        String name = sc.nextLine();
        students.put(id, new Student(id, name));
    }

    static void addInstructor() {
        System.out.println("Instructor Id : ");
        String id = sc.nextLine();
        System.out.print("Instructor Name : ");
        String name = sc.nextLine();
        instructors.put(id, new Instructor(id, name));
    }

    static void createCourse() {
        System.out.println("Course Id : ");
        String id = sc.nextLine();
        System.out.print("Course Name : ");
        String name = sc.nextLine();
        System.out.print("Instructor ID : ");
        String iid = sc.nextLine();
        Instructor instructor = instructors.get(iid);

        if (instructor == null) {
            System.out.println("Invalid instructor ID.");
        }
        courses.put(id, new Course(id, name, instructor));
    }

    static void requestEnrollment() {
        System.out.println("Student ID : ");
        Student s = students.get(sc.nextLine());
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());

        if (s == null || c == null) {
            System.out.println("Invalid student or course: ");
            return;
        }
        c.requestEnrollment(s);
    }

    static void approveEnrollment() {
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());

        if (c == null) {
            System.out.println("Invalid course: ");
            return;
        }
        c.approveEnrollment();
    }

    static void addAssignment() {
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());

        if (c == null) {
            System.out.println("Invalid course: ");
            return;
        }
        System.out.println("Assignment Title : ");
        c.addAssignment(sc.nextLine());
    }

    static void submitAssignment() {
        System.out.println("Student ID : ");
        Student s = students.get(sc.nextLine());
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());

        System.out.println("Assignment Title : ");
        Assignment a = c != null ? c.getAssignment(sc.nextLine()) : null;

        if (s == null || c == null || a == null) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Submission Content : ");
        a.submit(s, sc.nextLine());
    }

    static void gradeAssignment() {
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());

        System.out.println("Assignment Title : ");
        Assignment a = c != null ? c.getAssignment(sc.nextLine()) : null;

        if (a == null) {
            System.out.println("Invalid Assignment: ");
            return;
        }

        for (Student s : a.submission.keySet()) {
            System.out.print("Grade for " + s.name + " : ");
            a.submission.get(s).grade = sc.nextInt();
        }
        sc.nextLine();
    }

    static void viewGrades() {
        System.out.println("Course ID");
        Course c = courses.get(sc.nextLine());

        System.out.println("Assignment Title : ");
        Assignment a = c != null ? c.getAssignment(sc.nextLine()) : null;

        if (a == null) {
            System.out.println("Invalid Assignment: ");
            return;
        }
        for (var entry : a.submission.entrySet()) {
            System.out.print(entry.getKey().name + " -> " + entry.getValue().grade);
        }
    }

    static void viewAllStudent() {
        if (students.isEmpty()) {
            System.out.println(".....No Student There Yet........");
        }
        students.values().forEach(s ->
                System.out.println("ID: " + s.id + ", Name: " + s.name));
    }

    static void viewAllInstructor() {
        if (instructors.isEmpty()) {
            System.out.println(".....No instructor There Yet........");
        }
        instructors.values().forEach(i ->
                System.out.println("ID: " + i.id + ", Name: " + i.name));
    }

    static void viewAllCourses() {
        if (courses.isEmpty()) {
            System.out.println(".....No Student There Yet........");
        }
        courses.values().forEach(c ->
                System.out.println("Course ID: " + c.getCourseId()
                        + ", Name: " + c.getCourseName()
                        + ", Instructor: " + c.getInstructor().name));
    }

    static void viewStudentInCourse() {
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());
        if (c == null) return;

        c.getStudents().forEach(s ->
                System.out.println("ID: " + s.id + ", Name: " + s.name));
    }

    static void viewInstructorOfCourse() {
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());
        if (c == null) return;

        Instructor i = c.getInstructor();
        System.out.println("Instructor Id: " + i.id + ", Name: " + i.name);
    }

    static void viewAssignmentOfCourse() {
        System.out.println("Course ID : ");
        Course c = courses.get(sc.nextLine());
        if (c == null) return;

        c.getAssignments().forEach(a ->
                System.out.println("Assignment : " + a.title));
    }
}
