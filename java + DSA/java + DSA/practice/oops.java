public class oops {
    public static void main(String[] args) {
        // Object
        Animal Ani1 = new Animal(); // defininng object
        Ani1.name = "Cow";
        Ani1.age = 12;
        System.out.println("My name is " + Ani1.name + " I am " + Ani1.age + " year old" );
        Ani1.CanWalk();
        Ani1.caneat();
        
        
        // lion object
        Lion L1 = new Lion(); // object
        L1.name = "Gullu";
        L1.age = 21;
        L1.color = "Yellow";
        System.out.println("my name is" + L1.name + " i am " + L1.age + " year old" + " my color is " + L1.color);
        L1.caneat();


System.out.println();
System.out.println();
System.out.println();
System.out.println();

        // Deer object
        Deer d1 = new Deer(); // object
        d1.name = "Sanju kanwadiya";
        d1.age = 21;
        d1.color = "Yellow";
        System.out.println("my name is" + d1.name + " i am " + d1.age + " year old" + " my color is " + d1.color);
        d1.caneat();



        
    }
}


// class
class Animal { // Base class or parent class
    String name;
    int age;

    public void CanWalk() {
        System.out.println("Can Walk");
    }
    public void caneat() {
        System.out.println("can eat");
    }
}

class Lion extends Animal {  // Child class
    String color;
   @Override
    public void caneat() {
        System.out.println("Lion can eat only meat");
    }
}
class Deer extends Animal {   // child class
    String color;
    @Override
    public void caneat() {
        System.out.println( this.name +" can eat only grass");
    }
}


// Lesson: Object-Oriented Programming Concepts
// If you've never used an object-oriented programming language before, you'll need to learn a few basic concepts before you can begin writing any code. This lesson will introduce you to objects, classes, inheritance, interfaces, and packages. Each discussion focuses on how these concepts relate to the real world, while simultaneously providing an introduction to the syntax of the Java programming language.

// What Is an Object?
// An object is a software bundle of related state and behavior. Software objects are often used to model the real-world objects that you find in everyday life. This lesson explains how state and behavior are represented within an object, introduces the concept of data encapsulation, and explains the benefits of designing your software in this manner.

// What Is a Class?
// A class is a blueprint or prototype from which objects are created. This section defines a class that models the state and behavior of a real-world object. It intentionally focuses on the basics, showing how even a simple class can cleanly model state and behavior.

// What Is Inheritance?
// Inheritance provides a powerful and natural mechanism for organizing and structuring your software. This section explains how classes inherit state and behavior from their superclasses, and explains how to derive one class from another using the simple syntax provided by the Java programming language.

// What Is an Interface?
// An interface is a contract between a class and the outside world. When a class implements an interface, it promises to provide the behavior published by that interface. This section defines a simple interface and explains the necessary changes for any class that implements it.

// What Is a Package?
// A package is a namespace for organizing classes and interfaces in a logical manner. Placing your code into packages makes large software projects easier to manage. This section explains why this is useful, and introduces you to the Application Programming Interface (API) provided by the Java platform.

// Polymorphism
// The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages. This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.