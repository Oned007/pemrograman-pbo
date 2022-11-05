public class mahasiswa {
    protected String nama, jurusan;
    protected int nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void hasilnya(){
        System.out.println("NIM :"+getNim());
        System.out.println("Nama : "+getNama());
        System.out.println("Jurusan : "+getJurusan());

    }

}
