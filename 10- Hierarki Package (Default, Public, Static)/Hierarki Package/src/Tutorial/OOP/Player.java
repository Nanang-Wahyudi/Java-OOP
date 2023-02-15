package Tutorial.OOP;

import Tutorial.Terminal.Console;

// visibility default, artinya class hanya bisa diakses didalam package yang sama
class Player {
    private String Name;

    Player(String Name) {
        this.Name = Name;
    }

    void show() {
        // System.out.println("PLayer Name : " + this.Name);
        // Test penggunaan method Console
        Console.log("Player Name : " + this.Name);
    }

    String getName() {
        return this.Name;
    }
}
