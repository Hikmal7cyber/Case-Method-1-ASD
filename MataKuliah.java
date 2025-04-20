public class MataKuliah{
    String kodeMK, namaMK;
    int sks;

    public MataKuliah (String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah(){
        System.out.println("Kode MK: " + kodeMK + " | Nama MK: " + namaMK + " | Jumlah SKS: " + sks);
    }
}