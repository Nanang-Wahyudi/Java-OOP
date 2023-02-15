package Tutorial.OOP;

public class HeroIntelligent extends Hero {
    String type = "Intelligent";

    HeroIntelligent(String nama) {
        super(nama);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Type \t: " + this.type);
    }

    void showoff() {
        System.out.println("Saya Adalah Hero Intelligent");
    }
}
