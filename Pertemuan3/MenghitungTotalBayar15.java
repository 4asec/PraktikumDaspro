package PrakDaspro.Pertemuan3;
import java.util.Scanner;

public class MenghitungTotalBayar15 {
    public static void main(String[] args) {
    Scanner Raffa= new Scanner(System.in);
    double harga;
    double potongan;
    double jml_bayar;
    double diskon=0.15;

    harga=Raffa.nextDouble();
    potongan=diskon*harga;
    jml_bayar=harga-potongan;
    System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);

    Raffa.close();
    }    
}
