public class pembayaran extends mahasiswa{
    private int biaya;
    private int admin;

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int totalakhir(){
        int a=getBiaya()+getAdmin();
        return a;
    }
    public void hasilnya(){
        System.out.println("Total :"+totalakhir());;
    }
}
