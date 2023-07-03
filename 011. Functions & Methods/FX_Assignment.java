import java.util.*;
public class FX_Assignment {
    //Q1
    public static int Avgofthreeno(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        int x = 3;
        int y = 4 ;
        int z = 5;
        System.out.println(Avgofthreeno(x, y, z));
    }
}
