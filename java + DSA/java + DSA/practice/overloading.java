 class trail {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.sum(2, 3);
        a1.sum(2, 3 ,4);
        a1.sum(2.2f, 3.9f,7.6f);
    }
}

class Addition {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
    

    public void sum(int a, int b ,int c) {
            System.out.println(a + b +  c);
    }
    
    public void sum(float  a, float b , float c) {
    System.out.println(a + b + c); 
    }
    
}

