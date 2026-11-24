package Pertemuan12;
public class SearchNilai15 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        // Parameter Unik P=15: key = 50 + (15 mod 50) = 65
        int key = 65;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}

