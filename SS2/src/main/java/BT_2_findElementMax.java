import java.util.Scanner;
public class BT_2_findElementMax {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : " + arr.length + " row and " + arr[0].length + " columns");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; i++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }
        System.out.print(max);
    }
}
