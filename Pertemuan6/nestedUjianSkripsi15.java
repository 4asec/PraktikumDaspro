package PrakDaspro.Pertemuan6;
import java.util.Scanner;

public class nestedUjianSkripsi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak):  ");
        String bebasKompen = sc.nextLine();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1:   ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2:   ");
        int bimbinganP2 = sc.nextInt();

    if (bebasKompen.equalsIgnoreCase("Ya")) {
        
        if (bimbinganP1 >= 6 && bimbinganP2 >= 3) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbinganP1 < 6 && bimbinganP2 < 3) {
            pesan = "Gagal! Log bimbingan P1 kurang dari 6 kali dan P2 kurang dari 3 kali";
        } else if (bimbinganP1 < 6 ) {
            pesan = "Gagal! Log bimbingan P2 belum mencapai 6 kali";
        } else {
            pesan = "Gagal! Log bimbingan P2 belum mencapai 3 kali";
        } 
        
        }else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggung jawab kompen";
        System.out.println(pesan);
            sc.close();

        }
    }
}
