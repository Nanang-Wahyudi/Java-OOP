package Tutorial.OOP;

// Membuat Class Dengan Constructor
class Mahasiswa {
    String nama;
    int npm;
    String jurusan;

    // Constructor Pertama Kali Dijalankan Saat Object Dibuat
    Mahasiswa(String inputNama, int inputNpm, String inputJurusan) {
        nama = inputNama;
        npm = inputNpm;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(npm);
        System.out.println(jurusan);
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println();

        // Membuat Object Dengan Constructor
        Mahasiswa mahasiswa1 = new Mahasiswa("Nanang Wahyudi", 1101211060, "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ronaldo", 1101211066, "Teknik Mesin");
    }
}
