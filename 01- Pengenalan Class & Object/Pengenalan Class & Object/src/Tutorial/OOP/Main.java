package Tutorial.OOP;

// Membuat Class Sebagai Template
class Mahasiswa {
    String nama;
    int npm;
    String jurusan;
}

public class Main {

    public static void main(String[] args) {

        // Membuat Object Dari Class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Nanang Wahyudi";
        mhs1.npm = 1101211060;
        mhs1.jurusan = "Teknik Informatika";

        System.out.println();
        System.out.println(mhs1.nama);
        System.out.println(mhs1.npm);
        System.out.println(mhs1.jurusan);
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Ronaldo";
        mhs2.npm = 1101211066;
        mhs2.jurusan = "Teknik Mesin";

        System.out.println(mhs2.nama);
        System.out.println(mhs2.npm);
        System.out.println(mhs2.jurusan);
        System.out.println();
    }
}
