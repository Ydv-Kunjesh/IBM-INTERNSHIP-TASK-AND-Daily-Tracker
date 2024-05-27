public class loops {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //     for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i] + " ");
        // }
        //      optimised way to print array to the length of array A 
        for(int i:a){
            System.out.print(i + " ");
        }
    }
}