public class Book {
    String Bname;
    static String author;
    double price;
    int qtyInstock;
    static
    {
        author = "R.D.Shakya";
        System.out.println(author);
    }

    public static String getAuthor() {
        return author;
    }

    public String getBname() {
        return Bname;
    }

    public double getPrice() {
        return price;
    }

    Book(String bname, double price, int qtyInstock) {
        Bname = bname;
        this.price = price;
        this.qtyInstock = qtyInstock;
        System.out.println(Bname);
        System.out.println(price);
        System.out.println(qtyInstock);
    }


        public static void main(String[] args) {
            Book obj1, obj2, obj3;
            obj1=new Book ("Engineering Math", 23.90, 23);
            obj2=new Book("Engineering math 2",78.90,45);
            obj3=new Book("Engineering math 3",67.56,90);
    }
}


