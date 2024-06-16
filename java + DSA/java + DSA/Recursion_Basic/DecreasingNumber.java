

public class DecreasingNumber{
    public static void main(String[] args) {
        DecNum(10);
    }

    static void DecNum(int num) { // recursive method 
    if (num == 1) {
        System.out.println(1);
        return ;
    }
    System.out.print(num + " ");
    DecNum(num-1);
    
}
}