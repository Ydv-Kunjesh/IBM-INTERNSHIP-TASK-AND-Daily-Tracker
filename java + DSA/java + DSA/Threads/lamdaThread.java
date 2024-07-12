public class lamdaThread {
   public static void main(String[] args) {
    // creating  object of it
    Runnable obj1 = new Runnable() { // now we can write it likethat but if i want to write it in lambda style then see the next object code block
        @Override
        public void run() {
            for (int  i=0;i<5;i++) {
                System.out.println("hiii");
            }
        }
    };

    Runnable obj2 = () -> { // this ishow we can write our own thread in lamda style
        for(int i=0;i<5;i++){
            System.out.println("Hello world");
        }
    };


    Thread t1 = new Thread(obj1);
    Thread t2  = new Thread(obj2);

    t1.start();
    t2.start();


       
   } 
}


