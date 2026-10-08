package PrakDaspro.Pertemuan7;
import java.util.Scanner;

public class StudiKasus1_15 {
    public static void main(String[] args) {
    Scanner Raffa = new Scanner(System.in);

        int hargaPerCup = 18000;
        int batasDiskon = 80000;
        int persenDiskon = 8;
        
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = Raffa.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = Raffa.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= batasDiskon) {
            diskon = totalHarga * persenDiskon / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        Raffa.close();
    }
}