
class Penilaian {
     double nilaiTugas;
     double nilaiUTS;
     double nilaiUAS;

    public Penilaian(double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    double hitungNilaiAkhir() { 
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
}
