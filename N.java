package latihan5;

public class N {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan jumlah angka-angka di dalam array tersebut dengan seluruh angka-angka sebelumnya:");
 int[] cumulativeSum = new int[array.length];
 cumulativeSum[0] = array[0];
 System.out.print(cumulativeSum[0] + "; ");
 for (int i = 1; i < array.length; i++) {
 cumulativeSum[i] = cumulativeSum[i - 1] + array[i];
 System.out.print(cumulativeSum[i] + "; ");
 }
 System.out.println();
}
}
