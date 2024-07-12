class A extends Thread{
    public void run(){
        for( int i=0;i<100;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

}


class B extends Thread{
    public void run(){
        for(int i =0 ; i<100; i++){
            System.out.println("Hello ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}



public class thread{
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new  B();

        obj.start();
        thread.sleep(100);
        obj1.start();
    }

    private static void sleep(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }
}