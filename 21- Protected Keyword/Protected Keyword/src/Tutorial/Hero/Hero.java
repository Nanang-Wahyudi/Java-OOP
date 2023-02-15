package Tutorial.Hero;

// Protected --> Methods atau atribut dengan keyword protected hanya bisa diakses oleh subclass-nya saja.

public abstract class Hero {
    private String nama;
    // protected String name; // Tidak disarankan, Karena menyalahi encapsulasi

    public Hero(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return this.nama;
    }

    // Setter
    protected void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void show();
}
