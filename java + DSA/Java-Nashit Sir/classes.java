public class classes {

    public static void main(String[] args) {
        int a, b, c;
        // now we are able to acess email without creating an object
        // Students.Email = "kunjesh@gmail.com";


        Students s1 = new Students();
        s1.name = "kunjesh";
        s1.Email = "kun@jesh";
        s1.Age = "20";
        s1.marks = new int[] { 10, 20, 30, 40, 50 };
        // System.out.println(si);

        //  for(int i = 0; i<si.marks.length; i++){
        //     System.out.println(si.marks[i]);
        // }
        Students s2 = new Students();
        s2.name = "anshu";
        s2.Email = "anshu@gmail.com";
        s2.Age = "20";
        s2.marks = new int[] { 10, 20, 30, 40, 50 };
        s1.Display_name();
        s2.Display_name();
    }
     
}

 class Students {
        String name;
       String Email;  // if we add static keyword there then we can access it without creating an object an it can overwrite all the email value with last value
        String Age;
        int[] marks;

        public void Display_name() {
            System.out.println(name + " " + Email + " " + Age + " " + marks);
        
        }

    }