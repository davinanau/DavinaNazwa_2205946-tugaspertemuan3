import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tiga buah pecahan
        System.out.print("Masukkan pecahan pertama: ");
        double pecahan1 = input.nextDouble();

        System.out.print("Masukkan pecahan kedua: ");
        double pecahan2 = input.nextDouble();

        System.out.print("Masukkan pecahan ketiga: ");
        double pecahan3 = input.nextDouble();

        // Operasi tambah
        double tambah = pecahan1 + pecahan2 + pecahan3;
        System.out.println("Hasil penjumlahan: " + tambah);

        // Operasi kurang
        double kurang = pecahan1 - pecahan2 - pecahan3;
        System.out.println("Hasil pengurangan: " + kurang);

        // Operasi kali
        double kali = pecahan1 * pecahan2 * pecahan3;
        System.out.println("Hasil perkalian: " + kali);

        // Operasi bagi
        double bagi = pecahan1 / pecahan2 / pecahan3;
        System.out.println("Hasil pembagian: " + bagi);
    }
}
