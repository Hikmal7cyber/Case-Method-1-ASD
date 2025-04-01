public class MataKuliah{
    String kodeMK, namaMK;
    int sks;

    public MataKuliah (String kdMK, String nmMK, int sks){
        kodeMK = kdMK;
        namaMK = nmMK;
        this.sks = sks;
    }

    void tampilMataKuliah(){
        System.out.println("Kode MK: " + kodeMK + " | Nama MK: " + namaMK + " | Jumlah SKS: " + sks);
    }
}