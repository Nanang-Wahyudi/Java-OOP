package Tutorial.OOP;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero("Zilong", 100);
        Hero hero2 = new Hero("Alucard", 78);
        HeroAgility hero3 = new HeroAgility("Miya", 97);
        HeroStrength hero4 = new HeroStrength("Layla", 59);

        // Array sederhana
        System.out.println("\nArray\n");
        Hero[] kumpulanHero = new Hero[3];

        // masukan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        // kumpulanHero[3] = hero4; // karena array fiks yang dibuat maks 3.

        for (Hero hero : kumpulanHero) {
            hero.display();
        }
        System.out.println();

        // Array List
        ArrayList<Hero> listHero = new ArrayList<Hero>();

        // masukan anggota
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.add(hero4);

        System.out.println("\nArrayList\n");
        for (Hero hero : listHero) {
            hero.display();
        }
        System.out.println();

        // referens
        hero3.setName("Eudora");

        System.out.println("\nArrayList\n");
        for (Hero hero : listHero) {
            hero.display();
        }

        System.out.println("\nArray\n");
        for (Hero hero : kumpulanHero) {
            hero.display();
        }

        System.out.println("\n");
    }
}
