
package latihan5;
import java.util.ArrayList;
public class F {
    public static void main(String[] args) {
     int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        ArrayList<Integer> ganjilDiapitGenap = new ArrayList<>();

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] % 2 != 0 && array[i-1] % 2 == 0 && array[i+1] % 2 == 0) {
                ganjilDiapitGenap.add(array[i]);
            }
        }

        System.out.print("Angka ganjil yang diapit angka genap : ");
        System.out.println(ganjilDiapitGenap);
    }   
    }
    


