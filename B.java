package latihan5;
import java.util.Arrays;
public class B {
    public static void main(String[] args) {
    int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    System.out.println("Mencari sebuah angka di dalam array");
    int target = 55;

    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {

    found = true;
    break;

    }

    }

    if(found) {
    System.out.println("Angka yang dicari: " + target);
    System.out.print("Angka ditemukan pada array");

    }else {

    System.out.println("Angka tidak ditemukan pada array");

    }
    }  

    
}
