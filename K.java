package latihan5;

public class K {
   
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("");
        System.out.println("Angka-angka yang setelahnya bernilai lebih besar");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
               
                System.out.println(array[i] + ", \tAngka setelahnya = " + array[i + 1] );
                
            }
        }
    }
}

