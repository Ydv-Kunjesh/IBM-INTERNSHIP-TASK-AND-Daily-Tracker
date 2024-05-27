public class arguments {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling method: " + x);
        modifyValue(x);
        System.out.println("After calling method: " + x);
    }

    public static void modifyValue(int a) {
        a = 20;
        System.out.println("Inside method: " + a);
    }
}






    // public static void main(String[] args) {
    //     StringBuilder str = new StringBuilder("Hello");
    //     System.out.println("Before calling method: " + str);
    //     modifyStringBuilder(str);
    //     System.out.println("After calling method: " + str);
    // }

    // public static void modifyStringBuilder(StringBuilder s) {
    //     s.append(" World!");
    //     System.out.println("Inside method: " + s);
    // }

