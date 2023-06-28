import java.util.*;
public class Print_reverse_the_number {
    public static void main(String args[]){
        int n = 12345;
        while(n>0){
            int last = n%10;
            System.out.print(last);
            n = n/10;
        }
    }
}
