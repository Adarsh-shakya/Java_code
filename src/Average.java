import java.util.*;

public class Average {
    int number;
    double Aveg;
    void main(){
        int sum=0;
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the any five number: ");
        for(int i=0;i<5;i++){
        number=sca.nextInt();
        sum+=number;
        }
        Aveg=sum/5;
    }
}
class AverageMain{
    public static void main(String[] args) {
        Average obj=new Average();
        obj.main();
        System.out.println(obj.Aveg);
    }
}