interface  computer {
    public abstract void code();

}
class Desktop implements computer {
    public void code() {
        System.out.println("coding");
    }
}

class laptop implements computer {
    public void code() {
        System.out.println("coding");
    }
}

class dev implements computer{
    public void AppDev() {
        System.out.println("app dev");
    }

        public void code() {
        System.out.println("WE cant go with you ");

    }
}


public class interf {
    public static void main(String[] args) {
       
        Desktop d = new Desktop();
        d.code();
        laptop l = new laptop();
        l.code();
        dev d1 = new dev();
        d1.AppDev();
        d1.code();
    }
}