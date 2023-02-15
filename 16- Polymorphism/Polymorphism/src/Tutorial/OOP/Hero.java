package Tutorial.OOP;

public class Hero {
    String nama;

    Hero(String nama) {
        this.nama = nama;
    }

    void show() {
        System.out.println("\nNama \t: " + this.nama);
    }

    void attack(Hero enemy) {
        System.out.println("Menyerang");
    }
}
