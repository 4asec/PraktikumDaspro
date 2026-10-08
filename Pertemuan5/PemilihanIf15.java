package PrakDaspro.Pertemuan5;
import java.util.Scanner;

public class PemilihanIf15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        System.out.println("----Cetak KRS Siakad----");
        System.out.println("Apakah UKT sudah lunas (true/false) ");
        boolean uktLunas =  Raffa.nextBoolean();

        if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } 
        
        else {
        System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        Raffa.close();   
        }
    }