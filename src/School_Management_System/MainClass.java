package School_Management_System;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class MainClass
{
    public static void main(String[] args)
    {
        Teacher Naveen = new Teacher(1,"Naveen",5000);
        Teacher Ramu = new Teacher(2,"Ramu",600);
        Teacher Lamxmi = new Teacher(3,"Laxmi",70000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Naveen);
        teacherList.add(Ramu);
        teacherList.add(Lamxmi);
        Student Neha = new Student(1,"Neha",4);
        Student Harika = new Student(2,"Harika",8);
        Student Niharikha = new Student(3,"Niharikha",10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Neha);
        studentList.add(Harika);
        studentList.add(Niharikha);


        School RBS = new School(teacherList,studentList);

        Neha.payFees(5000);
        Harika.payFees(8000);
        System.out.println("Total Amount Earned by RBS is "+RBS.getTotalMoneyEarned());


        System.out.println("----------------Salary Pay by RBS----------------");
        Naveen.receiveSalary(Naveen.getSalary());
        System.out.println("RBS has spent for Salary to " + Naveen.getName() + " is " + RBS.getTotalMoneyEarned());
        Ramu.receiveSalary(Ramu.getSalary());
        System.out.println("RBS has Spent for Salary to " + Ramu.getName() + " is " + RBS.getTotalMoneyEarned());
        System.out.println(Neha);
        System.out.println(Naveen);
    }
}
