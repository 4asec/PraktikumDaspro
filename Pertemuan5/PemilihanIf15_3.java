package PrakDaspro.Pertemuan5;
import java.util.Scanner;
public class PemilihanIf15_3 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = Raffa.nextBoolean();

        // Menggunakan ternary operator yang ditampung ke variabel pesan
        String pesan = (uktLunas) 
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" 
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);

        Raffa.close();
    }
}