public class interfaces {
    public static void main(String[] args) {
        Herbivorus Deer = new Herbivorus();
        Deer.Name = "Kunjesh";
        Deer.Age = 13;
        Deer.eats();
        Deer.LivesOn();
    }
}
interface Animal {

    void LivesOn();
    void eats();
}
class Herbivorus implements Animal {
    String Name = "Hiran";
     int Age = 23;
    public void eats() {
        System.out.println(this.Name + " eat only Veggies and crops" + this.Age);
    }
    public void LivesOn() {
        System.out.println(this.Name + " Lives in Plains " );
    }

    
}