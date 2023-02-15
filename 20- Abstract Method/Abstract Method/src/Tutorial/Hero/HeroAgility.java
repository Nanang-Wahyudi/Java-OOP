package Tutorial.Hero;

// Inheritance dari abstract Hero
public class HeroAgility extends Hero {

    public HeroAgility(String nama) {
        super(nama);
    }

    public void LevelUp() {
        this.setLevel(4);
    }
}
