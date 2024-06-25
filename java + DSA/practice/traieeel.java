 class traillll{
     public static void main(String args[]) {
         a obj = (i, j) -> {
            //  System.out.println(i + j);
            return i+j;
         };
        System.out.println(obj.sum(4, 5));
         a obj1 = new a(){
            public int sum(int i ,int j){
                System.out.println(i+j);
                return i+j ;
            }
         };
         obj1.sum(9, 1);

    }
}


interface a {
    public int sum(int j, int i);
}