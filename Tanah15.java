package PrakDaspro.Pertemuan2;

import java.util.Scanner;

public class Tanah15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjangTanah, lebarTanah, luasTanah;
        double diameterKolam, jariJari, luasKolam;
        double sisiTaman, luasTaman;
        double sisaTanah;

        System.out.print("Masukkan panjang tanah (meter): ");
        panjangTanah = input.nextDouble();

        System.out.print("Masukkan lebar tanah (meter): ");
        lebarTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam lingkaran (meter): ");
        diameterKolam = input.nextDouble();

        System.out.print("Masukkan panjang sisi taman persegi (meter): ");
        sisiTaman = input.nextDouble();

        luasTanah = panjangTanah * lebarTanah;
        jariJari = diameterKolam / 2;
        luasKolam = 3.14 * jariJari * jariJari;
        luasTaman = sisiTaman * sisiTaman;

        sisaTanah = luasTanah - (luasKolam + luasTaman);

        System.out.println("----------------------------------------");
        System.out.println("Luas Total Tanah    : " + luasTanah + " m²");
        System.out.println("Luas Kolam Ikan     : " + luasKolam + " m²");
        System.out.println("Luas Taman Bunga    : " + luasTaman + " m²");
        System.out.println("Sisa Tanah Pak Tono : " + sisaTanah + " m²");

        input.close();
    }
}