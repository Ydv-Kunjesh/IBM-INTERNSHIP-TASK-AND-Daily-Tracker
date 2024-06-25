interface A{
    void Show();

}


// Functional Interface 

interface B{
    void ShowDetail();
}

public class LambdaFunction {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void Show() {
                System.out.println("Interface Called");
            }

        };
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        a.Show();


        // Functional  interface 
        B b = () -> System.out.println("Functional Interface");
        b.ShowDetail();

    }

 
}