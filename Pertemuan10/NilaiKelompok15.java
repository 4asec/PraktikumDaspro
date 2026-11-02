package Pertemuan10;
import java.util.Scanner;

public class NilaiKelompok15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jmlKelompok = Raffa.nextInt();

        System.out.print("Masukkan jumlah penilai:    ");
        int jmlPenilai = Raffa.nextInt();

        if (jmlKelompok <= 0 || jmlPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0. ");
        } else {
        int nomorKelompok = 1; // penghitung outer lopp
        double rataTertinggi = -1; // -1 agar kelompok pertama pasti tercatat
        int kelTerbaik = 0;

        while (nomorKelompok <= jmlKelompok) {
            System.out.println("Kelompok "+nomorKelompok);
            double totalNilai = 0;

        for (int j = 0; j <= jmlPenilai; j++) {
            int nilai;
            do{
                System.out.print("Nilai dair penilai " +j+ ": ");
                nilai = Raffa.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
            totalNilai += nilai;
        }
        
        double rataNilai = totalNilai / jmlPenilai;
        System.out.println("Kelompok "+nomorKelompok+ ": nilai rata-rata = "+rataNilai);

        if (rataNilai > rataTertinggi) {
            // lengkapi : perbarui rataTertinggi dan kelompok Terbaik
        }

            nomorKelompok++;
        }
        System.out.println("==============================");
        System.out.println("Kelompok terbaik    : "+kelTerbaik);
        System.out.println("Rata-rata tertinggi : "+rataTertinggi);
            
        }
        Raffa.close();
    }    
}
