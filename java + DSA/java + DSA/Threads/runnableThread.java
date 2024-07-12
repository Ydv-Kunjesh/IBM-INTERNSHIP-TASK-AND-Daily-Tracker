class AA implements Runnable{ // here i have implemented runnable infertace which have single method run()
    @Override
    public   void run(){  
       for (int i = 0; i < 10; i++) {
        System.out.println("Hiii!!!");
       }
    }
}


class  BB implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hiii!!!");
           }
        }
}

public class runnableThread{
    public static void main(String a[]) {
        Runnable obj1  = new AA(); // now in main class i have taken refrence of Runnable interface an created object of AA class..
        Runnable obj2 = new BB();

        Thread t1 = new Thread(obj1); // now created a object of thread class which can take a runnable obj as a argument..
        Thread t2 = new Thread(obj2);
        t1.start();  // now i am able to call my start method coz thread can able to call run method..
        t2.start();        
    }
}

