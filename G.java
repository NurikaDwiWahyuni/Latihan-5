package latihan5;

public class G {
    public static void main(String[] args) {
    int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    for (int i = 1; i < arr.length; i++){
    if (arr[i] % 5 == 0 && arr[i-1] % 5 == 0) {
        System.out.print("angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5: ");
        System.out.println(arr[i]);
}

}
}
}
