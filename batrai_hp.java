

public class batrai_hp {

    public static void main(String[] args) {
        
        // penggunaan batrai perjam
        final int PenggunaanBatraiPerjam = 10;


        // batrai awal
        int BatraiAwal = 100;

        // batrai hp seteelah di gunakan selama 6 jam
        for(int i =1; i<=6; i++) {
            BatraiAwal -= PenggunaanBatraiPerjam;
        }

        System.out.println("sisa batrai selama di gunakan 6 jam = " + BatraiAwal  +  "%");
    }
}