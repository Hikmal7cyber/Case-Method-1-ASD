public class Penilaian {
     double nilaiTugas;
     double nilaiUTS;
     double nilaiUAS;
     Mahasiswa mahasiswa;
     MataKuliah mataKuliah;

    Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    double hitungNilaiAkhir() { 
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilPenilaian() {
        System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | Nilai Akhir: " + hitungNilaiAkhir());
    }

    void selectionSort(Penilaian[] listNilai) {
        for (int i = 0; i < listNilai.length-1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listNilai.length; j++) {
                if (listNilai[j].hitungNilaiAkhir() > listNilai[idxMax].hitungNilaiAkhir()) {
                    idxMax = j;
                }
            }

            Penilaian tmp = listNilai[idxMax];
            listNilai[idxMax] = listNilai[i];
            listNilai[i] = tmp;
        }
    }

    int sequentialSearch(Mahasiswa[] listMhs, String nimCari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].NIM.equals(nimCari)) { 
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void tampilHasilSearch(Mahasiswa[] listMhs, String nimCari, int pos) {
        if (pos != -1) {
            Mahasiswa m = listMhs[pos];
            System.out.println("Mahasiswa Ditemukan: NIM: " + m.NIM + " | Nama: " + m.nama + " | Prodi: " + m.prodi);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }
    
}
