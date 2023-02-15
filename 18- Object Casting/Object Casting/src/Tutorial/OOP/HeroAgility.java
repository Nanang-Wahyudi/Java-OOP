package Tutorial.OOP;

public class HeroAgility extends Hero {
    String type;

    public HeroAgility(String nama, int health) {
        super(nama, health);
        this.type = "Agility";
    }

    public void show() {
        System.out.println(this.getNama() + " Adalah Hero " + this.type);
    }
}
