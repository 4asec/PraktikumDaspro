package Pertemuan13;
import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama:    ");
            nama = Raffa.nextLine();
            System.out.print("Masukkan baris:   ");
            baris = Raffa.nextInt();
            System.out.print("Masukkan kolom:   ");
            kolom = Raffa.nextInt();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = Raffa.nextLine();

            if (pilihan.equalsIgnoreCase("n"))
            break;
        }
    }
}
