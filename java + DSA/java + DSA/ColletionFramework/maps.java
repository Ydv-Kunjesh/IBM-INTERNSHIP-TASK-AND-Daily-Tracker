import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map <String , Integer> students = new HashMap<>(); 
        students.put("Kunjesh", 72);
        students.put("Ramakant", 82);
        students.put("Kavita", 92);
        students.put("Seema", 62);

        System.out.println(students);
        System.out.println(students.get("Kunjesh")); // to get  value of specified key we use 

        for (String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}
