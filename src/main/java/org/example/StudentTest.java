package org.example;
import java.util.*;
import java.util.logging.Logger;
import java.lang.*;
class Student{
    String studentname;
    int studentage;
    double studentgpa;
    static Logger l=Logger.getLogger("com.api.jar");
    Student(){
    }
    void setter(String name,int age,double gpa){
        this.studentname=name;
        this.studentage=age;
        this.studentgpa=gpa;
    }

    String getter1(){
        return this.studentname;
    }
    int getter2(){
        return this.studentage;
    }
    double getter3(){
        return this.studentgpa;
    }

}
class Main implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return (int) ((int)a.studentgpa- b.studentgpa);
    }
}
class StudentTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");
        l.info("Enter the size of an array");
        int count=sc1.nextInt();
        String[] n=new String[count];
        int[] age = new int[count];
        double[] grade=new double[count];
        for(int i=0;i<count;i++){
            l.info("Enter the student name:");
            n[i]=sc.nextLine();
            l.info("Enter the student age:");
            age[i]=sc1.nextInt();
            l.info("Enter the student grade level:");
            grade[i]=sc1.nextDouble();
        }

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.setter(n[0],age[0],grade[0]);
        s2.setter(n[1],age[1],grade[1]);
        s3.setter(n[2],age[2],grade[2]);
        ArrayList <Student>list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("Unsorted array");
        for(int i=0;i<count;i++){
            System.out.println("The student name is "+list.get(i).getter1());
            System.out.println("The Student age is "+list.get(i).getter2());
            System.out.println("The student gpa is "+list.get(i).getter3());
        }
        System.out.println("Sorted  Array");
        Collections.sort(list,new Main());
        for(int i=0;i<count;i++){
            System.out.println("The student name is "+list.get(i).getter1());
            System.out.println("The Student age is "+list.get(i).getter2());
            System.out.println("The studentgpa is "+list.get(i).getter3());
        }

    }
}