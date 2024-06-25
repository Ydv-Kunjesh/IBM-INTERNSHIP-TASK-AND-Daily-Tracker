

 class threadsss {
public static void main(String[] args) {

    A a = new A();
    B b = new B();

    a.start();

    b.start();

    // to set priority of a thread
    b.setPriority(1);

    a.setPriority(10);

    // to get priority of a thread
    System.out.println(a.getPriority() + " priority");
    System.out.println(b.getPriority() + " priority");
   
}

}

class A extends Thread{
    public void run()
{
    for(int i=0;i<5;i++)
    {
   System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
  try{
    Thread.sleep(1);
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
    }
}
}


class B extends  Thread{
    public void run()
{
  for(int i=0;i<5;i++)
    {
   System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB!");
    }
}
}


