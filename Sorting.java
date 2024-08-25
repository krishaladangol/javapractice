import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter the numbers in array:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting:");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("array after sorting:");
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
