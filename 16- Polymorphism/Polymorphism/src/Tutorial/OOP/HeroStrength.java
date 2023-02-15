package Tutorial.OOP;

public class HeroStrength extends Hero {
    String type = "Strength";

    HeroStrength(String nama) {
        super(nama);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Type \t: " + this.type);
    }
}
