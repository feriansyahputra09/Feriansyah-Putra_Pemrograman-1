package P6;

public class Latihan2 {

    private double alasSegitiga;
    private double tinggiSegitiga;

    public void setDimensi(double a, double t) {
        alasSegitiga = a;
        tinggiSegitiga = t;
    }

    public double ambilAlas() {
        return alasSegitiga;
    }

    public double ambilTinggi() {
        return tinggiSegitiga;
    }

    public double hitungLuas() {
        return (alasSegitiga * tinggiSegitiga * 0.5);
    }

    public static void main(String[] args) {
        Latihan2[] kumpulanSegitiga = new Latihan2[2];

        kumpulanSegitiga[0] = new Latihan2();
        kumpulanSegitiga[1] = new Latihan2();

        kumpulanSegitiga[0].setDimensi(8.0, 12.0);
        kumpulanSegitiga[1].setDimensi(7.7, 11.23);

        for (int i = 0; i < 2; i++) {
            System.out.println("Objek Segitiga ke-" + (i + 1));
            System.out.println("Tinggi : " + kumpulanSegitiga[i].ambilTinggi());
            System.out.println("Alas   : " + kumpulanSegitiga[i].ambilAlas());
            System.out.println("Luas   : " + kumpulanSegitiga[i].hitungLuas());
            System.out.println();
        }
    }
}