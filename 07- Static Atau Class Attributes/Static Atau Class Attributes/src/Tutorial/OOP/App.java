package Tutorial.OOP;

class Elektronik {
    private String Nama;
    static String Type = "Laptop";

    Elektronik(String Nama) {
        this.Nama = Nama;
    }

    void Tampil() {
        System.out.println("Nama Brand : " + this.Nama);
    }

    void SetType(String TypeInput) {
        // Type = TypeInput; // Alternatif pemanggilan 1
        // this.Type = TypeInput; // Alternatif pemanggilan 2
        Elektronik.Type = TypeInput; // Alternatif pemanggilan 3 (Disarankan)
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Elektronik brand1 = new Elektronik("Lenovo");
        brand1.Tampil();

        Elektronik brand2 = new Elektronik("MSI");
        brand2.Tampil();

        // Menampilkan Static atau Class Variabel
        System.out.println("\n" + Elektronik.Type);
        System.out.println(brand1.Type);
        System.out.println(brand2.Type);

        // Kita coba menggantikan variabel Static-nya

        // Ganti variabel langsung pada variabelnya
        Elektronik.Type = "Monitor";
        // brand1.Type = "Monitor";
        // brand2.Type = "Monitor";
        System.out.println("\n" + Elektronik.Type);
        System.out.println(brand1.Type);
        System.out.println(brand2.Type);

        // Ganti variabel dengan method
        brand1.SetType("Motherboard");
        // brand2.SetType("Motherboard");
        System.out.println("\n" + Elektronik.Type);
        System.out.println(brand1.Type);
        System.out.println(brand2.Type);

        System.out.println("\n");
    }
}
