package com.yunfeng.methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    private String name;
    private int score;

    public static int compareStudentByScore(Student student1,Student student2){
        return student1.getScore() - student2.getScore();
    }

    public static int compareStudentByName(Student student1,Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByScore(Student student){
        return this.getScore() - student.getScore();
    }
}
