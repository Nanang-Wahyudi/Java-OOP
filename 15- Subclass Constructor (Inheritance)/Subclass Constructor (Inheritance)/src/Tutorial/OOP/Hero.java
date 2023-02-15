package Tutorial.OOP;

// Superclass
public class Hero {

    String nama;
    int health;

    // Constructor
    Hero(String nama, int health) {
        this.nama = nama;
        this.health = health;
    }

    Hero(String nama) {
        this.nama = nama;
    }

    // Methods
    void show() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
    }

    void show2() {
        System.out.println("Nama\t: " + this.nama);
    }
}
