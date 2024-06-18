

public class returnLambdaExp {
    private static int i;

    public static void main(String[] args) {
        // basic implementatiion of sum method 

        a obj = new a()
        {
            @Override
            public int sum(int i,int j){
                return i+j;
            }
        };
        // now calling its method
        int x = obj.sum(4, 5);
        System.out.println(x);

        // now implement it using lamda expression
        a obj2 = (i, j) -> i + j;

      System.out.println(obj2.sum(5, 4));  





        
        
    }
}


interface a {
    public int sum(int i, int j);
}