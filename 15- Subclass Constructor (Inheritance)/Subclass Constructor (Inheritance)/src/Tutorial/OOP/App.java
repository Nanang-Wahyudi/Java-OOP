package Tutorial.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Hero hero1 = new Hero("Esmeralda", 80);
        hero1.show();

        HeroStrength hero2 = new HeroStrength("Hayabusa", 95);
        hero2.show();

        System.out.println();
        Hero hero3 = new Hero("Lapu-Lapu");
        hero3.show2();

        HeroStrength hero4 = new HeroStrength("Baxia");
        hero4.show2();

        System.out.println("\n");
    }
}
