import java.util.*;
public class Binominal_coefficient {
    public static int factorial(int x){
        int fact  = 1;
        for(int i = 1;i<=x;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binominal (int a, int b){
        int n_fact = factorial(a);
        int r_fact = factorial(b);
        int n_sub_r_fact = factorial(a-b);
        int n_C_r = n_fact/(r_fact*n_sub_r_fact);
        return n_C_r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        binominal(n, r);
        System.out.print(binominal(n, r));

    }
}
