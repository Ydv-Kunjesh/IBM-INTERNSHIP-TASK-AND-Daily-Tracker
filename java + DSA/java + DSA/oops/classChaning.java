public class classChaning {
    public static void main(String[] args) {
        A a = new A();
        a.A1();
    
        //to call its inner class and their methods 
        // A.B b = a.new B();
        // b.AInner();


        //if inner class is static then we have to call it using outer class name\
        // we can create a inner class with static modifier .

        A.B b1 = new A.B();
        b1.AInner();


    }
}


class A {
    public void A1() {
        System.out.println("A1 Called");
    }

   static class B {
        public void AInner() {
            System.out.println("A Inner Called");
        }
    }
}