package tugas.app;

import tugas.data.Animal;
import tugas.data.Carnivor;
import tugas.data.Herbivor;
import tugas.data.Omnivor;

public class AnimalApp {
    public static void main(String[] args){
        Animal animal = new Animal();
        Herbivor herbivor = new Herbivor();
        herbivor.namaBinatang = "Kambing";
        herbivor.jenisMakanan = "'tumbuhan'";
        herbivor.jenisGigi = "tumpul";

        Carnivor carnivor = new Carnivor();
        carnivor.namaBinatang = "Harimau";
        carnivor.jenisMakanan = "'daging'";
        carnivor.jenisGigi = "tajam";

        Omnivor omnivor = new Omnivor();
        omnivor.namaBinatang = "Ayam";
        omnivor.jenisMakanan = "'semua'";
        omnivor.jenisGigi = "tajam dan tumpul";

        animal.identity_myself();
        herbivor.identity_myself();
        carnivor.identity_myself();
        omnivor.identity_myself();
    }
}
