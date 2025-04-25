import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");
        Mahasiswa[] arrayMhs = {mhs1, mhs2, mhs3};
        
        MataKuliah[] arrayMK = new MataKuliah[3];
        arrayMK[0] = new MataKuliah("MK001", "Struktur Data", 3);
        arrayMK[1] = new MataKuliah("MK002", "Basis Data", 3);
        arrayMK[2] = new MataKuliah("MK003", "Desain Web", 3);

        Penilaian[] arrayPenilaians = new Penilaian[5];
        arrayPenilaians[0] = new Penilaian(mhs1, arrayMK[0], 80, 85, 90); 
        arrayPenilaians[1] = new Penilaian(mhs1, arrayMK[1], 60, 75, 70); 
        arrayPenilaians[2] = new Penilaian(mhs2, arrayMK[0], 75, 70, 80); 
        arrayPenilaians[3] = new Penilaian(mhs3, arrayMK[1], 85, 90, 95); 
        arrayPenilaians[4] = new Penilaian(mhs3, arrayMK[2], 80, 90, 65);


        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("7. Update Nilai Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            System.out.println();

            if (menu == 1) {
                System.out.println("---------- Daftar Mahasiswa ----------"); 
                for (int i = 0; i < arrayMhs.length; i++) {
                    arrayMhs[i].tampilMahasiswa();
                }
                System.out.println();

            } else if (menu == 2) {
                System.out.println("---------- Daftar Mata Kuliah ----------");
                for (int i = 0; i < arrayMK.length; i++) {
                    arrayMK[i].tampilMataKuliah();
                }
                System.out.println();

            } else if (menu == 3) {
                System.out.println("---------- Data Penilaian ---------- ");
                for (int i = 0; i < arrayPenilaians.length; i++) {
                    arrayPenilaians[i].tampilPenilaian();
                }
                System.out.println();

            } else if (menu == 4) {
                System.out.println("---------- Urutan Nilai ---------- ");
                
                Penilaian sorter = new Penilaian(null, null, 0, 0, 0);
                sorter.selectionSort(arrayPenilaians);

                for (int i = 0; i < arrayPenilaians.length; i++) {
                    arrayPenilaians[i].tampilPenilaian();
                }
                System.out.println();

            } else if (menu == 5) {
                System.out.println("---------- Pencarian Mahasiswa (NIM) ----------");
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                String cari = sc.next();

                Penilaian pencari = new Penilaian(null, null, 0, 0, 0);
                
                int posisi = pencari.sequentialSearch(arrayMhs, cari);
                pencari.tampilHasilSearch(arrayMhs, cari, posisi);
                System.out.println();

            } else if (menu == 7) {
                sc.nextLine(); 
                System.out.print("Masukkan NIM: ");
                String nimUpdate = sc.nextLine();
                System.out.print("Masukkan Nama Mata Kuliah: ");
                String namaMK = sc.nextLine();
                System.out.print("Masukkan Nilai Tugas Baru: ");
                double nilaiBaru = sc.nextDouble();
                Penilaian.updateNilaiTugas(nimUpdate, namaMK, arrayPenilaians, nilaiBaru);
                System.out.println();
            } else if (menu == 0) { 
                break;
            } else {
                System.out.println("xxx Pilihan tidak tersedia, Coba lagi. xxx"); 
                System.out.println();
            }
           
        }

        System.out.println("Program Dihentikan, Terima Kasih :)");
    }
}