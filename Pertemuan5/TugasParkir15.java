package PrakDaspro.Pertemuan5;
import java.util.Scanner;

public class TugasParkir15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        String jenisKendaraan;
        int durasiJam, totalBiaya;

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        jenisKendaraan = Raffa.next();

        System.out.print("Masukkan durasi parkir (jam): ");
        durasiJam = Raffa.nextInt();

        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            totalBiaya = durasiJam * 3000;
            System.out.println("Total tarif parkir mobil: Rp " + totalBiaya);
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            totalBiaya = durasiJam * 2000;
            System.out.println("Total tarif parkir motor: Rp " + totalBiaya);
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
        }

        Raffa.close();
    }
}