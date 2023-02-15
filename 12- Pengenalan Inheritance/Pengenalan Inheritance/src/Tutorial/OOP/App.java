package Tutorial.OOP;

// Inheritance(pewarisan) memiliki hubunngan is-a

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero();
        hero1.Name = "Kadita";
        hero1.show();

        HeroStrength hero2 = new HeroStrength();
        hero2.Name = "Zilong";
        hero2.show();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.Name = "Aulus";
        hero3.show();

        System.out.println("\n");
    }
}
