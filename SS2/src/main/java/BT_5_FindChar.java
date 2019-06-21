import java.util.Scanner;

public class BT_5_FindChar {
    public static void main(String[] args) {
        String name = "Nguyen Nhu Phuong";
        char s = 'N';
        System.out.println(Count(name,s));
    }
    private static int Count(String name, char s){
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i) == s){
                count++;
            }
        }
        return count;
    }
}
