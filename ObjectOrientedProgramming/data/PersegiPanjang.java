package tugas.data;

public class PersegiPanjang extends BangunDatar {
    public  float p,l;

    public float luas() {
        float luas = p * l;
        System.out.println("Luas Persegi Panjang: " +luas);
        return luas;
    }

    public float keliling() {
        float keliling = (2*p) + (2*l);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
}