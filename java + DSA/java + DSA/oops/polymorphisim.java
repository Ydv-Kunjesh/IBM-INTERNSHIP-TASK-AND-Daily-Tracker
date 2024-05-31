public class polymorphisim {
    public static void main(String[] args) {
        Animal Ani1 = new Animal();
        Ani1.name = "Lion";
        System.out.println(Ani1.name);
        Ani1.color = "Redish Brown";
        System.out.println(Ani1.color);
        Ani1.eat();
        System.out.println("Animal class ends here");
        System.out.println();

        Deer Deer1 = new Deer();
        Deer1.name = "Kala Hiran";
        System.out.println(Deer1.name);
        Deer1.color = "Brown";
        System.out.println(Deer1.color);
        Deer1.eat();
        System.out.println();
        System.out.println("Now overloadinng starts form now");

        Addition Add1 = new Addition();
        Add1.sum(1, 2);
        Add1.sum(1.2f,2.3f);
        Add1.sum(1, 2,3);
    }
}

// Overriding in polymorphism
class Animal {
    String name;
    String color;

    void eat() { // this method will get overrided by their child classes
        System.out.println(this.name + " Can Eat");
    }

}

class Deer extends Animal {
    @Override
    void eat() { //by using this eat function which already exit in our base class but we are gonna override it there.
        System.out.println(this.name + " Can eat Grass");
    }
}


// Overloading in polymorphism
class Addition {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum (int a , int b , int c){
        System.out.println(a + b + c);
        ;
    }
}
