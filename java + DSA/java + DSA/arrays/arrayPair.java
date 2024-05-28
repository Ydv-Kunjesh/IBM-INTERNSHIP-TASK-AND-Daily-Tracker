public class arrayPair {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        arraypair(array);


    }

    public static void arraypair(int array[]) {
        
        for (int i = 0; i < array.length; i++) {
            int currval = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(currval + ","+ array[j] +" ");
            }
            System.out.println();
        }
    }
}
