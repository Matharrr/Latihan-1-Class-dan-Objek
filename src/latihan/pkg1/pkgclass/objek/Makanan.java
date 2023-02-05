package latihan.pkg1.pkgclass.objek;

/**
 *
 * @author user
 */
public class Makanan {
    private String nama;
    private int jumlah;
    private int kalori;
    
    Makanan(String nama, int jumlah, int kalori){
        this.setNama(nama);
        this.setJumlah(jumlah);
        this.setKalori(kalori);
    }
    public String getNama(){
    return nama;
    
}
    public int getJumlah(){
    return jumlah;
}
    public int getKalori(){
    return kalori;
}
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setKalori(int kalori){
        this.kalori = kalori;
    }
}