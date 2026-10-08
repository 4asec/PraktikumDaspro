package PrakDaspro.Pertemuan5;
import java.util.Scanner;

public class Tugas2Pemilihan15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);
        int jumlahSks;

        System.out.print("Masukkan jumlah SKS yang diambil: ");
        jumlahSks = Raffa.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        Raffa.close();
    }
}