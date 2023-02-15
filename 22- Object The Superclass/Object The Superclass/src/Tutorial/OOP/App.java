package Tutorial.OOP;

// Java mempunyai Object bawaannya, yang biasa disebut Superclass dari segala Superclass.

public class App {
    public static void main(String[] args) {
        System.out.println("\n");
        Hero hero1 = new Hero("ucup");
        hero1.display();
        System.out.println();

        // kita sebut class Object sebagai superclass
        Object hero2 = hero1;

        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString();
        System.out.println(hero1_str);
        System.out.println(hero2_str + "\n");

        // salah satu method dari class Object adalah equals
        System.out.println(hero1.equals(hero2) + "\n");

        // contoh dari equals
        Hero hero3 = new Hero("Otong");
        Hero hero4 = new Hero("Otong");

        System.out.println(hero3.equals(hero4) + "\n");

        // override equals di class Hero
        System.out.println(hero3.equals(hero4) + "\n");
        System.out.println(hero3.equals(hero1) + "\n");

        System.out.println("\n");
    }
}