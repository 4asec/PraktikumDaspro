package PrakDaspro.Pertemuan5;
import java.util.Scanner;

public class TugasAntrean15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mesin Antrean Akademik ===");
        System.out.println("1. Layanan KRS / Administrasi");
        System.out.println("2. Layanan Pembayaran / UKT");
        System.out.println("3. Layanan Legalisir");
        System.out.println("4. Layanan Beasiswa / Surat Rekomendasi");
        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = sc.nextInt();

        // Pemilihan menggunakan SWITCH-CASE
        switch (kode) {
            case 1:
                System.out.println("Silakan menuju Loket 1: Administrasi Akademik");
                break;
            case 2:
                System.out.println("Silakan menuju Loket 2: Bagian Keuangan / UKT");
                break;
            case 3:
                System.out.println("Silakan menuju Loket 3: Layanan Legalisir");
                break;
            case 4:
                System.out.println("Silakan menuju Loket 4: Urusan Beasiswa");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }

        sc.close();
    }
}