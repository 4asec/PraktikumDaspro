package Pertemuan12;
import java.util.Scanner;

public class ArrayNilai15 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner Raffa = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = Raffa.nextInt();
        }

        int jmlLulus = 0, jmlTidakLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                 System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                 jmlLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                jmlTidakLulus++;
            }
        }
        System.out.println("Total Lulus     :" +jmlLulus);
        System.out.println("Total Tidak Lulus:  " +jmlTidakLulus);
        Raffa.close();
    }
}

