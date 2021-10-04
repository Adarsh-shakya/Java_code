package com.company;

class ExtendM {
    int a;
    int b;
    void main()
    {
        int s=a+b;
        System.out.println(s);
    }
}
class nee extends ExtendM{
    int c;
    void m(){
     int sum=a+b+c;
        System.out.println(a+" "+b+" "+c);
    }
}
class execution{
    public static void main(String[] args) {
        ExtendM obj1=new ExtendM();
        nee obj2=new nee();
        obj1.a=3;
        obj1.b=9;
        System.out.println("output of supra class: ");
        obj1.main();
        obj2.c=4;
        obj2.a=7;
        obj2.b=3;
        System.out.println("output of extention class : ");
        obj2.m();
    }
}