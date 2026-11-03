package Pertemuan10;
import java.util.Scanner;

public class Tugas3No15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = Raffa.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1!");
        } else {
            int totalBarangSemuaToko = 0;
            int maxBarang = -1;
            int tokoTerbanyak = 0;

            for (int t = 1; t <= jumlahToko; t++) {
                System.out.println("\n--- Data Toko " + t + " ---");

                int jmlPelanggan;
                do {
                    System.out.print("Masukkan jumlah pelanggan: ");
                    jmlPelanggan = Raffa.nextInt();
                    if (jmlPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    }
                } while (jmlPelanggan < 0);

                int totakBarangToko = 0;

                for (int p = 1; p <= jmlPelanggan; p++) {
                    int jmlBarang;
                    do {
                        System.out.print("  Jumlah barang pelanggan ke-" + p + ": ");
                        jmlBarang = Raffa.nextInt();
                        if (jmlBarang < 0) {
                            System.out.println("  Jumlah barang tidak boleh negatif!");
                        }
                    } while (jmlBarang < 0);

                    totakBarangToko += jmlBarang;
                }

                System.out.println("Toko " + t + " -> pelanggan: " + jmlPelanggan + ", total barang: " + totakBarangToko);

                totalBarangSemuaToko += totakBarangToko;

                if (totakBarangToko > maxBarang) {
                    maxBarang = totakBarangToko;
                    tokoTerbanyak = t;
                }
            }

            System.out.println("\n========================================");
            System.out.println("Total barang seluruh toko    : " + totalBarangSemuaToko);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        }

        Raffa.close();
    }
}