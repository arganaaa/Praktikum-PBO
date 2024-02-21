
public class Titik {
   double absis;
   double ordinat;
   static float counterTitik;

   Titik(){
    absis = 0;
    ordinat = 0;
    counterTitik++;
   }

   Titik(double absis, double ordinat) {
      this.absis = absis;
      this.ordinat = ordinat;
      counterTitik++;
  }

  double getAbsis() {
      return absis;
  }

  double getOrdinat() {
      return ordinat;
  }

  static double getCounter() {
      return counterTitik;
  }

  void setAbsis(double a) {
      absis = a;
  }

  void setOrdinat(double b) {
      ordinat = b;
  }
}
