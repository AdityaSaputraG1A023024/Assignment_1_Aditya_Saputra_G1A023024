import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat Datang di Kalkulator ");
            System.out.println("Pilih operasi:");
            System.out.println("1. Penambahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");

            System.out.print("Masukkan pilihan (1/2/3/4/5): ");
            int choice = input.nextInt();

            if (choice == 5){
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil = 0;

            if (choice == 1) {
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
            } else if (choice == 2) {
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
            } else if (choice == 3) {
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
            } else if (choice == 4) {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Hasil tak terdefinisi, silakan coba lagi");
                }
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        input.close();
    }
}
