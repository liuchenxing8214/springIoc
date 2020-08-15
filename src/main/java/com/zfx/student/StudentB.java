package com.zfx.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentB {
    @Autowired
    private StudentA studentA;

    public StudentB() {
        System.out.println("create StudentB");
    }


    public StudentB(StudentA studentA) {
        this.studentA = studentA;
    }

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }
}
