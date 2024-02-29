// Nama         : Ilham azrinargana Pulungan
// NIM          : 24060122140130
// Tanggal      : 28-02-2024
// Deskripsi    : Kelas yang berisi main program Titik
public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(6, 7);
        Titik t2 = new Titik(3, 4);
        Titik t3 = new Titik();

        t3.setAbsis(5);
        t3.setOrdinat(6);
        System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounter());
        System.out.println("t1: " + t1.getAbsis()+ ", " + t1.getOrdinat());
        System.out.println("t2: " + t2.getAbsis()+ ", " + t2.getOrdinat());
        System.out.println("t3: " + t3.getAbsis()+ ", " + t3.getOrdinat());
        System.out.println("t1 titik pusat  : "+ t1.getJarakPusat());
        t1.refleksiX();
        System.out.println("Titik T1 refleksi terhadap sumbu x "+ "(" + t1.getAbsis()+ "," + t1.getOrdinat()+ ")");
        t2.refleksiY();
        System.out.println("Titik T2 refleksi terhadap sumbu y "+ "(" + t2.getAbsis()+ "," + t2.getOrdinat()+ ")");

        Titik t4 = t3.getRefleksiX();
        System.out.println("Refleksi T3 terhadap X : ("+ t4.getAbsis() + "," + t4.getOrdinat()+ ")");

        //kesimpulan
        // jika atribut itu menggunakan private maka hanya dapat di akses oleh kelas itu sendiri dan jika ingin di akses oleh kelas lain
        // atribut akan eror karena atribut mengunakan private

        Garis garis2 = new Garis(new Titik(1,2), new Titik(3,2));

        System.out.println("Titik awal Garis 2: ("+ garis2.getTitikAwal().getAbsis() + ","+ garis2.getTitikAwal().getOrdinat()+ ")");
        System.out.println("Titik akhir Garis 2: ("+ garis2.getTitikAkhir().getAbsis() + ","+ garis2.getTitikAkhir().getOrdinat()+ ")");
    }
}
