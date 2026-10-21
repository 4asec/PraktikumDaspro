import  java.util.Scanner;
public class KafeDoWhile15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh=7000, hargaRoti=200000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = Raffa.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi di batalkan");
                break;
            }
            System.out.println("Jumlah kopi:    ");
            kopi = Raffa.nextInt();
            System.out.println("Jumlah teh");
            teh =  Raffa.nextInt();
            System.out.println("Jumlah roti");
            roti = Raffa.nextInt();

            double totalHarga;
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus di bayar: Rp    "+totalHarga);
            Raffa.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.    ");

        Raffa.close();

    }
    
}
