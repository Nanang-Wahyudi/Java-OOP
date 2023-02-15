package Tutorial.OOP;

// this.name akan mengakses atribut name kalau ada di kelas ini.
// jika tidak ada maka akan mengkases atribut name dari superclass.

// super.name akan selalu mengakses atribut superclass
public class HeroStrength extends Hero {

    String Name = "Hero Strength";

    void show() {
        System.out.println("Ini Adalah Class " + this.Name);
        this.dummyMethod();
    }

    void showSuper() {
        System.out.println("\nIni Adalah Class " + super.Name);
        super.dummyMethod();
    }

    void dummyMethod() {
        System.out.println("Ini Adalah Method Di Subclass");
    }

}
