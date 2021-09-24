import java.util.Scanner;
public class StudentInfo2{
    int age;
    int roll;
    int height;
}
class studentInfoMain{
    public static void main(String []args){
    StudentInfo2 st[]=new StudentInfo2[5];
    Scanner sca =new Scanner(System.in);
    int MaxAge=0;
    int MaxHeight=0;
    int heightIndex=0;
    int AgeIndex=0;
  for(int i=0;i<5;i++){
        st[i]=new StudentInfo2();
        System.out.println("Enter the age of "+(i+1)+" student: ");
      st[i].age=sca.nextInt();
      System.out.println("Enter the roll number of "+(i+1)+" student: ");
      st[i].roll=sca.nextInt();
      System.out.println("Enter the height of "+(i+1)+" student: ");
      st[i].height=sca.nextInt();
    }

        for(int i=0;i<5;i++){
            if(MaxHeight<st[i].height){
                MaxHeight=st[i].height;
                heightIndex=i;
            }
            if(MaxAge<st[i].age){
                MaxAge=st[i].age;
                AgeIndex=i;

            }
        }
            System.out.println((AgeIndex+1)+" is the oldest person, and age is "+MaxAge);
            System.out.println((heightIndex+1)+" is the tallest person,and Height is "+MaxHeight);

    }
}

