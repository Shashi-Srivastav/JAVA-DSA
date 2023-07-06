import java.util.*;

public class Binary_Search {
    public static int BinSearch(int arr[], int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisons
            if (arr[mid] == key) {
                // found
                return mid;
            }
            if (arr[mid] < key) {
                // right
                start = mid + 1;
            } else {
                // left
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int arr[]= {2,3,4,5,6,7,8,9};
        int key =3;
        BinSearch(arr, key);
        System.out.println(BinSearch(arr,key));
    }
}
