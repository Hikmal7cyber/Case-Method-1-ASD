public class MataKuliahDemo {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("MK001","Struktur Data" , 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web", 3);

        System.out.println("Daftar Mata Kuliah:");
        mk1.tampilMataKuliah();
        mk2.tampilMataKuliah();
        mk3.tampilMataKuliah();
    }
}