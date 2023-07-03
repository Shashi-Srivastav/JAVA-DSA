import java.util.*;
public class Passing_paremeter {
    public static int sum(int num1,int num2){
        int summ = num1+num2;
        return summ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        System.out.print(sum(a, b));
    }
}
