package PrakDaspro.Pertemuan6;
import java.util.Scanner;

public class operatorLogikaWifi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa, dosen, akunDiblokir ;

        System.out.println(" Apakah pengguna mahasiswa? (true/false):   ");
        mahasiswa = sc.nextBoolean();
        System.out.println("Apakah pengguna dosen (true/false): ");
        dosen = sc.nextBoolean();
        System.out.println("Apakah akun sedang di blokir (true/false):  ");
        akunDiblokir = sc.nextBoolean();


        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
            
        }
    }
}
