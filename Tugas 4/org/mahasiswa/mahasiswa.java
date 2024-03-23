package org.mahasiswa;
import org.walimahasiswa.walimahasiswa;

public class mahasiswa {
    private String nim;
    private String jurusan;
    private walimahasiswa wali;
    public mahasiswa(String nim, String jurusan, walimahasiswa wali) {
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
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

    @Override
    public String toString() {
        return nim + ", " + jurusan + ", " + wali;
    }
}