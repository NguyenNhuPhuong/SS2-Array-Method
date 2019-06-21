import java.util.Scanner;

public class TH_countSV {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = sc.nextInt();
            if (size > 20)
                System.out.print("Size should not excced 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("enter a mark for student " + (i + 1) + "  :" );
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.print(" \n The number of student passing the exm is " + count);
    }
}
