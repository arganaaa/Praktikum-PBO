// Nama         : Ilham azrinargana Pulungan
// NIM          : 24060122140130
// Tanggal      : 03-03-2024
// Deskripsi    : Kelas yang berisi wali mahasiswa

public class WaliMahasiswa {

    private String nama;
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nomorHp, String alamat) {
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}