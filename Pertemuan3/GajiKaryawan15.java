package PrakDaspro.Pertemuan3;
import java.util.Scanner;

public class GajiKaryawan15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);
        int gajiPokok;
        double bonus ;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=Raffa.nextInt();
        bonus= 0.05*gajiPokok;
        int totGaji= (int) (gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok));
        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+ totGaji);

        Raffa.close();

    }    
}
