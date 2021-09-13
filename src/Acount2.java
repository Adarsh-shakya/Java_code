public class Acount2 {
    static String Name;
    double balence;

     Acount2(){
        Name = "john doe";
        System.out.println(Name);

    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public double getBalence() {
        return balence;
    }

    //end of class
//execution class
    public static void main(String[] args) {
        Acount2 acct1 = new Acount2();
        acct1.setBalence(300.0);
        System.out.println(acct1.getBalence());
        Acount2 acct2 = new Acount2();
        acct2.setBalence(500.0);
        System.out.println(acct2.getBalence());


    }
}
