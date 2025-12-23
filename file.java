import java.util.Scanner;
import java.util.ArrayList;

public class file{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> daftarFilm = new ArrayList<>();

        while (true) {
            System.out.println("=== ADMIN BIOSKOP ===");
            System.out.println("1. Tambah Film");
            System.out.println("2. Hapus Film");
            System.out.println("3. Lihat Daftar Film");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            if (menu == 4) {
                System.out.println("Terimakasih!");
                break;
            }
            else if (menu > 4 || menu < 1) {
                System.out.println("Invalid input (Input harus antara angka 1 sampai 4!)");
                continue;
            }
            else {
                switch (menu) {
                    case 1:
                        System.out.print("Masukkan nama film yang ingin di-tambahkan: ");
                        String namaFilm = scanner.next();
                        daftarFilm.add(namaFilm);
                        System.out.println("Film " + "'" + namaFilm + "'" + " berhasil di-tambahkan!");
                        break;
                    
                    default:
                        break;
                }
            }
        }
    }
}