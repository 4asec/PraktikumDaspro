package PrakDaspro.Pertemuan7;
import java.util.Scanner;

public class StudiKasus2_15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jmlDokumen, peringkat, statusDana;

        System.out.println("Masukkan nama siswa :");
        nama = Raffa.nextLine();
        System.out.println("Jenis Kegiatan (BELMAWA, BAKORAMA, Mandiri, PKM / Lainnya)");
        jenisKegiatan = Raffa.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORAMA")||
            jenisKegiatan.equalsIgnoreCase("Mandiri") ) {


            System.out.println("Masukkan jumlah dokumen     :");
            jmlDokumen = Raffa.nextInt();
            
            if (jmlDokumen < 4) {
                int kurang = 4 - jmlDokumen;
            } else {
                System.out.print("Peringkat juara: ");
                peringkat = Raffa.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
        }

            else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen: ");
            jmlDokumen = Raffa.nextInt();

            if (jmlDokumen < 4) {
                int kurang = 4 - jmlDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                statusDana = Raffa.nextInt();

                if (statusDana == 1) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
             }
            }

        } 
                

    }
}
