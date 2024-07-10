package UAS_1;

public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private int jumlahHalaman;
    private double harga;

    public Buku() {
        System.out.println("Object buku sudah dibuat, Constructor dijalankan");
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void Baca() {
        System.out.println("method membaca isi buku " + judul);
    }

    public void MencekJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
        System.out.println("Jumlah halaman buku " + judul + " adalah " + jumlahHalaman);
    }

    public void MenilaiBuku() {
        System.out.println("method untuk menilai buku");
    }

    public void MelihatHarga() {
        System.out.println("harga buku: " + harga);
    }

    public void naikkanHarga() {
        harga = harga + 50000;
    }

    public void naikkanHarga(int pajak) {
        harga = harga + pajak;
    }
}
