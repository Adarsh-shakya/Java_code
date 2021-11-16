import java.io.DataInputStream;

public class inputeFile {
    public static void main(String[] args) {
        float principlaAmount;
        float rateofInterest;
        int numberofYear;
        try {
            //throw Exception;
            DataInputStream in=new DataInputStream(System.in);
            String temString;
            System.out.print("Enter the Principal Amount: ");
            System.out.flush();
            temString=in.readLine();
            principlaAmount=Float.valueOf(temString);
            System.out.print("Enter the rate of interest: ");
            System.out.flush();
            temString=in.readLine();
            rateofInterest=Float.valueOf(temString);
            System.out.print("Enter the numer of Year: ");
            System.out.flush();
            temString=in.readLine();
            numberofYear=Integer.parseInt(temString);
            // Input  is over
            //calculate interest

            float TotalInterest=(principlaAmount*rateofInterest*numberofYear)/100;
            System.out.println("Interest="+TotalInterest);
        }
        catch (Exception ex)
        {}
    }
}
