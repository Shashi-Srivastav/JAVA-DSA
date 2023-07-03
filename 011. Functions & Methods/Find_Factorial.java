import java.util.*;
public class Find_Factorial {
    public static int factorial(int x){
        int fact  = 1;
        for(int i = 1;i<=x;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        System.out.println(factorial(n));
    }
}
