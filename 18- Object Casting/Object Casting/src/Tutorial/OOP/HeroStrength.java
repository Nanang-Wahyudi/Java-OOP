package Tutorial.OOP;

public class HeroStrength extends Hero {
    public String type;

    public HeroStrength(String nama, int health) {
        super(nama, health);
        this.type = "Strength";
    }

    public void show() {
        System.out.println(this.getNama() + " Adalah Hero " + this.type);
    }

    public void castMagic() {
        System.out.println("Hero " + this.getNama() + " Mengeluarkan Api");
    }
}
