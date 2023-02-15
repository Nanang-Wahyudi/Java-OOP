package Tutorial.OOP;

class Player {
    private String Name;

    Player(String Name) {
        this.Name = Name;
    }

    void setName(String NameIn) {
        this.Name = NameIn;
    }

    void show() {
        System.out.println("Player Name : " + this.Name);
    }
}
