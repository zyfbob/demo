package com.yunfeng.methodreference;

import java.util.Arrays;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {

        Student student1 = new Student("zhangsan",60);
        Student student2 = new Student("lisi",70);
        Student student3 = new Student("wangwu",80);
        Student student4 = new Student("zhaoliu",90);
        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        students.sort((o1, o2) -> o1.getScore() - o2.getScore());
        students.forEach(student -> System.out.println(student.getScore()));
        /**
         * 静态方法,类::方法名
         */
        students.sort(Student::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));
        /**
         * 对象::方法名
         */
        StudentComparator studentComparator = new StudentComparator();
        students.sort(studentComparator::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));

        /**
         *类名::实例方法名 这种方法引用的特殊之处：当使用 类名::实例方法名 方法引用时，
         * 一定是lambda表达式所接收的第一个参数来调用实例方法，如果lambda表达式接收多个参数，
         * 其余的参数作为方法的参数传递进去。
         */
        students.sort(Student::compareByScore);
        students.forEach(student -> System.out.println(student.getScore()));


    }
}
