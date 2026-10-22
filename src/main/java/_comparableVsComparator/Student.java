package _comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private int id;
    private String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student oth){
        return Integer.compare(this.id, oth.id);
    }

    @Override
    public String toString(){
        return "StudentId : "+id + "| Name : " + name;
    }

}

class Main{
    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        System.out.println("====== Before ======");
        System.out.println(sList);
        sList.add(new Student(33,"Aman"));
        sList.add(new Student(13,"Aman Kr"));
        sList.add(new Student(3,"Aman Jha"));

        Collections.sort(sList);
        System.out.println("====== After ======");
        System.out.println(sList.toString());
    }
}