package jobsheet4;

// Library
import java.util.Scanner;

public class HargaBayar04 {
    public static void main(String[] args) {
        
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variabel
        String merek_buku;
        int harga, jumlah, jumlah_halaman_buku;
        double diskon, total, bayar, jumlah_diskon;

        // Syntax Input
        System.out.println("Masukkan Merek Buku: ");
        merek_buku = input.next();

        System.out.println("Jumlah Halaman Buku: ");
        jumlah_halaman_buku = input.nextInt();

        System.out.println("Masukkan Harga Barang: ");
        harga = input.nextInt();

        System.out.println("Masukkan Jumlah Barang: ");
        jumlah = input.nextInt();

        System.out.println("Masukkan Diskon (Contoh: 0.1 AKA 10%): ");
        diskon = input.nextDouble();

        // Syntax Proses Total Harga Barang
        total = harga * jumlah;

        // Syntax Diskon
        jumlah_diskon = total * diskon;

        // Syntax Bayar 
        bayar = total - jumlah_diskon;

        // Tampilan
        System.out.println("==== RECEIPT ====");
        System.out.println("Merek Buku: " + merek_buku);
        System.out.println("Jumlah Halaman Buku: " + jumlah_halaman_buku + " Halaman");
        System.out.println("Diskon yang Anda dapatkan: Rp." + jumlah_diskon);
        System.out.println("Total Harga: Rp." + bayar);

    }
    
}
