package Tutorial.OOP;

public class HeroStength extends Hero {

    int PowerDefence;

    void show() {
        System.out.println("\nHero Strength");
        System.out.println("---------------");
        System.out.println("Name \t\t: " + this.Name);
        System.out.println("Power Defence \t: " + this.PowerDefence);
    }
}
