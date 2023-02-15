package Tutorial.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero("Hayabusa");
        hero1.show();
        HeroStrength hero2 = new HeroStrength("Lancelot");
        hero2.show();

        // Polymorphic
        Hero hero3 = new HeroAgility("Roger");
        hero3.show();
        // HeroAgility hero4 = new Hero("Saber"); // Tidak bisa karena class HeroAgility
        // <- bukan Superclass dari Hero.

        HeroIntelligent hero4 = new HeroIntelligent("Clint");
        hero4.show();
        hero4.showoff();

        // kita bisa membuat array list
        System.out.println("\n");
        Hero[] KumpulanHero = new Hero[4];
        KumpulanHero[0] = hero1;
        KumpulanHero[1] = hero2;
        KumpulanHero[2] = hero3;
        KumpulanHero[3] = hero4;

        KumpulanHero[0].show();
        KumpulanHero[1].show();
        KumpulanHero[2].show();
        KumpulanHero[3].show();

        // Method calls
        // KumpulanHero[3].showoff(); // Tidak bisa karena method tidak ada didalam
        // <- class hero
        System.out.println();
        hero4.showoff(); // ini baru bisa

        System.out.println();
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);

        System.out.println("\n");
    }
}
