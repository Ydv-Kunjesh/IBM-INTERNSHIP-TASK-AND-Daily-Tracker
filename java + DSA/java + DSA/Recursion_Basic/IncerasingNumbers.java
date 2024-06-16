public class IncerasingNumbers {
    public static void main(String[] args) {
        Inc(10);

    }

    static void Inc(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        Inc(num - 1);
        System.out.print(num+ " ");

        
       
    }
}
