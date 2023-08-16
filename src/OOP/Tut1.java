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

        Student in = new Student(10,"kaak",20);
//        in.greeting();

//        in.name = "karm";
//        in.rno = 10;
//        in.marks = 100;

        Student random = new Student(in);

        System.out.println(random.name);
        System.out.println(in.rno);
        System.out.println(in.name);
        System.out.println(in.marks);
    }

    static class Student{
        int rno;
        String name;
        float marks = 90;

        void greeting(){
            System.out.println("Hello World" + this.name);
        }

        void changename(String s){
            this.name = s;
        }

        Student(Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student(int rno , String nm , float fe){
            this.name = nm;
            this.rno = rno;
            this.marks = fe;
        }
    }
}
