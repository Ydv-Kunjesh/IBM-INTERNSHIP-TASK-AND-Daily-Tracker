public class enumClass {
    private static Laptop[] lp;

    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        // firing a loop to  get all the devices and their prices

        Laptop[] lap1 = Laptop.values(); // if i ask to all the vlues by using laptop.values then it return mee an array tahts why we are writing the array variabble
        
        for (Laptop lp : lap1) {
            System.out.println(lp + " : "+ lp.getPrice());
        }

        
    }
}


enum Laptop {
    Macbook(2000),xp(1200),ibm(1300);
    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}