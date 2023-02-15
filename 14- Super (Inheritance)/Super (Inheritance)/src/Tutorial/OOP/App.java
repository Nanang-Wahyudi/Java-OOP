package Tutorial.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero();
        HeroStrength hero2 = new HeroStrength();

        hero1.show();
        hero2.show();
        hero2.showSuper();

        System.out.println("\n");
    }
}
