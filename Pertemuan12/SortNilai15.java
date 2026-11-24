package Pertemuan12;
import java.util.Arrays;
import java.util.Scanner;

public class SortNilai15 {
    public static void main(String[] args) {
    Scanner Raffa = new Scanner(System.in);
    System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
    int n = Raffa.nextInt();
    int[] nilai = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai[i] = Raffa.nextInt();
    }
    System.out.print("Masukkan nilai yang ingin dicari: ");
    int key = Raffa.nextInt();
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        

        System.out.println("Sesudah diurutkan : " + Arrays.toString(nilai));
    }
}
