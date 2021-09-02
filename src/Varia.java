class Varia {
         int a;//Instance variable
         int b;//Instance variable
    public void m1()//Instance variable
    {
        System.out.println("Instance variable");
    }

    public static void main(String[] args) {
        Varia obje=new Varia();
        obje.m1();
        System.out.println(obje.a);
        System.out.println(obje.b);
    }
}
class test{
    static int num1; //Static variable
    static public void m2(){//Static Method
        System.out.println("This is static method");
    }

    public static void main(String[] args) {
        num1=90;
        m2();
    }
}