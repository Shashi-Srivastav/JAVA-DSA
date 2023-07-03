import java.util.*;
public class Array_as_FX_Agrument {
    public static void Update(int a[],int b){
        for(int i = 0;i<a.length;i++){
            a[i] = a[i]+1;
        }
        b+=1;
    }
    public static void main(String args[]){
        int marks[] = {99, 98, 99};
        int notChangeable = 23;
        Update(marks, notChangeable);
        System.out.println(notChangeable);
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
