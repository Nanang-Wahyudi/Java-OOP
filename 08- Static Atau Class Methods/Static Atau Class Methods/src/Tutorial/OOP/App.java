package Tutorial.OOP;

import java.util.ArrayList;

class Player {
    private String Name;
    private static int JumlahPlayer;
    private static ArrayList<String> NameList = new ArrayList<String>();

    Player(String Name) {
        this.Name = Name;
        Player.JumlahPlayer++;
        Player.NameList.add(this.Name);
    }

    void Tampil() {
        System.out.println("Nama Player \t: " + this.Name);
    }

    // Static Method
    static void TampilJumlahPlayer() {
        System.out.println("\nJumlah Player \t: " + Player.JumlahPlayer);
    }

    static ArrayList<String> AmbilName() {
        return Player.NameList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Player player1 = new Player("Amang");
        Player player2 = new Player("Cikiwir");
        Player player3 = new Player("Bagong");
        Player player4 = new Player("Timun Mas");

        // player1.Tampil();
        // player2.Tampil();

        // Membuat list nama player dengan ArrayList
        System.out.println("\n List Player : \n ------------- \n" + Player.AmbilName());

        Player.TampilJumlahPlayer();

        System.out.println("\n");
    }
}
