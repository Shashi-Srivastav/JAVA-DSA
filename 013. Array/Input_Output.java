import java.util.*;
public class Input_Output {
    public static void main(String args[]){
        int marks[] = new int[100];
        System.out.println(marks.length);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        System.out.println("phy "+ marks[0]);
        System.out.println("phy "+ marks[1]);
    }
}
