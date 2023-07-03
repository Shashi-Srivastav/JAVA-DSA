import java.util.*;
public class product_a_and_b {
    public static int product(int a,int b){
        int pro = a*b;
        return pro;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        product(x,y);
        System.out.print(product(x, y));
    }
}
