public class buffer {
 public static void main(String[] args) {
     StringBuffer sb = new StringBuffer("Kunjesh");
     System.out.println(sb.capacity());
     sb.append(" Yadav");
     System.out.println(sb.capacity());

     sb.ensureCapacity(20);
     System.out.println(sb);

 }
}
