import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50};
int n = 3;
int val = 60;
for(int i = n; i > 0; i--)
    arr[i] = arr[i-1];
arr[1] = val;
for(int i = 0; i <= n; i++)
    System.out.print(arr[i] + " ");
}
}