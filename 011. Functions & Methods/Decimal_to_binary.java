import java.util.*;
public class Decimal_to_binary {
    public static void DectoBin(int n){
        int dec = n;
        int pow = 0;
        int bin_no = 0;
        while(n>0){
            int rem = n%2;
            bin_no = bin_no + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Decimal to Binary od no. "+ dec +" = "+bin_no);
    }
    public static void main(String args[]){
        DectoBin(7);
    }
}
