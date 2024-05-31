  // CLASSES
class Student {
    String name;
    int age;
    float marks;
   private  String Password;

    //Setters
    public void SetPassword(String Password) {
        this.Password = Password;
    }

    //Getters
    public String GetPassword() {
        System.out.println(this.Password);
      return this.Password;
    }
}
public class classesANdObjects {
    public static void main(String[] args) {
      //Objects
        Student s1 = new Student();
        s1.name = "kunjesh";
        s1.age = 20;
        s1.marks = 90.00f;
        s1.SetPassword("kun123");
        System.out.println(s1.name + " " + s1.age + " " + s1.marks + " " + s1.GetPassword());

        //acess Modifiers
        // public, private, protected


    }
    
}
