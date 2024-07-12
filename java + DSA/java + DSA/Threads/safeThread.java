public class safeThread {
    public static void main(String args[]){

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i=0;i<1000;i++){

                c.Increment();
                // System.out.println("Hii");
            }
        };


        Runnable obj2 = () -> {
            for(int i=0;i<1000;i++){
                c.Increment();
                // System.out.println("Hiii");

            }
        };

 
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    try {

    t1.join();
    t2.join();
    
} catch (InterruptedException e) {
System.out.println(e);

}
        System.out.println(c.num);
    }
    
}

class Counter{
        int num=0;
    public synchronized void Increment(){
         num++;
    }
}