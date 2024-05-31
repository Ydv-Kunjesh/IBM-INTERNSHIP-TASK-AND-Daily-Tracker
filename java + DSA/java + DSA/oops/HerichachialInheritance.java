

public class HerichachialInheritance {
    
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.name = "Shark";
        Shark.color = "Bright White";
        System.out.println(Shark.name + Shark.color);
        Shark.eat();
        Shark.breath();
        Shark.LiveIn();
        System.out.println("Fish Class  Ends ");
        System.out.println();
        System.out.println();

        dogs jungli = new dogs();
        jungli.name = "street dogs";
        System.out.println(jungli.name);
        jungli.color = "Red";
        System.out.println(jungli.color);
        jungli.bark();
        jungli.eat();
        jungli.breath();
       


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
class Fish extends Animal {
    void LiveIn() {
        System.out.println(this.name + " Lives in water");
    }
}

// herichichal Inheritance
class dogs extends Animal{
    String Breed;

    void bark() {
        System.out.println("Dogs Can bark");
    }
}


