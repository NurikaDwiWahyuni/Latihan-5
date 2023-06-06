package latihan5;

public class E {
      public static void main(String[] args) {
        
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};  
        System.out.print("Angka-angka yang memiliki angka 2: "); 
        for(int angka : arr) { 
        String arrString = Integer.toString(angka); 
        if(arrString.contains("2")) { System.out.print(angka + "; "); 
        }
        }
    }
  
}
