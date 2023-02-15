package Tutorial.OOP;

public class Hero {
    private String nama;
    private int health;

    Hero(String nama, int health) {
        this.nama = nama;
        this.health = health;
    }

    // Getter
    public int getHealth() {
        return this.health;
    }

    public String getNama() {
        return this.nama;
    }

    // Setter
    public void setHealth(int health) {
        this.health = health;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method umum
    public void show() {
        System.out.println(this.nama + " Adalah Reguler Hero");
    }
}
