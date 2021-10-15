public class overload {


    // method overloading...
    void main() {
        System.out.println("no parameter:");
    }

    void main(int a) {
        System.out.println("Only one parameter: " + a);
    }

    void main(int a, int b) {
        System.out.println("It have two parameter: " + a + " " + b);
    }
}
    class load
    {
        public static void main(String arg[])
        {
            overload obj=new overload();
            obj.main();
            obj.main(2);
            obj.main(3,4);
        }
    }

