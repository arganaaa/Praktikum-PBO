/*
 * nama : ilham azrinargana pulungan
 * nim  : 24060122140130
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println( angka + "" + "bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!");
        }
    }
}

// pada baris 12 tidak di eksekusi pada saat exception karena masuk ke if dan masuk throw exceptio
// kemudian pada baris 21 di eksekusi karena dipanggil dalam fungsi if nya 