package com.zfx.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentA {

    @Autowired
    private StudentB studentB;

    public StudentA() {
        System.out.println("create StudentA");
    }

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }

    public void setStudentB(StudentB studentB) {
        this.studentB =studentB;
    }
}
