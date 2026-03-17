import java.util.Scanner;
import java.util.Stack;

public class AddElementstcak {
    static int Stack[] = new int[5];
    static int top = -1;
    static void push(int x){
        if(top == Stack.length-1){
            System.out.println("Overflow");
        }else{
            Stack[++top] = x;
        }
    }
    static void pop(){
        if(top == -1){
            System.out.println("Underflow:");
        }else{
            System.out.println("popped:" + Stack[top--]);
        }
    }
    static void peek(){
        if(top == -1){
            System.out.println("Empty:");
        }else{
            System.out.println("Top:" + Stack[top]);
        }
    }
    static void display(){
        if(top == -1){
            System.out.println("Empty");
            return;
        }
        for(int i = top;i>=0;i--){
            System.out.print(Stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            push((sc.nextInt()));
        }
        display();
        peek();
        pop();
        display();
    }
}
