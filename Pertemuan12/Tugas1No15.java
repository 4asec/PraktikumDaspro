package Pertemuan12;
import java.util.Scanner;

public class Tugas1No15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = Raffa.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            int[] nilai = new int[jumlah];
            int total = 0;

            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = Raffa.nextInt();
                total += nilai[i];
            }

            int tertinggi = nilai[0];
            int terendah = nilai[0];
            for (int i = 1; i < nilai.length; i++) {
                if (nilai[i] > tertinggi) tertinggi = nilai[i];
                if (nilai[i] < terendah) terendah = nilai[i];
            }

            double rataRata = (double) total / nilai.length;

            System.out.println("\n=== DAFTAR NILAI & STATUS KELULUSAN ===");
            for (int i = 0; i < nilai.length; i++) {
                String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
                System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i] + " (" + status + ")");
            }

            System.out.println("=======================================");
            System.out.println("Nilai Rata-rata : " + rataRata);
            System.out.println("Nilai Tertinggi : " + tertinggi);
            System.out.println("Nilai Terendah  : " + terendah);
        }

        Raffa.close();
    }
}
