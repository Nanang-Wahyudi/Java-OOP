package Tutorial.OOP;

class data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public data() {
        this.intPublic = 0;
        this.intPrivate = 15;
    }

    // Method untuk menampilkan hasil Setter dari data doublePrivate
    void display() {
        System.out.println(" Private Double : " + this.doublePrivate);
    }

    // Getter
    public int GetIntPrivate() {
        return this.intPrivate;
    }

    // Setter
    public void SetDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

// Contoh Penerapan Getter & Setter pada satu variabel
class lingkaran {
    private double diameter;

    lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // Setter
    public void SetJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // Getter
    public double GetJari2() {
        return this.diameter / 2;
    }

    // Getter
    public double GetLuas() {
        return 3.14 * Math.pow(diameter, 2) / 4;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        data objectData = new data();

        // Read & Write menggunakan Public
        objectData.intPublic = 10; // Write
        System.out.println("\n Public \t: " + objectData.intPublic); // Read

        // Read only Private Menggunakan Getter
        int tampilDataPrivate = objectData.GetIntPrivate();
        System.out.println(" Private Int \t: " + tampilDataPrivate);

        // Write only Private menggunakan Setter
        objectData.SetDoublePrivate(0.15);
        // Jika kita print langsung maka data akan error, oleh karena itu kita harus
        // membuat sebuah method didalam class data untuk menampilkan isi data
        objectData.display();

        // Gabungkan Read & Write dengan Getter & Setter
        lingkaran objectLingkaran = new lingkaran(5);
        System.out.println("\n Jari-Jari \t: " + objectLingkaran.GetJari2());
        objectLingkaran.SetJari2(14);
        System.out.println(" Jari-Jari \t: " + objectLingkaran.GetJari2());
        System.out.println(" Luas \t\t: " + String.format("%.3f", objectLingkaran.GetLuas()) + "\n");
    }
}
