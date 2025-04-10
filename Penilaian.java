public class Penilaian {
    public static double hitungRataRata(double[] nilai) {
        if (nilai == null || nilai.length == 0) return 0;
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }
    public static char tentukanNikai(double nilai) {
        if (nilai >= 85) return 'A';
        if (nilai >= 70) return 'B';
        if (nilai >= 60) return 'C';
        if (nilai >= 50) return 'D';
        return 'E';
    }

    public static void tampilkanHasil(String nama, double nilai) {
        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.println("Nama: " + nama);
        System.out.printf("Nilai: %.2f\n", nilai);
        System.out.println("Nilai: " + tentukanNilai(nilai));
    }
}
