/*
Nama        : Ilham azrinargana pulungan
NIM         : 24060122140130
Tanggal     : 8 April 2024
Deskripsi   : Kelas konstruksi generics untuk kupu
*/

public class data<T extends kupu> {
    private T Kupu;

    public T getIsi(){
        return Kupu;
    }

    public void setIsi(T tipeKupu){
        Kupu = tipeKupu;
    }
}