package PrakDaspro.Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsisten15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Seleksi Calon Asisten Praktikum ===");

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean statusAktif = sc.nextBoolean();

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sanksiAkademik = sc.nextBoolean();

        if (statusAktif && !sanksiAkademik) {

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDaspro = sc.nextInt();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            if (nilaiDaspro >= 79 || punyaSertifikat) {

                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 74) {
                    System.out.println("Hasil: Selamat! Anda dinyatakan DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("Hasil: Gagal! Nilai wawancara kurang dari 74.");
                }

            } else {
                System.out.println("Hasil: Gagal! Nilai Daspro belum mencapai 79 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("Hasil: Gagal! Mahasiswa tidak aktif atau sedang terkena sanksi akademik.");
        }

        sc.close();
    }
}   