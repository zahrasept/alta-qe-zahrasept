package tugas.app;

import tugas.data.Persegi;
import tugas.data.PersegiPanjang;
import tugas.data.Segitiga;

public class BangunDatarApp {
    public static void main(String[] args){
        Persegi persegi = new Persegi();
        persegi.s = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.a = 3;
        segitiga.t = 4;
        segitiga.s1 = 5;
        segitiga.s2 = 5;

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.p = 7;
        persegipanjang.l = 8;

        persegi.luas();
        persegi.keliling();
        segitiga.luas();
        segitiga.keliling();
        persegipanjang.luas();
        persegipanjang.keliling();
    }
}