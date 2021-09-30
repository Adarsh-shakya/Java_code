import java.util.*;
public class Number
{
    private int num;

    Number(int Num)
    {
        this.num=Num;
    }
    Boolean isZero()
    {
        if(num==0)
            return true;
        else
            return false;
    }
    Boolean isPositive()
    {
        if(num>0)
            return true;
        else
            return false;
    }
    Boolean isNegative()
    {
        if(num<0)
            return true;
        else
            return false;
    }
    Boolean isOdd()
    {
        if(num%2==0)
            return false;
        else
            return true;
    }
    Boolean isEven()
    {
        if(num%2!=0)
            return false;
        else
            return true;
    }
    Boolean isPrime()
    {
        int count=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==0)
            return true;
        else
            return false;
    }
    int Getfactorial(){
        int Fact=1;
        for(int i=1;i<=num;i++){
            Fact*=i;
        }
        return Fact;
    }

    int GetSqrt(){
        return (int) Math.sqrt(num);
    }

    int GetSqur()
    {
        return num*num;
    }

}
class numMain
{
    public static void main(String []arge)
    {
        System.out.println("Enter the Number: ");
        Number obj=new Number(new Scanner(System.in).nextInt());
        if(obj.isZero()) System.out.println("number is zero");
        if(obj.isEven()) System.out.println("Number is Even");
        if(obj.isOdd()) System.out.println("Number is Odd");
        if(obj.isNegative()) System.out.println("Number is Negative");
        if(obj.isPositive()) System.out.println("Number is Positive");
        if(obj.isPrime()) System.out.println("Number is Prime");
        System.out.println("Factorial of a Number is "+obj.Getfactorial());
        System.out.println("Sqrt of a Number is "+obj.GetSqrt());
        System.out.println("Square of a number is "+obj.GetSqur());

    }
}