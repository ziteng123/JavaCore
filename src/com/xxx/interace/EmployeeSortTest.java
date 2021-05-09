package com.xxx.interace;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("张三",35000);
        staff[1] = new Employee("李四",7000);
        staff[2] = new Employee("王五",80000);
        Arrays.sort(staff);
        for(Employee e:staff){
            System.out.println("name:"+e.getName()+",salary:"+e.getSalary());
        }
        Employee[] staff2 = new Employee[3];
        for(int i = 0; i < staff2.length; i++){
            String name = sc.next(); // 以空格，回车为结束
            double salary = sc.nextDouble();
            staff2[i] = new Employee(name,salary);
        }
        Arrays.sort(staff2,new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        Arrays.sort(staff2,(o1,o2)->o2.getName().compareTo(o1.getName()));
        for(Employee e2:staff2){
            System.out.println("name:"+e2.getName()+",salary:"+e2.getSalary());
        }
    }
}
