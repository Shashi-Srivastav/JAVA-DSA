import java.util.*;
public class Binary_to_decimal{
    public static void   Bin_to_Des(int Bin){
        int Q = Bin;
        int power = 0;
        int dec = 0;
        while(Bin>0){
            int lastdig = Bin % 10;
            dec = dec + (lastdig * (int)Math.pow(2, power));
            power++;
            Bin = Bin/10;
        }
        System.out.println("decimal 0f "+Q+ " = "+dec);
    }
    public static void main(String args[]){
    Bin_to_Des(1011);
    }
}