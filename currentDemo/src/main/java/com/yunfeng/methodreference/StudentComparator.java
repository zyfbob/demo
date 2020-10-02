package com.yunfeng.methodreference;

public class StudentComparator {
    public int compareStudentByScore(Student student1,Student student2){
        return student2.getScore() - student1.getScore();
    }
}
