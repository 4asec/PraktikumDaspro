package PrakDaspro.Pertemuan3;
import  java.util.Scanner;

public class Tugas2_15 {
    public static void main(String[] args) {
    Scanner Raffa = new Scanner(System.in);

    int jml_lembar, biaya_cetak, total_biaya ;
    int tarif_per_lembar = 500;
    int biaya_jilid = 5000;

    System.out.println("Masukkan jumlah lembar dokumen : ");
    jml_lembar = Raffa.nextInt();

    biaya_cetak = jml_lembar * tarif_per_lembar;
    total_biaya = biaya_cetak + biaya_jilid;

    System.out.println("-----------------------------");
    System.out.println("Biaya cetak kertas : Rp " + biaya_cetak);
    System.out.println("Biaya penjilidan : Rp " + biaya_jilid);
    System.out.println("Total bayar : Rp " + total_biaya);

    Raffa.close();
    }
    
}
