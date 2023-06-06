package latihan5;

public class L {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlahGenap = 0;
        
        System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap:");
        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
        int jumlah = arr[i] + arr[i + 1];
        if (jumlah % 2 == 0) {
        System.out.println("angka depan : " + arr[i] + " angka setelahnya : " + arr[i+1] + "\n" + "jumlah : " + jumlah + " ");
        total++;
        }
        }
        System.out.println();
        System.out.println("Total jumlah angka dengan angka setelahnya yang hasil penjumlahannya genap: " + total);
    }
}