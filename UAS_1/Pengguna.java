package UAS_1;

public class Pengguna {
    private int id;
    private String username;
    private String password;

    public Pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    public void login() {
        System.out.println("Ini Method Untuk Login");
    }

    public void lupaPassword() {
        System.out.println("Ini Method Untuk Lupa Password");
    }

    public void daftar() {
        System.out.println("Ini Method Untuk Daftar");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void hapus() {
        System.out.println("DELETE FROM Pengguna");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM Pengguna WHERE id =" + id);
    }

    public void hapus(String username) {
        System.out.println("DELETE FROM Pengguna WHERE username =" + username);
    }

    public void login(String tokenGoogle) {
        System.out.println("Ini Method Untuk Login Dengan Google");
    }
}
