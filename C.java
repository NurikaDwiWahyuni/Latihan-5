package latihan5;
import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
      
        System.out.println ("Menampilkan angka-angka ganjil di dalam array");
        
        ArrayList<Integer> angkaGanjil = new ArrayList<>();
        for (int angka : arr) {
            if (angka % 2 != 0) {
                angkaGanjil.add(angka);
            }
        }

        if (angkaGanjil.size() > 0) {
            System.out.print("Angka ganjil : ");
            for (int angka : angkaGanjil) {
                System.out.print(angka + "; ");
            }
        } else {
            System.out.println("Tidak ditemukan angka ganjil");
        }
    }

    
}
