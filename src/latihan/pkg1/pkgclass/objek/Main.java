package latihan.pkg1.pkgclass.objek;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Main {
    /*
    Enkapsulasi adalah suatu proses pembungkusan data atau informasi sehingga tidak
    dapat diakses secara bebas oleh class lain. Enkapsulasi merupakan prinsip dasar
    dari OOP (Object Oriented Programming) yang digunakan untuk membatasi akses dan
    menjaga integritas data
    */
    public static void main(String[] args) {
        Orang orang = new Orang("Muhamad Mathar Rizqi", 221524014, 19);
        System.out.println("Class Orang.java");
        System.out.println("Getters method :");
        System.out.println(orang.getNama());
        System.out.println(orang.getNim());
        System.out.println(orang.getUmur());
        System.out.println("==================");
        orang.setNama("Mathar aja");
        orang.setNim(222222);
        orang.setUmur(10);
        System.out.println("Setters method :");
        System.out.println(orang.getNama());
        System.out.println(orang.getNim());
        System.out.println(orang.getUmur());
        System.out.println("\n");
        
        Makanan makanan = new Makanan("Cilok", 10, 200);
        System.out.println("Class Makanan.java");
        System.out.println("Getters method :");
        System.out.println(makanan.getNama());
        System.out.println(makanan.getJumlah());
        System.out.println(makanan.getKalori());
        System.out.println("==================");
        makanan.setNama("Ayam");
        makanan.setJumlah(2);
        makanan.setKalori(150);
        System.out.println("Setters method :");
        System.out.println(makanan.getNama());
        System.out.println(makanan.getJumlah());
        System.out.println(makanan.getKalori());
        
    }
    
}
