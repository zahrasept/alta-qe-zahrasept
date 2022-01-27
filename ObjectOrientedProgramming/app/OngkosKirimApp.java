package tugas.app;

import tugas.data.Barang;
import tugas.data.OngkosKirim;

public class OngkosKirimApp {
    public static void main (String[] agrs){
        Barang barang = new Barang();
        OngkosKirim ongkosKirim = new OngkosKirim();

        barang.panjang = 5;
        barang.lebar = 2;
        barang.tinggi = 4;
        barang.berat = 1;

        ongkosKirim.syarat(barang.volume(), barang.berat());
    }
}