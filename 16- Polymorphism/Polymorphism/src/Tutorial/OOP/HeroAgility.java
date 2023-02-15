package Tutorial.OOP;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String nama) {
        super(nama);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Type \t: " + this.type);
    }
}
