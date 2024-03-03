public class Mmahasiswa {
    public static void main(String[] args) {

        WaliMahasiswa wali = new WaliMahasiswa("rusdi", "081212804203", "Jl. Tembalang Selatan 6 No.30");
        Mahasiswa mahasiswa = new Mahasiswa("Ilham azrinargana pulungan", "24060122140130", "Teknik Informatika", wali);
        Mahasiswa(mahasiswa);
    }

    public static void Mahasiswa(Mahasiswa mahasiswa) {
        System.out.println("Data Mahasiswa");
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println();
        System.out.println("Data Wali");
        Wali(mahasiswa.getWali());
    }

    public static void Wali(WaliMahasiswa wali) {
        System.out.println("Nama Wali: " + wali.getNama());
        System.out.println("Nomor HP: " + wali.getNomorHp());
        System.out.println("Alamat: " + wali.getAlamat());
    }
}