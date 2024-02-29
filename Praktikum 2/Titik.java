// Nama         : Ilham azrinargana Pulungan
// NIM          : 24060122140130
// Tanggal      : 28-02-2024
// Deskripsi    : Kelas yang berisi program kelas titik
public class Titik {
    private float absis;
    private float ordinat;
    static float counterTitik;
 
    public Titik(){
     absis = 0;
     ordinat = 0;
     counterTitik++;
    }
 
    public Titik(float absis, float ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
   }
 
   float getAbsis() {
       return absis;
   }
 
   float getOrdinat() {
       return ordinat;
   }
 
   static float getCounter() {
       return counterTitik;
   }
 
   void setAbsis(float a) {
       absis = a;
   }
 
   void setOrdinat(float b) {
       ordinat = b;
   }

   public float getJarakPusat(){
    return (float) Math.sqrt(absis*absis + ordinat*ordinat);
   }
   public void refleksiX(){
    this.ordinat = this.ordinat*(-1);
   }

   public void refleksiY(){
    this.absis = this.absis*(-1);
   }

   public Titik getRefleksiX(){
    Titik t = new Titik(this.absis,-(this.ordinat));
    return t;
   }

   public Titik getRefleksiY(){
    Titik t = new Titik(-(this.absis),this.ordinat);
    return t;
   }

 }