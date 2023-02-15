package Tutorial.Hero;

public class HeroStrength extends Hero {
    private int speedAttack;

    public HeroStrength(String nama, int speedAttack) {
        super(nama);
        this.speedAttack = speedAttack;
    }

    public void show() {
        System.out.println("\nNama \t\t: " + this.getNama());
        System.out.println("Speed Attack \t: " + this.speedAttack);
    }

    public void Win() {
        this.setNama(getNama() + " Is a Winner");
    }
}
