package latihan5;


public class H {
 public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;

        for (int i = 0; i < arr.length; i++) {
        jumlah += arr[i];
        }

        System.out.println("Jumlah angka dalam array: " + jumlah);
    }
}   
    
