public class Account {
    String name;
    int AccNo;
    public void setName(String name,int AccNO) {
        this.AccNo=AccNO;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAccNo() {
        return AccNo;
    }
}
class AccountMain{
    public static void main(String[] args) {
        Account obj=new Account();
        obj.setName("adarsh",2341);
        System.out.println(obj.getAccNo());
        System.out.println(obj.getName());
    }
}