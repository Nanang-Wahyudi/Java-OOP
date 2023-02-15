package Tutorial.OOP;

// import Tutorial.Hero.Hero;
import Tutorial.Hero.HeroStrength;
import Tutorial.Hero.HeroAgility;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        // Membuat object dari class non-abstract
        HeroStrength hero1 = new HeroStrength("Asassins Strength");
        hero1.show();

        HeroAgility hero2 = new HeroAgility("Fighter Agility");
        hero2.show();

        // Membuat object dari class abstract. Tidak Bisa
        // Hero hero3 = new Hero("Jungler Abstract");
        // hero3.show();

        System.out.println("\n");
    }
}
