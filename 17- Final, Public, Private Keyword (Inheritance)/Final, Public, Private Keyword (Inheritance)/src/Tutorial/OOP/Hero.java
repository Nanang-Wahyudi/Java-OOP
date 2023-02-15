package Tutorial.OOP;

public class Hero {
    public String nama;
    public String type;
    private int health;

    Hero(String nama, String type, int health) {
        this.nama = nama;
        this.health = health;
        this.type = type;
    }

    public void show() {
        System.out.println(this.type + " " + this.nama + " Mempunyai " + this.health + " Health");
    }

    // Getter
    public int getHealth() {
        return this.health;
    }

    // Setter
    final void setHealth(int newHealth) {
        this.health = newHealth;
    }

    // Kita coba Overload.
    // Ternyata method final setHealth bisa di Overload.
    void setHealth(String mode) {
        if (mode.equals("Reset")) {
            this.health = 100;
        }
        System.out.println("\nHealth " + this.type + " " + this.nama + " Berhasil Direset Menjadi " + this.getHealth());
    }
}
