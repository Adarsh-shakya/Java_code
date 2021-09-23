import java.text.DecimalFormat;
        import java.util.Scanner;

public class StudentInfo {
    int Roll_no;
    int age;
    int height;

    public static void main(String[] args) {
        StudentInfo st[] = new StudentInfo[3];
        Scanner sca = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            st[i] = new StudentInfo();
            System.out.println("Enter the  age of student " + (i + 1) + " : ");
            st[i].age = sca.nextInt();
            System.out.println("Enter the  Roll_no of student " + (i + 1) + " : ");
            st[i].Roll_no = sca.nextInt();
            System.out.println("Enter the  height of " + (i + 1) + " : ");
            st[i].height = sca.nextInt();
            sum += st[i].age;
        }
        System.out.println("Average of age student: " + df.format(sum / 3));
    }}