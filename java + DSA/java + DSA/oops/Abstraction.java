
// import java.lang.classfile.instruction.ThrowInstruction;

public class Abstraction {
    public static void main(String[] args) {
        // Animal ani1 = new Animal();    //this line throws an error coz we can't make a new instance of that abstract class

        cow c1 = new cow();
        c1.name = "Gaiya";
        c1.Age = 5;
        c1.detail();
        c1.canWalk();

        
    }
}


abstract class Animal {
    int Age;

    abstract void canWalk();

    abstract void detail();
}



class cow extends Animal {
    String name;
    @Override
    void canWalk() {
        System.out.println(this.name + " Can Walk on 4  Legs");
    }
    @Override
    void detail() {
        System.out.println("I am  " + this.name + " With the age of " + this.Age );
    }
}