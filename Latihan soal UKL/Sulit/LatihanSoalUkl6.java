import java.util.Scanner;

public class LatihanSoalUkl6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++) {
                System.out.print("Elemen [" + i + "][" + a + "]: ");
                matriks1[i][a] = input.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++) {
                System.out.print("Elemen [" + i + "][" + a + "]: ");
                matriks2[i][a] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++) {
                hasil[i][a] = matriks1[i][a] + matriks2[i][a];
            }
        }
        
        System.out.println("Hasil penjumlahan dua matriks:");
        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++) {
                System.out.print(hasil[i][a] + " ");
            }
            System.out.println();
        }
    }
}
