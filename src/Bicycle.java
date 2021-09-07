public class Bicycle {
    //Data member
    private String OwnerName;
    //constructor
    public Bicycle(){
        OwnerName="Unknown";
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getOwnerName() {
        return OwnerName;
    }
}// End of the class
//Execution class
class BicycleMain {
    public static void main(String[] args) {
        Bicycle bike1,bike2;
        bike1=new Bicycle();
        bike1.setOwnerName("Adarsh");
        bike2=new Bicycle();
        bike2.setOwnerName("Shivam");
        System.out.println(bike1.getOwnerName());
        System.out.println(bike2.getOwnerName());
    }
}
