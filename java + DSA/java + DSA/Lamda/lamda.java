


public class lamda {
    public static void main(String[] args) {
        // to implement the show show method we neeed to write a claas b nd tand then we can use it 
        b b1 = new b();
        b1.show();

        // if i know their is only one method in my a interface then simply insted of writng a new i can wirte its epression at my own
        // a a1 = new a() {
        //     public void show() {
        //         System.out.println("show called by its expression");
        //     }
        // };

        // a1.show();

        // but their is an another way to do it we call it as lamda expression   ->
        a c1 = (i) -> System.out.println("Lamda expression"); // if  my method need any parameter the nwe can pass it as well it passed it and the number of param will be multiple or single anthing
        c1.show(5);

        // just imagine my method return anything then how can we use lambda expression

        



    

    }
    




    
}


interface a {
    public void show(int i );
}


class b implements a{
    public void show() {
        System.out.println("Show mwthod implemted");
    }
}