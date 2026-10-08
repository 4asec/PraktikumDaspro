package PrakDaspro.Pertemuan6;
import java.util.Scanner;

public class tugas1TokoBuku15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlah;
        double diskon = 0.0;

        System.out.println("=== Program Diskon Toko Buku ===");
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine().trim();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlah = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.08; 
            if (jumlah > 3) {
                diskon += 0.02; 
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.08; 
            if (jumlah > 4) {
                diskon += 0.02; 
            } else {
                diskon += 0.01; 
            }
        } else {

            if (jumlah > 4) {
                diskon = 0.06; 
            } else {
                diskon = 0.0; 
            }
        }

        int persenDiskon = (int) (diskon * 100);
        System.out.println("Diskon yang Anda dapatkan: " + persenDiskon + "%");

        sc.close();
    }
}