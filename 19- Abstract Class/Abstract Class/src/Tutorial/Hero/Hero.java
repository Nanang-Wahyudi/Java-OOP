package Tutorial.Hero;

// Abstract Class
public abstract class Hero {
    private String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    public void show() {
        System.out.println("Saya Adalah " + this.nama);
    }

}
