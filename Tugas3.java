import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang Di Ramalan Zodiak");
        System.out.println("Tentukan Zodiakmu");

        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan bulan lahir (contoh:Maret): ");
        String Bulan = sc.nextLine();

        if (Bulan.equalsIgnoreCase("Maret") && tanggal >= 21 || Bulan.equalsIgnoreCase("April") && tanggal <= 19) {
            System.out.println("Zodiak Anda adalah Aries.");
        } else if (Bulan.equalsIgnoreCase("April") && tanggal >= 20 || Bulan.equalsIgnoreCase("Mei") && tanggal <= 20) {
            System.out.println("Zodiak Anda adalah Taurus.");
        } else if (Bulan.equalsIgnoreCase("Mei") && tanggal >= 21 || Bulan.equalsIgnoreCase("Juni") && tanggal <= 20) {
            System.out.println("Zodiak Anda adalah Gemini.");
        } else if (Bulan.equalsIgnoreCase("Juni") && tanggal >= 21 || Bulan.equalsIgnoreCase("Juli") && tanggal <= 22) {
            System.out.println("Zodiak Anda adalah Cancer.");
        } else if (Bulan.equalsIgnoreCase("Juli") && tanggal >= 23 || Bulan.equalsIgnoreCase("Agustus") && tanggal <= 22) {
            System.out.println("Zodiak Anda adalah Leo.");
        } else if (Bulan.equalsIgnoreCase("Agustus") && tanggal >= 23 || Bulan.equalsIgnoreCase("September") && tanggal <= 22) {
            System.out.println("Zodiak Anda adalah Virgo.");
        } else if (Bulan.equalsIgnoreCase("September") && tanggal >= 23 || Bulan.equalsIgnoreCase("Oktober") && tanggal <= 22) {
            System.out.println("Zodiak Anda adalah Libra.");
        } else if (Bulan.equalsIgnoreCase("Oktober") && tanggal >= 23 || Bulan.equalsIgnoreCase("November") && tanggal <= 21) {
            System.out.println("Zodiak Anda adalah Scorpio.");
        } else if (Bulan.equalsIgnoreCase("November") && tanggal >= 22 || Bulan.equalsIgnoreCase("Desember") && tanggal <= 21) {
            System.out.println("Zodiak Anda adalah Sagittarius.");
        } else if (Bulan.equalsIgnoreCase("Desember") && tanggal >= 22 || Bulan.equalsIgnoreCase("Januari") && tanggal <= 19) {
            System.out.println("Zodiak Anda adalah Capricorn.");
        } else if (Bulan.equalsIgnoreCase("Januari") && tanggal >= 20 || Bulan.equalsIgnoreCase("Februari") && tanggal <= 18) {
            System.out.println("Zodiak Anda adalah Aquarius.");
        } else if (Bulan.equalsIgnoreCase("Februari") && tanggal >= 19 || Bulan.equalsIgnoreCase("Maret") && tanggal <= 20) {
            System.out.println("Zodiak Anda adalah Pisces.");
        } else {
            System.out.println("Tanggal/Bulan yang dimasukkan tidak valid.");
        }

        sc.close();
    }
}
