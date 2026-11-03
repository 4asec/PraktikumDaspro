package Pertemuan10;
import java.util.Scanner;

public class Tugas2No15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Raffa.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal harus 3!");
        } else {
            int jumlahTotal = 0;

            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlahTotal += hasil;
                }
                System.out.println();
            }
            System.out.println("\nJumlah seluruh angka: "+jumlahTotal);
        }
        Raffa.close();
    }
}
