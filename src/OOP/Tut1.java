package OOP;

import jdk.swing.interop.SwingInterOpUtils;

public class Tut1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        int[] rno = new int[5];
//
//        Student[] students = new Student[5];
////        Student km;

        Student in = new Student();

        in.name = "karm";
        in.rno = 10;
        in.marks = 100;
        System.out.println(in.rno);
        System.out.println(in.name);
        System.out.println(in.marks);
    }

    static class Student{
        int rno;
        String name;
        float marks;
    }
}
