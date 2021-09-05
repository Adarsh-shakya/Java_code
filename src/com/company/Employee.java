package com.company;
import java.sql.Struct;
import java.util.Scanner;

public class Employee {
    static String []address=new String[4];
    static String []name=new String[4];
    static int []Year_of_joining=new int[4];
    public static void input(){
        Scanner sca =new Scanner(System.in);
        for(int i=1;i<4;i++){
            System.out.println("Enter the name 0f"+ i +" employee: ");
            name[i]=sca.next();
            System.out.println("Enter the joining year of"+ i +" employee: ");
            Year_of_joining[i]=sca.nextInt();
            System.out.println("Enter the address of the"+ i +" employee: ");
            address[i]=sca.next();
        }
    }
    public static void print(){
        System.out.println("Name       Year 0f the joining       address");
        for(int i=1;i<4;i++){
            System.out.println(name[i]+"            "+Year_of_joining[i]+"                  "+address[i]);
        }
    }

    public static void main(String[] args) {
        Employee.input();
        Employee.print();
    }
}
