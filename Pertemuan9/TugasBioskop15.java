package PrakDaspro.Pertemuan9;
import java.util.Scanner;
public class TugasBioskop15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        int totalTiket = 0, hargaTiket = 46000 ; // Harga Tiket Parameter Unik absen 15
        double totalPenjualanHarian = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yg di beli (ketik 0 untuk selesai)  :   ");
            int jmlTicket = Raffa.nextInt();

            if (jmlTicket == 0) {
                break;
            }

            if (jmlTicket < 0) {
                System.out.println("Jumlah ticket tidak Valid! Silahlan masukkan ulang. ");
                continue;
            }

        double diskon = 0.0;
        if (jmlTicket > 11) {
            diskon = 0.18; // diskon 18% untuk pembelian > 11 tiket
        } else if (jmlTicket > 3) {
            diskon = 0.08; // diskon 8% untuk pembelian > 3 tiket
        }

        double subTotal = jmlTicket * hargaTiket;
        double totalBayar = subTotal - (subTotal*diskon);

        totalTiket += jmlTicket;
        totalPenjualanHarian += totalBayar;

        System.out.println("Diskon: "+ (int)(diskon * 100) + "%"    );
        System.out.println("Total bayar transaksi ini: Rp " + (long)totalBayar);
        System.out.println("------------------------------------------");
        }

        System.out.println("\n=== REKAP PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual : " + totalTiket + " tiket");
        System.out.println("Total pendapatan   : Rp " + (long)totalPenjualanHarian);

    }
}
