package tugas.app;

import tugas.data.Kalkulator;

public class KalkulatorApp {
    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator();

        kalkulator.penjumlahan(3,4);
        kalkulator.pengurangan(15,4);
        kalkulator.perkalian(10,10);
        kalkulator.pembagian(12,3);
    }
}
