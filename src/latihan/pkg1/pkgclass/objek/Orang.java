package latihan.pkg1.pkgclass.objek;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Orang {
    /*
    Tujuan dari "private" adalah agar tidak variable yang di deklarasikan pada class
    ini hanya bisa di akses pada class ini tidak bisa di akses di luar class ini
    */
    private String nama;
    private int NIM;
    private int umur;
    
    Orang(String nama, int NIM, int umur){
        this.setNama(nama);
        this.setNim(NIM);
        this.setUmur(umur);
    }
    public String getNama(){
    return nama;
    
}
    public int getNim(){
    return NIM;
}
    public int getUmur(){
    return umur;
}
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(int NIM){
        this.NIM = NIM;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
}
