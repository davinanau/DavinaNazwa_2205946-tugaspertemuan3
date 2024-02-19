import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan rangking: ");
        int rangking = input.nextInt();

        System.out.print("Apakah naik kelas? (true/false): ");
        boolean naikKelas = input.nextBoolean();

        if (rangking == 1 && naikKelas) {
            System.out.println("Selamat! Anda berhak mendapatkan hadiah.");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk mendapatkan hadiah.");
        }
    }
}
