import java.util.*;
public  class StudentInfo4{
    int stu[][]=new int[3][3];

    public void main (){
        Scanner sca =new Scanner(System.in);
        for(int k=0;k<3;k++){
            System.out.println("Enter the age, roll no and height of "+(k+1)+" student: ");
            for(int i=0;i<3;i++){
            stu[k][i]=sca.nextInt();

        }}
    }
    public void out(){
        int AgeIndex=0;
        int HeightIndex=0;
        int MaxAge=0;
        int MaxHeight=0;

            for(int k=0;k<3;k++) {
                if (stu[k][0] > MaxAge) {
                    MaxAge = stu[k][0];
                    AgeIndex = k;
                }
                if (stu[k][2] > MaxHeight) {
                    MaxHeight = stu[k][2];
                    HeightIndex = k;

                }

        }
        System.out.println((AgeIndex+1)+" is the oldest student , And age is "+MaxAge);
        System.out.println((HeightIndex+1)+" is the tallest,And Height is "+MaxHeight);

    }
}
class studentInfor{
    public static void main(String []arge){
        StudentInfo4 obj=new StudentInfo4();
        obj.main();
        obj.out();

    }
}
