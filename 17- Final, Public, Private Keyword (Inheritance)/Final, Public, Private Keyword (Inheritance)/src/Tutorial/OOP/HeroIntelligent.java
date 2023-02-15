package Tutorial.OOP;

public class HeroIntelligent extends Hero {

    HeroIntelligent(String nama, String type, int health) {
        super(nama, type, health);
    }

    // Variabel health tidak bisa diakses karena private.
    // Pemilihan Final, Public, Private, harus mengikuti keyword dari
    // <- Superclass-nya.
    public void show() {
        System.out.println(this.type + " " + this.nama + " Mempunyai " + this.getHealth() + " Health");
    }

    // Methods dengan keyword final tidak bisa di override, namun methods-nya tetap
    // <- diwariskan.
    // final void setHealth(int newHealth) {
    // super.setHealth(newHealth);
    // }

    // Method final setHealth ternyata bisa di overload.
    void setHealth(String newHealth) {
        super.setHealth(newHealth);
    }
}
