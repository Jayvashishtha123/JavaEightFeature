package com.gevernova.javaeightfeature.VirtualClassroomUsingCollectionLibrary;


import java.util.HashMap;
import java.util.Map;

public class Assignment {
    public String title;
    public Map<Student, Submission> submission = new HashMap<>();

    Assignment(String title) {
        this.title = title;
    }

    public void submit(Student student, String content) {
        submission.put(student, new Submission(content));
    }
}
