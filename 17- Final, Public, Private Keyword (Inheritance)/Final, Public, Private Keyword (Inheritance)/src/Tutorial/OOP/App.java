package Tutorial.OOP;

// visibility
// 1. Public: Jika method atau attribute dalam Superclass public, 
//    maka subclass tidak boleh mengurangi keywordnya.
// 2. Private: Jika method atau attribute dalam Superclass private,
//    maka subclass pun tidak dapat mengakses.
// 3. Final: method atau attribute dengan final keyword akan diwariskan,
//    tetapi tidak bisa dioverride, namun dalam class yang sama bisa dioverload.

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero("Gatotkaca", "Superclass", 80);
        HeroIntelligent hero2 = new HeroIntelligent("Lolita", "Subclass", 65);

        hero1.show();
        hero2.show();

        System.out.println("\n" + hero1.getHealth());
        System.out.println(hero2.getHealth());

        System.out.println();
        hero1.setHealth(75);
        hero2.setHealth(48);
        hero1.show();
        hero2.show();

        System.out.println();
        hero1.setHealth("Reset");
        hero1.show();
        hero2.setHealth("Reset");
        hero2.show();

        System.out.println("\n");
    }
}
