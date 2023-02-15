package Tutorial.OOP;

class Mahasiswa {
    String Nama;
    String Jurusan;

    Mahasiswa(String Nama, String Jurusan) {
        this.Nama = Nama;
        this.Jurusan = Jurusan;
    }

    void Tampil() {
        System.out.println("\n Nama Mahasiswa : " + this.Nama);
        System.out.println(" Jurusan        : " + this.Jurusan);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("Nanang Wahyudi", "Teknik Informatika");
        mahasiswa1.Tampil();

        // Menampilkan address
        String addressMahasiswa1 = Integer.toHexString(System.identityHashCode(mahasiswa1));
        System.out.println(" Address 1      : " + addressMahasiswa1 + "\n");

        // Assignment object
        Mahasiswa mahasiswa2 = mahasiswa1;
        mahasiswa2.Tampil();
        String addressMahasiswa2 = Integer.toHexString(System.identityHashCode(mahasiswa2));
        System.out.println(" Address 2      : " + addressMahasiswa2 + "\n");

        // Karena mahasiswa1 & mahasiswa2 berada pada address dan referensi yang sama,
        // maka kita coba edit
        mahasiswa1.Nama = "Yoga Fradana";
        mahasiswa1.Tampil();
        mahasiswa2.Tampil();
        System.out.println();

        // Kita akan memasukkan object kedalam methods
        fungsi(mahasiswa2);
        mahasiswa1.Tampil();
        mahasiswa2.Tampil();
        System.out.println();
    }

    public static void fungsi(Mahasiswa dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(" Address Fungsi : " + addressDataBuku);
        dataBuku.Jurusan = "Sistem Komputer";
    }
}
