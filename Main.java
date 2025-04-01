import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa [] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("Daftar Mahasiswa: ");
                for (Mahasiswa m : mhs){
                    m.tampilMahasiswa();
                }
            } else if (menu == 2) {
                System.out.println("Daftar Mata Kuliah: ");

            } else if (menu == 3) {
                System.out.println("Data Penilaian: ");

            } else if (menu == 4) {
                System.out.println("Data Penilaian: ");

            } else if (menu == 5) {
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");

            } else if (menu == 0) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, Coba lagi.");
            }
        }

        System.out.println("Program Dihentikan, Terima Kasih :)");
    }
}