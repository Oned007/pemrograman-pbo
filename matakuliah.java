public class matakuliah extends mahasiswa{
    private int kode;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void hasilnya(){
        System.out.println("DAFTAR MATAKULIAH JURUSAN :"+getJurusan());
        System.out.println("266-Data mining");
        System.out.println("211-Grafika Terapan");
        System.out.println("677-Pemrograman Berbasis Objek");
        System.out.println("Masukkan kode matakuliah :");
    }

}

