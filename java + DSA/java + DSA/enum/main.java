public class main{
    public static void main(String[] args) {
        Status s1 = Status.Start;
        System.out.println(s1);

        
        // to running a for loop over it 
        Status[] s2 = Status.values();
        for (Status s : s2) {
            System.out.println(s + " : " + s.ordinal());
        }
        

        // if else using enum

        if(s1 == Status.Start)
            System.out.println("Started");
        else if(s1 == Status.Running)
            System.out.println("Instance running");
        else if (s1 == Status.Get)
            System.out.println("get req hitted");
        else if(s1 == Status.Post)
            System.out.println("post req sent");
        
        
        // now its work with switch cases
        switch (s1) {
            case Start:
            System.out.println("Started");
                break;
            case Running:
            System.out.println("Running");
                break;
            case Get:
            System.out.println("get");
                break;
            case Post:
            System.out.println("post");
                break;
            case Failed:
            System.out.println("Failed");
                break;
            case Postponed:
            System.out.println("postponed");
                break;
            default:
                throw new AssertionError();
        }
    }
}


enum Status {
    Start,Running,Get,Post,Failed,Postponed
}