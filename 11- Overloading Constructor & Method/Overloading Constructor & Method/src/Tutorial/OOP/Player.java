package Tutorial.OOP;

public class Player {
    private String Name;
    private static int JumlahPlayer;

    // Overloading constructor

    // Opsi 1:
    Player(String Name) {
        Player.JumlahPlayer++;
        this.Name = Name;
    }

    // Opsi 2:
    Player() {
        Player.JumlahPlayer++;
        this.Name = "Player" + Player.JumlahPlayer;
    }

    void show() {
        System.out.println("Name  : " + this.Name);
    }

}
