import java.util.Scanner;
import java.time.LocalDate;

public class BellySaputracodelab1 {
    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelaminInput = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup Scanner setelah digunakan
        scanner.close();

        // Mendapatkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear();

        // Menghitung umur
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin berdasarkan input
        String jenisKelamin;
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput == 'P' || jenisKelaminInput == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak diketahui";
        }

        // Menampilkan hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur         : " + umur + " tahun");
    }
}
