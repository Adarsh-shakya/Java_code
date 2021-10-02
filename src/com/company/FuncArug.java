package com.company;
public class FuncArug
{
    void  func(int  num1,int num2)
    {
        int s=num1+num2;
        System.out.println("sum= "+s);
    }
}
class funcMain
{
    public static void main(String []args){
        FuncArug obj1=new FuncArug();
        FuncArug obj2=new FuncArug();
        FuncArug obj3=new FuncArug();
        obj1.func(3,5);
        obj2.func(2,4);
        obj3.func(9,3);
    }
}
