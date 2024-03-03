// Nama         : Ilham azrinargana Pulungan
// NIM          : 24060122140130
// Tanggal      : 03-03-2024
// Deskripsi    : Kelas yang berisi program dari mahasiswa 
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }
}
