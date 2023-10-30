import java.util.Scanner;
import java.lang.String;

/**
 * Program ini mengkonversi antara menit dan jam.
 * Pengguna dapat memilih untuk mengonversi dari menit ke jam atau dari jam ke menit.
 * Program akan terus berjalan sampai pengguna memilih untuk keluar.
 */
public class convert {

    /**
     * Fungsi utama untuk menjalankan program konversi waktu.
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        boolean ulang = true;

        do {
            // Tampilkan menu
            System.out.println("konversi satuan waktu");
            System.out.println("menu:");
            System.out.println("1. Menit -> Jam");
            System.out.println("2. Jam -> menit");

            // Ambil input pilihan
            Scanner pilih = new Scanner(System.in);
            int choose = pilih.nextInt();

            // Proses konversi
            switch (choose) {
                case 1:
                    // Konversi menit ke jam
                    System.out.print("Masukan input menit: ");
                    double menit = pilih.nextInt();
                    double hasil1 = menit / 60;
                    System.out.println("Hasil Konversi dari Menit ke Jam ialah: " + hasil1);
                    break;

                case 2:
                    // Konversi jam ke menit
                    System.out.print("Masukan input jam: ");
                    double jam = pilih.nextInt();
                    double hasil2 = jam * 60;
                    System.out.println("Hasil Konversi dari Jam ke Menit ialah: " + hasil2);
                    break;
            }

            // Tanyakan apakah ingin mengulang
            System.out.print("Apakah anda ingin mengkonversi ulang?(y/n): ");
            Scanner scanner = new Scanner(System.in);
            char ulangChar = scanner.next().charAt(0);
            ulang = ulangChar == 'y' || ulangChar == 'Y';
        } while (ulang);
    }
}