package Tutorial.Hero;

// Inheritance dari abstract Hero
public class HeroStrength extends Hero {

    public HeroStrength(String nama) {
        super(nama);
    }

    public void LevelUp() {
        this.setLevel(6);
    }
}
