package latihan5;
import java.util.ArrayList;
public class D {
     public static void main(String[] args) {  
          int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    ArrayList<Integer> kelipatanTiga = new ArrayList<>();
        for (int angka : array) {
            if (angka % 3 == 0) {
                kelipatanTiga.add(angka);
            }
        }

        if (kelipatanTiga.size() > 0) {
            System.out.print("Angka kelipatan 3: ");
            for (int angka : kelipatanTiga) {
                System.out.print(" " + angka + "; ");
            }
        } else {
            System.out.println("Tidak ditemukan angka kelipatan 3 dalam array");
        }
    }

   
}
