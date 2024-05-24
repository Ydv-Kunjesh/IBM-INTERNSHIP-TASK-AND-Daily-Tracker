public class binarytodec {
    public static int binarytodec(int n){
        int dec = 0;
        int base = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            dec = dec + lastdigit * base;
            base++;
        }
        System.out.println(dec);
        return dec;
    }

    public static void main(String[] args) {
        binarytodec(10110);
        
    }
}
