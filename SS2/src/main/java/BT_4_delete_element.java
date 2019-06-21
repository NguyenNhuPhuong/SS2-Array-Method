

public class BT_4_delete_element {
    public static void main(String[] args) {
        int[] arr = {10, 9, 3, 3, 4, 5, 2, 1, 2, 2};
        int element_del = 3;
        int[] arr1 = delete_element(arr,element_del);
        Display(arr1);
    }

    private static int[] delete_element(int arr[], int element_del) {
        int index = 0;
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element_del) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {

            if(i < index){
                arr1[i] = arr[i];
            } else {
                arr1[i] = arr[i + 1];
            }
        }
        return arr1;
    }
    public static void Display (int arr[]){
        for(int y : arr){
            System.out.print( y + " ");
        }
    }

}