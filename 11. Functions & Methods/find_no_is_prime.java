import java.util.*;

public class find_no_is_prime {
    // public static boolean isPrime(int n){
    // if(n == 2){
    // return true;
    // }
    // for(int i = 2;i<n-1;i++){
    // if(n % 2 == 0){
    // return false;
    // }
    // }
    // return true;
    // }

    // Optimised Approach
    public static boolean isPrime(int n) {
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        isPrime(4);
        System.out.println(isPrime(7));
    }
}
