package Tutorial.OOP;

import Tutorial.Hero.HeroStrength;
import Tutorial.Hero.HeroAgility;

// Abstract akan memaksa setiap inheritance(pewaris) untuk mengimplementasikan methods atau atribut kepunyaannya. 

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        HeroStrength hero1 = new HeroStrength("Asassins Strength");
        hero1.show();

        HeroAgility hero2 = new HeroAgility("Fighter Agility");
        hero2.show();

        hero1.LevelUp();
        hero1.show();
        hero2.LevelUp();
        hero2.show();

        System.out.println("\n");
    }
}
