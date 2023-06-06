package latihan5;

public class I {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan selisih angka-angka dengan angka setelahnya : ");
 for (int i = 0; i < array.length - 1; i++) {
 int selisih = array[i + 1] - array[i];
     System.out.println("Selisih antara : " + array[i+1] + " & " + array[i] + " adalah " + selisih + "; ");
 
 }
 System.out.println();

}
}

