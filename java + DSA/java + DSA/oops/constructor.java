
public class constructor {
    public static void main(String[] args) {
        Student S1 = new Student();
        System.out.println(S1);
        Student S2 = new Student("kunjesh", 01);
        System.out.println(S2.name + " " + S2.roll);
        Student S3 = new Student("Anshu", 02, "Anshu@123");
        System.out.println(S3.name + " " + S3.roll + " " + S3.Password);
        // Student S4 = new Student(S3);
        // System.out.println(S4.roll);

        


    }
}

class Student {
    String name;
    int roll;
    String Password;
 

    Student() {
        System.out.println("Costructor called");
    }

    //Shallow Copy
    // Student(Student S3) {
    //     this.name = S3.name;
    //     this.roll = S3.roll;
    //     this.Password = "Parvesh@123";
    //     this.marks = S3.marks

    // }
    // Deep Copy
    // Student(Student S3) {
    //     marks = new int[3];
    //     this.name = name;
    //     this.roll = roll;
    //     this.Password = Password;
    //     for (int i = 0; i < marks.length; i++) {
    //         this.marks[i] = S3.marks[i];
    //     }
        
    // }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    Student(String name, int roll, String Password) {
        this.name  = name;
        this.roll = roll;
        this.Password = Password;
        
    }

    
}