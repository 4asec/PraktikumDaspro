package PrakDaspro.Pertemuan3;
import  java.util.Scanner;

public class MenghitungLuasPersegiPanjang15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        panjang= Raffa.nextInt();
        lebar=Raffa.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas persegi adalah = " +luas);

        Raffa.close();
        
    }
}
