public class Student {
    // Data hiding
   private int st_roll_no;// instance variable
    private String st_name; // instance variable
    private static String C_name;// static variable
    //static block
    // it use for initialisation of static variable
     static
     {
         C_name="GLA University";
     }
    public int getSt_roll_no() {
        return st_roll_no;
    }

    public static String getC_name() {
        return C_name;
    }

    public String getSt_name() {
        return st_name;
    }

    public Student(int st_roll_no,String st_name) {
         this.st_roll_no=st_roll_no;
         this.st_name=st_name;
    }
}
//Execution class
class studentMain {
    public static void main(java.lang.String[] args) {

        Student obj1 = new Student(Integer.parseInt(args[0]), args[1]);
        System.out.println(obj1.getSt_roll_no());
        System.out.println(obj1.getSt_name());
        System.out.println(Student.getC_name());

    }
}