public class trail {
    public static void main(String[] args) {
        Adit adit = new Adit(19,"Kunjesh");
        Adit adi = new Adit("kunjesh",19,"imkunjesh@gmail.com","0011223344");

    }
}

class Adit {
    String name;
    int age;
    String email;
    String phone;

    public Adit(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    Adit(int age , String name) {
        this.age = age;
        this.name = name;
    }

}






// Package objects contain version information about
// the implementationand specification of a Java package. 
// This versioning information is retrieved and made available by the ClassLoader instance that loaded the class(es). Typically, it is stored in the manifest 
// that is distributed with the classes.