import java.util.*;
public class AddElement {
     public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);a.add(40);a.add(50);a.add(60);

        Scanner sc = new Scanner(System.in);
        System.out.print("which position want to add : ");
        int pos = sc.nextInt();
        System.out.println("Enter The Element :");
        int num = sc.nextInt(); 

        a.add(pos, num);

        System.out.println(a);
    }
}

