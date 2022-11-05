import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswa mh1 = new mahasiswa();
        matakuliah mk = new matakuliah();
        pembayaran pm = new pembayaran();
        String nama,jur;
        int nim1,kode1;

        System.out.println("=========================================");
        System.out.println("Masukkan nama :");
        nama = input.nextLine();
        System.out.println("Masukkan jurusan :");
        jur = input.nextLine();
        System.out.println("Masukkkan nim :");
        nim1 = input.nextInt();
        System.out.println();

        mh1.setNim(nim1);
        mh1.setNama(nama);
        mh1.setJurusan(jur);
        pm.setAdmin(2500);
        mh1.hasilnya();
        mk.hasilnya();
        kode1= input.nextInt();
        if (kode1==266){
            System.out.println("Biaya mata kuliah : 350000");
            pm.setBiaya(350000);
        } else if (kode1==211) {
            System.out.println("Biaya mata kuliah : 300000");
            pm.setBiaya(300000);
        } else if (kode1==677) {
            System.out.println("Biaya kuliah 400000");
            pm.setBiaya(400000);
        }

        pm.hasilnya();
    }
}