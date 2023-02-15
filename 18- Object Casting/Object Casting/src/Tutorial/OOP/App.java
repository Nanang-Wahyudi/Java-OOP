package Tutorial.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        HeroStrength hero1 = new HeroStrength("Vexana", 75);
        hero1.show();
        // hero1.castMagic(); // Bisa dijalankan sebelum dicasting

        // Up Casting (Subclass --> Superclass)
        Hero upHero = (Hero) hero1;
        upHero.show();

        // Ketika melakukan casting ada atribut dan methods yang hilang dari tempat
        // <- asalnya. Contoh:
        // System.out.println(upHero.type); // variabel dari HeroStrength tidak bisa
        // upHero.castMagic(); // method dari HeroStrength tidak bisa

        System.out.println();
        Hero hero2 = new Hero("Tigreal", 57);
        hero2.show();

        // Down Casting (Superclass --> Subclass) Tidak bisa
        // HeroAgility downHero = (HeroAgility) hero2;
        // downHero.show();

        // Sudah kita coba dari HeroStrength ke Hero, Sekarang kita kembalikan lagi
        // <- kebentuk awalnya.
        System.out.println();
        HeroStrength backHero = (HeroStrength) upHero;
        backHero.show();
        System.out.println(backHero.type); // variabel sudah bisa dipake lagi
        backHero.castMagic(); // method sudah bisa dipake lagi

        System.out.println("\n");
    }
}
