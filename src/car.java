import java.util.*;
public class car
{
    String carName;
    int    carPrice;
    String colour;
}
class carMain
{
    public static void main(String []args)
    {
        car c[]=new car[3];
        Scanner sca=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            c[i]=new car();
            System.out.println("Enter the name of car: ");
            c[i].carName=sca.nextLine();
            System.out.println("enter the Price of car: ");
            c[i].carPrice=sca.nextInt();
            System.out.println("Enter the Colour of the car: ");
            sca.nextLine();
            c[i].colour=sca.nextLine();
        }
        System.out.println("Name"+"        "+"Colour"+"       "+"Prices");
        for(int i=0;i<3;i++)
        {
            System.out.printf("%-12s%-13s%d\n",c[i].carName,c[i].colour,c[i].carPrice);
        }
    }
}
