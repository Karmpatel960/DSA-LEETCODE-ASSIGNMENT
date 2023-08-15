package OOP;

import jdk.swing.interop.SwingInterOpUtils;

public class Tut1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        int[] rno = new int[5];

        Student[] students = new Student[5];
//        Student km;
        System.out.println(students);
    }

    class Student{
        int rno;
        String name;
        float marks;
    }
}
