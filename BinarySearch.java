import java.util.Scanner;
public class BinarySearch {
    
    public static void main(String[] args) {
        // System.out.println("SEARCH TARGET :");
        // int a[] = {10,20,30,40,50};
        // Scanner sc = new Scanner(System.in);

        // int key = sc.nextInt();

        // int low = 0, high = a.length - 1;

        // while(low <= high){
        //     int mid = (low + high) / 2;

        //     if(a[mid] == key){
        //         System.out.println("Found at index " + mid);
        //         return;
        //     }
        //     else if(a[mid] < key)
        //         low = mid + 1;
        //     else
        //         high = mid - 1;
        // }

        // System.out.println("Not Found");

// USER INPUT
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Size of the array :");
        int n = sc.nextInt();       
        int a[] = new int[n];

        System.out.println("Sorted elements :");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("SEARCH TARGET :");
        int key = sc.nextInt();

        int l = 0, h = n - 1;

        while(l <= h){
            int m = l+(h - l) / 2; 
//  m = (l+h)/2 can also be used
            if(a[m] == key){
                System.out.println("Found at index " + m);
                return;
            }
            else if(a[m] < key)
                l = m + 1;
            else
                h = m - 1;
        }

        System.out.println("Not Found");

    }
}
