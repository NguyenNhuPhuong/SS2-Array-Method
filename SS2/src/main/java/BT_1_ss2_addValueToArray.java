
import java.security.Security;
import java.util.Scanner;

public class BT_1_ss2_addValueToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter elenment : ");
        int i = 0;
        while (i < arr.length){
            arr[i] = sc.nextInt();
            i++;
        }
        int num1 = 3;
        int index = 2;
        Display(insertArray(num1,arr,index));
    }

    public static int[] insertArray(int number, int[] arr, int index) {
        int[] arr1 = new int[arr.length + 1];
        if (index == 0) {
            arr1[0] = number;
            arr[0] = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                arr[i - 1] = arr1[i];
            }
        } else if (index == arr1.length - 1) {
            arr1[arr1.length - 1] = number;
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i];
            }
        } else {
            for (int i = 1; i < arr1.length; i++) {
                if (i == index) {
                    arr1[i] = number;
                } else {
                    if (i < index) {
                        arr1[i] = arr[i];
                    } else {
                        arr1[i] = arr[i - 1];
                    }
                }
            }
        }
        return arr1;
    }
    public static void Display (int[] arr){
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}