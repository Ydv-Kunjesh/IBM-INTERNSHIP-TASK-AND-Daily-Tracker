class upcasting {
    public static void main(String[] args) {

    //upcasting in java mean pass object of sub class to parent class
    A obj = new B();   //  here we are doing upcasting from sub class to parent class
    obj.showA();

    //downcasting in java mean pass object of parent class to sub class
    B obj1 = (B)obj;   //  here we are doing downcasting from parent class to sub class by passing the object ref of parent class
    obj1.showB();
   
    }
}

class A {
    void showA() {
        System.out.println("I am in A class");
    }
}

class B extends A {
    void showB() {
        System.out.println("I am in B class");
    }
}