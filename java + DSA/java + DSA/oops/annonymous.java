public class annonymous{
    public static void main(String[] args) {
        outerClass obj = new outerClass();
        obj.show();


        // if i want to reimplement this method without writing a new class
        outerClass obj1 = new outerClass() 
        {
            @Override
            public void show() {  // we can Declere a method here.
                System.out.println("New implementation of show class");
            }
        };
        obj1.show(); //methood calling
        
    }
}

 class outerClass {
     public void show() {
        System.out.println("Show method called");
     };
}