// WITH ARRAY

// import java.util.Scanner;

// public class LinearSearch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER ARRAY SIZE :");
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         System.out.println("ENTER ARRAY ELEMENTS :");
//         for(int i = 0; i < n; i++)
//             a[i] = sc.nextInt(); 
//             System.out.println("ELEMENT TO SEARCH :");
//         int key = sc.nextInt(); 

//         for(int i = 0; i < n; i++){
//             if(a[i] == key){
//                 System.out.println("Found at index " + i);
//                 return;
//             }
//         }
//         System.out.println("Not Found");
//     }
// }

// WITH ARRAY LIST

// import java.util.*;

// public class LinearSearch {
//     public static void main(String[] args) {

//         ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,40));
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER ELEMENT TO SEARCH :");
//         int key = sc.nextInt();

//         if(a.contains(key))
//             System.out.println("Found at index " + a.indexOf(key));
//         else
//             System.out.println("Not Found");
//     }
// }

//  WITH ARRAYLIST AND FOR LOOP
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,40));
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ELEMENT TO SEARCH :");
        int key = sc.nextInt();

        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
