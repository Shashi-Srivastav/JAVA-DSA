import java.util.*;
public class Overloading_using_parameter {
    public static int sum (int a, int b){
        return a+b;
    }
    public static int sum (int a,int b,int c){
        return a+b+c;
    }
    public static void main(){
        System.out.println(sum(2,3));

        System.out.println(sum(2,3,4));
    }
}
