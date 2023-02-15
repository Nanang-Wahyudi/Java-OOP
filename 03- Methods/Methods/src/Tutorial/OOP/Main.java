package Tutorial.OOP;

class Mahasiswa {
    // Data Member
    String nama;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String jurusan) {
        // this berfungsi untuk memberitahu bahwa data yang dipanggil adalah Data Member
        // bukan data dari constructor
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Method tanpa return dan tanpa parameter
    void TampilData() {
        System.out.println(this.nama);
        System.out.println(this.jurusan);
        System.out.println();
    }

    // Method tanpa return tapi dengan parameter
    void UbahNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tapi tanpa parameter
    String AmbilNama() {
        return this.nama;
    }

    String AmbilJurusan() {
        return this.jurusan;
    }

    // Method dengan return dan dengan parameter
    String pesan(String IsiPesan) {
        return IsiPesan + " Semuanya, Perkenalkan Nama Saya " + this.nama;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Mahasiswa mahasiswa1 = new Mahasiswa("Nanang Wahyudi", "Teknik Informatika");

        // Panggil Method
        mahasiswa1.TampilData();
        mahasiswa1.UbahNama("Ronaldo");
        mahasiswa1.TampilData();

        System.out.println(mahasiswa1.AmbilNama());
        System.out.println(mahasiswa1.AmbilJurusan() + "\n");

        String data = mahasiswa1.pesan("Selamat Pagi");
        System.out.println(data + "\n");
    }
}
