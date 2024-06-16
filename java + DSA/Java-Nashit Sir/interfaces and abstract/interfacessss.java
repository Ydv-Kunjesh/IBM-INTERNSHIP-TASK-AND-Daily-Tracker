// package interfaces and abstract;

public class interfacessss {
    public static void main(String[] args) {

        child c = new child();
        c.car();
        c.savings();
        c.house();
        c.income();
        
    }
    
}

interface maternal {
    void car();

    void savings();
}
interface paternal {
    void house();

    void income();

    void car();
}
 class child implements maternal,paternal{
    public void car(){
        System.out.println("Maternal car");
    }
    public void savings(){
        System.out.println("Maternal savings");
    }
    public void house(){
        System.out.println("paternal house");
    }

    public void income() {
        System.out.println("paternal income");
    }
   
    
}