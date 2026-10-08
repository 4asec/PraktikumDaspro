package PrakDaspro.Pertemuan3;
import java.util.Scanner;

public class Tugas1_15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        double harga, uang_muka, sisa_harga, pokok_cicilan, bunga, cicilan_per_bulan;
        int lama_cicilan;
        double bunga_persen = 0.02;

        System.out.println("Masukkan harga laptop (Rp) : ");
        harga = Raffa.nextDouble();

        System.out.println("Masukkan uang muka/DP (Rp) : ");
        uang_muka = Raffa.nextDouble();

        System.out.println(" Masukkan lama cicilan (bulan) : ");
        lama_cicilan = Raffa.nextInt();

        sisa_harga = harga - uang_muka;
        pokok_cicilan = sisa_harga / lama_cicilan;
        bunga = sisa_harga * bunga_persen;
        cicilan_per_bulan = pokok_cicilan + bunga ; 

        System.out.println("----------------------------");
        System.out.println("Sisa harga setelah DP : RP " + sisa_harga);
        System.out.println("Bunga per bulan (2%) : Rp " + bunga);
        System.out.println("Cicilan per bulan   : Rp " + cicilan_per_bulan);

        Raffa.close();
    }
    
}
