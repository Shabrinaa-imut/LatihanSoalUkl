import java.util.Scanner;

public class LatihanSoalUkl1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penghitung Biaya Pengiriman Paket ===");
        System.out.print("Masukkan jarak pengiriman (Km):");
        double jarak = input.nextDouble();
        System.out.print("Masukkan berat paket (Kg):");
        double berat = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm):");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm):");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm):");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;   
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double totalBiaya = berat * biayaPerKg;

        if (volume > 100) {
            totalBiaya += 50000;
        }

        System.out.println("--- RINCIAN BIAYA PENGIRIMAN ---");
        System.out.println("Volume paket : " + volume + " cm^3");
        System.out.println("Biaya utama  : Rp " + (berat * biayaPerKg));
        if (volume > 100) {
            System.out.println("Biaya tambahan : Rp 50000" );
        }
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
    }
}
