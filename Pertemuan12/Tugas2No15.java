package Pertemuan12;
import java.util.Scanner;

public class Tugas2No15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("===============================\n");

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = Raffa.nextInt();
        Raffa.nextLine(); // Membersihkan buffer newline

        if (jumlahPesanan <= 0) {
            System.out.println("Tidak ada pesanan yang dibuat.");
        } else {
            // Array terpisah untuk menyimpan pesanan pelanggan
            String[] daftarPesanan = new String[jumlahPesanan];
            int[] hargaPesanan = new int[jumlahPesanan];
            int totalBiaya = 0;

            for (int i = 0; i < jumlahPesanan; i++) {
                boolean ditemukan = false;

                // Validasi ulang hingga menu yang dicari tersedia di daftar menu
                while (!ditemukan) {
                    System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                    String cariMenu = Raffa.nextLine();

                    // Algoritma Linear Search
                    for (int j = 0; j < menu.length; j++) {
                        if (menu[j].equalsIgnoreCase(cariMenu)) {
                            daftarPesanan[i] = menu[j];
                            hargaPesanan[i] = harga[j];
                            totalBiaya += harga[j];
                            ditemukan = true;
                            System.out.println("  -> Ditemukan: " + menu[j] + " (Rp " + harga[j] + ")");
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("  -> Menu \"" + cariMenu + "\" tidak tersedia! Silakan input ulang.");
                    }
                }
            }

            System.out.println("\n=== STRUK PESANAN KAFE KAMPUS ===");
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.printf("%d. %-16s : Rp %d\n", (i + 1), daftarPesanan[i], hargaPesanan[i]);
            }
            System.out.println("---------------------------------");
            System.out.println("Total Biaya         : Rp " + totalBiaya);
            System.out.println("=================================");
        }

        Raffa.close();
    }
}