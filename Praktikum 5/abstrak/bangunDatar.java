/*
Nama        : ilham azrinargana pulungan 
NIM         : 24060122140130
Tanggal     : 23 Maret 2024
Deskripsi   : Kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class bangunDatar {
    //atribut
    protected double luas;

    //method
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l){
        luas = l;
    }
    public double getLuas(){
        return luas;
    }
}