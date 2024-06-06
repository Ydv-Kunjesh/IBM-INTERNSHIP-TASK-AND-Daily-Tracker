public class superr {
    public static void main(String[] args) {
        adit adit = new adit();
        adit.newew();
    }
}


class practice { // base class
    String name;
    int age;

    public void canWalk() {
        System.out.println("Can walk");
    }

    public practice() {
        System.out.println("constructor");
    }
}

class adit extends practice { // child class
    
     public void newew() {
    super.canWalk();
  }
   
}