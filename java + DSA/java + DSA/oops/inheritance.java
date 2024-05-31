public class inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.name = "Shark";
        Shark.color = "Bright White";
        System.out.println(Shark.name + Shark.color);
        Shark.eat();
        Shark.breath();
        Shark.LiveIn();


    }
}

// Base Class
class Animal {
    String name;
    String color;

    void eat() {
        System.out.println(this.name + " Can Eat");
    }

    void breath() {
        System.out.println(this.name + " Can Breath");
    }

}

// Derived Class  or Child Class
class Fish extends  Animal{
    void LiveIn() {
        System.out.println(this.name + " Lives in water");
    }
}
