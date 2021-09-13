public class Bicycle {
    //Data member
    private String OwnerName;
    private String Tango;
    //constructor
    public Bicycle(){
        OwnerName="Unknown";
        Tango="Unknown";
    }
    public void setOwnerName(String ownerName ,String tango) {
        OwnerName = ownerName;
        Tango=tango;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getTango()
    {
        return Tango;
    }
}// End of the class

class Account2{
    //Date member
    private String name;
    private double balance;
    //constructor
public Account2(){
    name="unknuwn";
    balance=0.0;
}
//Add the passed amount from the balance
    public void add(double temp){
    balance+=temp;
    }
    //deducts the passed amount from the balance
    public void deducts(double temp){

   balance-=temp;    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


//Execution class
class BicycleMain {
    public static void main(String[] args) {
        Bicycle bike1,bike2;
        bike1=new Bicycle();
        bike1.setOwnerName("Adarsh","rakhi");
        bike2=new Bicycle();
        bike2.setOwnerName("Shivam","Rastogi");
        System.out.println(bike1.getOwnerName());
        System.out.println(bike2.getOwnerName());
        System.out.println(bike1.getTango());
        System.out.println(bike2.getTango());
    }
}
// 2nd execution class
class SecondMain{
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        Account2 acct=new Account2();
        String MyName="Jone Jon";
        bike.setOwnerName(MyName,"raju");
        acct.setBalance(250.15);
        acct.setName(MyName);
        acct.add(25.00);
        acct.deducts(50.00);
        // Output some information
        System.out.println(bike.getOwnerName());
        System.out.println(acct.getBalance());
    }

}

