class math {
    public int  addition(int a, int b) {
        return a + b;
    }
}


public class classes1 {
    public static void main(String[] args) {
        math m = new math();
        int x = 10;
        int y = 20;
        int z = m.addition(x, y);
        System.out.println("value of these two numbers is " + z);
    }
}