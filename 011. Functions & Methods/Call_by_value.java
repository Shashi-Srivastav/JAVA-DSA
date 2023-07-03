import java.util.*;
public class Call_by_value {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        swap(x,y);
        System.out.println("a = "+ x);
        System.out.println("b = "+ y);
    }
}
