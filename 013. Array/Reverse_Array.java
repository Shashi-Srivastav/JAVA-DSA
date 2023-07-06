import java.util.*;
public class Reverse_Array {
    public static void RevArr(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]= {2,3,4,5,6,7,8,9};
        RevArr(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
