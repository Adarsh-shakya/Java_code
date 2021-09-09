public class Student2 {
    String name;
    {
        name="Unknown";
    }

    Student2(String name) {
        this.name = name;
        System.out.println(name);
    }

    Student2(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student2 obj=new Student2("Adarsh");

    }
}
