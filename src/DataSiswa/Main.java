package DataSiswa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    // COLORS
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException {
        System.out.print(CYAN + "\nPak Aji :" + RESET + " Darrel tolong buatkan saya list absensi siswa.");
        TimeUnit.SECONDS.sleep(4);
        System.out.print(CYAN + "\nDarrel :" + RESET + " Baik Pak.\n");
        TimeUnit.SECONDS.sleep(2);

        Scanner input = new Scanner(System.in);
        int data = 1;
        System.out.print("\nMasukkan Jumlah siswa : ");
        int dataSiswa = input.nextInt();

        String[] namaSiswa = new String[dataSiswa];
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.print("Nama siswa ke " + (data + i) + ": ");
            namaSiswa[i] = input.next() + input.nextLine();
        }

        System.out.println("\n########## ABSENSI KELAS 10 PPLG 2 ##########\n");

        for (int i = 0; i < namaSiswa.length; i++) {
            Arrays.sort(namaSiswa);
            String urutan = namaSiswa[i];
            System.out.println((data + i) + ". " + urutan.toUpperCase());
            TimeUnit.MILLISECONDS.sleep(800);
        }
    }
}