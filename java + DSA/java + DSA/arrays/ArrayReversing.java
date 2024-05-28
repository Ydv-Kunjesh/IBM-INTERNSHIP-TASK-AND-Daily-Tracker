public class ArrayReversing {
    public static void arrayReverse(int array[]) {
        int start = 0, end = array.length-1;
        // System.out.println(end);
        while (start < end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;   
        }
       

    }
    public static void main(String[] args) {
        int array []= { 1, 2, 3, 4, 5, 6, 7, 8 };
        arrayReverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
 