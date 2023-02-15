package Tutorial.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero();
        hero1.Name = "Change";
        // hero1.PowerDefence = 80; // Error karena variabel tidak ada pada class Hero
        hero1.show();

        HeroStength hero2 = new HeroStength();
        hero2.Name = "Nana";
        hero2.PowerDefence = 95;
        hero2.show();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.Name = "Layla";
        System.out.println();
        hero3.show();

        System.out.println("\n");
    }
}
