package Pertemuan12;
import java.util.Arrays;

public class ArrayBilangan15 {
    public static void main(String[] args) {
        int[] bil = {15, 23, -2, 20};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}
