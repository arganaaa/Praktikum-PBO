/*
 * nama : ilham azrinargana pulungan
 * nim  : 24060122140130
 */

class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}


public class asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert(jarijari>0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }   
}

// pada fugsi assert terjadi kesalahan karena hanya mengatasi jika jari jari no maka dari itu fungsi assert harus di perbaiki