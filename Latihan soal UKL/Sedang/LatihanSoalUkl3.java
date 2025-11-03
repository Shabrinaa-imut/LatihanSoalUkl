import java.util.Scanner;

public class LatihanSoalUkl3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Masukkan bilangan yang akan dihitung faktorialnya: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Input bilangan bulat bukan positif.");
        } else {
            int faktorial = 1;
            for (int i = 1; i <= number; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + number + " adalah: " + faktorial);
        }
    }
}
