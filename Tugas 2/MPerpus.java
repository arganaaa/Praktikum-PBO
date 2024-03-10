/*
 * nama : ilham azrinargana pulungan
 * nim  : 24060122140130
 */
public class MPerpus {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Ilham azrinargana Pulungan");
        Buku buku1 = new Buku("Danau toba");
        Buku buku2 = new Buku("Merapi");
        
        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);

            anggota.pinjamBuku(new Buku("sangkuriang"));
            System.out.println("Buku yang dipinjam oleh " + anggota.getNama() + ":");
            for (Buku buku : anggota.getBukuPinjaman()) {
                if (buku != null) {
                    System.out.println("- " + buku.getJudul());
                }
            }
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        }
    }
}
