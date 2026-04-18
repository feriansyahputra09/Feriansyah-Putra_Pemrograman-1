package P6;

public class Latihan1 {
    
    private String identitas;
    private String kota;
    private int usia;
    private double mtk, ing, ipa;

    public void isiProfil(String n, String k, int u) {
        identitas = n;
        kota = k;
        usia = u;
    }

    public void isiNilai(double n1, double n2, double n3) {
        mtk = n1;
        ing = n2;
        ipa = n3;
    }

    public double hitungRata() {
        return (mtk + ing + ipa) / 3;
    }

    public void tampilkanData() {
        System.out.println("Nama Mahasiswa : " + identitas);
        System.out.println("Asal Daerah    : " + kota);
        System.out.println("Umur           : " + usia);
    }

    public void tampilkanData(double rata) {
        System.out.println("Nama Mahasiswa : " + identitas);
        System.out.println("Rata-rata Skor : " + rata);
    }

    public static void main(String[] args) {
        Latihan1 mhs = new Latihan1();

        mhs.isiProfil("Anna", "Philippines", 15);
        mhs.isiNilai(80, 95.5, 100);

        System.out.println("=== INFO VERSI 1 ===");
        mhs.tampilkanData();

        System.out.println("\n=== INFO VERSI 2 ===");
        mhs.tampilkanData(mhs.hitungRata());
    }
}