package Tutorial.Terminal;

// Visibility public, artinya class bisa diakses disemua file, dengan import package
public class Console {
    public static void log(String Pesan) {
        System.out.println(Pesan);
    }

}

// Visibility default, artinya ini hanya bisa diakses didalam package
// Tutorial.Terminal
class Test {
    public static void log(String Pesan) {
        System.out.println(Pesan);
    }
}
