
abstract class NSTI { // abstract parent class
    public void Dehradun() {
        System.out.println("Welcome to NSTI Dehradun");
    };

    public abstract void Kolkatta(); // anonymous class with abstract method

    public abstract void Kanpur();

}

class Adit extends NSTI { //concrete child class to use abstract methods

    

    public void Kolkatta() {
        System.out.println("Kolkatta");
    }

    public void Kanpur() {
        System.out.println("Kanpur");
    }

    public void Dehradun() {
        System.out.println("Dehradun");
    }

    
    
    
    private int age = 30;
    public int salary = 400000;
    protected int height = 5;
    public void patna() {
        System.out.println("Welcome to Patna");
    }

    public void detail() {
        System.out.println(age + " " + salary + " " + height);
    }
}


public class interfaces  {
    public static void main(String[] args) {
        Adit adit = new Adit();
        adit.detail();
        adit.patna();

        

        

    }
}
