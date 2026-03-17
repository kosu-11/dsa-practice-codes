 import java.util.*;
public class Deletion {
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30); a.add(40);

        Scanner sc = new Scanner(System.in);
        System.out.print("Position To Delete : ");
        int pos = sc.nextInt();
        a.remove(pos);
        System.out.println(a);
    }
}
