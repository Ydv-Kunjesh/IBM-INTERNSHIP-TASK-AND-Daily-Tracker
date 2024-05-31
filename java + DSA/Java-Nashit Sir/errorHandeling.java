public class errorHandeling {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, };
        int a = 10;
        // System.out.println(a / 0);
        try {
            System.out.println(arr[6]);
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }catch(Exception e){
        System.out.println("Something Went Wrong");
    }finally {
            System.out.println("finally block");
        }
        int b = 10;
        int x = a + b;
        System.out.println(x);
    }
}
