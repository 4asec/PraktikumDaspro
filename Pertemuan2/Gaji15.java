package PrakDaspro.Pertemuan2;

import java.util.Scanner;

public class Gaji15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok, tunjanganPerAnak, totalTunjangan, potonganPensiun, gajiBersih;
        int jumlahAnak;
        double persenPensiun = 0.10;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan per anak: ");
        tunjanganPerAnak = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = persenPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("----------------------------------------");
        System.out.println("Total Tunjangan Anak : Rp " + totalTunjangan);
        System.out.println("Potongan Dana Pensiun: Rp " + potonganPensiun);
        System.out.println("Gaji Bersih Diterima : Rp " + gajiBersih);

        input.close();
    }
}