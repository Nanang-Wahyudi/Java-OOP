package Tutorial.Hero;

// Abstract Class
public abstract class Hero {
    private String nama;
    private int level;

    public Hero(String nama) {
        this.nama = nama;
        this.level = 1;
    }

    public void show() {
        System.out.println("\nSaya Adalah " + this.nama);
        System.out.println("Level " + this.nama + " Adalah " + this.level);
    }

    // Abstract Method
    public abstract void LevelUp();

    // Setter
    public void setLevel(int level) {
        this.level += level;
    }

}
