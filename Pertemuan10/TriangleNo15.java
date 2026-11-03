package Pertemuan10;
import java.util.Scanner;

public class TriangleNo15 {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);
        System.out.print("Masukkan nilai n =    ");
        int n = Raffa.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            } 
            System.out.println();
            i++;
        }
        Raffa.close();
    }    

}
