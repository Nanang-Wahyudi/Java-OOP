package Tutorial.OOP;

// Meng-import class Console
import Tutorial.Terminal.Console;

// Meng-import static method dari Console
import static Tutorial.Terminal.Console.log;

// class selain public tidak bisa diimport
// import Tutorial.Terminal.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Player player1 = new Player("Kadita");
        player1.show();

        System.out.println();
        Console.log(player1.getName());
        log(player1.getName());

        System.out.println("\n");
    }
}

// Ini tidak akan bisa, membuat class dengan private tidak diperbolehkan
// private class Test {

// }
