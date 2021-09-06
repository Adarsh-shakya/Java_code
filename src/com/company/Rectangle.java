package com.company;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;
    public void setvalue(int l,int b){
        length=l;
        breadth=b;
    }
    public  void print(){
        System.out.println("Area of rectangle: "+length*breadth);
    }
}
class rectangle_test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle obj=new Rectangle();
        System.out.println("Enter the length and breadth: ");
        obj.setvalue(sc.nextInt(), sc.nextInt());
        obj.print();
    }
}