package Tutorial.OOP;

import Tutorial.Hero.HeroStrength;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        HeroStrength hero1 = new HeroStrength("Hayabusa", 85);
        hero1.show();

        // hero1.getNama(); // Masih bisa dilakukan karena public.
        // hero1.setNama("Lapu-Lapu"); // tidak bisa dilakukan karena tidak satu
        // <- package.

        hero1.Win();
        hero1.show();

        System.out.println("\n");
    }
}
