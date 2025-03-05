import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (choice == 1) {
            // Admin login
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Check credentials
            if (username.equals("Admin069") && password.equals("Password069")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (choice == 2) {
            // Mahasiswa login (not implemented in the example)
            System.out.println("Login Mahasiswa belum diimplementasikan.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
        System.out.println("\nProcess finished with exit code 0");
    }
}
