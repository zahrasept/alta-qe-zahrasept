package tugas.data;

public class OngkosKirim {

    public static void syarat(float volume, float berat) {
        if (volume <= 50 && berat == 1){
            System.out.println("Harga: Rp 5000");
        }
        else{
            System.out.println("melebihi harga standard");
        }
    }
}