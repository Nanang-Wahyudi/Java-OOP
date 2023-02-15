package Tutorial.OOP;

// keyword import untuk package eksternal
import Tutorial.Terminal.Console;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Player player1 = new Player("Naruto");
        Player player2 = new Player("Sunade");
        Player player3 = new Player("Saitama");

        player1.show();
        player2.show();
        player3.show();

        // ini method dari package eksternal
        System.out.println();
        Console.log("Selamat Malam");
        Console.log("Selamat Belajar");

        System.out.println("\n");
    }
}
