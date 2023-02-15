package Tutorial.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        // Overloading pada constructor
        Player player1 = new Player("Zilong");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Yuzong");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        System.out.println();
        // Overloading pada methods
        int a = Matematika.Tambah(15, 5);
        System.out.println("Hasil : " + a);

        double b = Matematika.Tambah(5, 0.95);
        System.out.println("Hasil : " + b);

        System.out.println("\n");
    }
}
