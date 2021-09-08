public class StaticBlock {
     static double pi;
     //Static Block
// class level one time execution block
// static declaration
// static
// {
// }
// it is used to initialize the static attributes of the class
// at the time of loading the .class file
// static block execute before the main method
// yes we can create multiple static block inside the class
// they will execute on first come first server basis
    static {
        pi=3.14;
        System.out.println("static block 1");
    }
    public static void method1(){
        System.out.println("inside static method");
    }

    public static void main(String[] args) {
        System.out.println("main method invocation");
        System.out.println(pi);
        method1();
    }
}
