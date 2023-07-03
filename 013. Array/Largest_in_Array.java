import java.util.*;
public class Largest_in_Array {
    public static int Largest(int arr[]){
        int ans = Integer.MIN_VALUE;//-Infinity - Min value
        for(int i = 0;i<arr.length;i++){
            if(ans <arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main (String args[]){
        int arr[] = {-2,-3,-4,-222,-43,-4};
        System.out.println(Largest(arr));
    }
}
