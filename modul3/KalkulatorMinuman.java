import java.util.Scanner;

public class KalkulatorMinuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalori minuman: ");
        double kaloriMinuman = scanner.nextDouble();

        System.out.print("Masukkan gula (gram): ");
        double gula = scanner.nextDouble();

        // Asumsikan 1 gram gula = 4 kalori
        double kaloriDariGula = gula * 4;

        // Gunakan Custom Live Template untuk menghitung total kalori
        double hasil = kaloriMinuman + kaloriDariGula;
        System.out.println("Hasil: " + hasil);// Ketik "kalkulatorMinuman" dan tekan Tab

        System.out.println("Total kalori minuman: " + hasil);
    }
}