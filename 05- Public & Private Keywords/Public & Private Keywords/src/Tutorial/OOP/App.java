package Tutorial.OOP;

class Player {
    String Nama; // Default, Dia akan bisa dibaca dan ditulis didalam dan diluar class
    public int Exp; // Public, Dia akan bisa dibaca dan ditulis didalam dan diluar class
    private int Health; // Private, Dia hanya bisa dibaca dan ditulis didalam class-nya saja

    Player(String Nama, int Exp, int Health) {
        this.Nama = Nama;
        this.Exp = Exp;
        this.Health = Health;
    }

    // Default
    void Tampil() {
        tambahExp(); // Contoh mengakses private method
        System.out.println("\nNama\t : " + this.Nama);
        System.out.println("Exp\t : " + this.Exp);
        System.out.println("Health\t : " + this.Health + "\n"); // Membaca tapi didalam class
    }

    // Public
    public void ubahNama(String namaBaru) {
        this.Nama = namaBaru;
    }

    // Private
    private void tambahExp() {
        this.Exp += 100;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Player player1 = new Player("Nanang", 50, 95);

        // Default
        System.out.println("\n" + player1.Nama); // Membaca data
        player1.Nama = "Tejo"; // Menulis data
        System.out.println(player1.Nama); // Membaca data

        // Public
        System.out.println("\n" + player1.Exp); // Membaca data
        player1.Exp = 75; // Menulis data
        System.out.println(player1.Exp); // Membaca data

        // Private (Tidak bisa diakses)
        // System.out.println("\n" + player1.Health);
        // player1.Health = 100;
        // System.out.println(player1.Health);

        // Methods

        // Default
        player1.Tampil();

        // Public
        player1.ubahNama("Surti");
        player1.Tampil();

        // Private (Tidak bisa diakses)
        // player1.tambahExp();

    }
}
