package Tutorial.OOP;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void setName(String new_name) {
        this.name = new_name;
    }

    void display() {
        System.out.println("Name : " + this.name + "\t" + " Health : " + this.health);
    }
}