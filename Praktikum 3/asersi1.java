/*
 * nama : ilham azrinargana pulungan
 * nim  : 24060122140130
 */
public class asersi1{
    public static void main(String[] args) {
        int x =0;
        if (x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x>0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }

}