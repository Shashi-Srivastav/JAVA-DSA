import java.util.*;
public class Pair_Array {
    public static void prntPair(int number[]){
        int tp = 0;
        for(int i = 0;i<number.length;i++){
            int curr = number[i];//2,4,6,8,10
            for(int j = i+1;j<number.length;j++){
                System.out.print("(" + curr + "," + number[j] + ") ");
                tp++;
            }
            System.out.println("total pairs "+tp);
        }
    }
    public static void main(String args[]){
        int arr[]={2, 4, 6, 8, 10};
        prntPair(arr);
    }
}
