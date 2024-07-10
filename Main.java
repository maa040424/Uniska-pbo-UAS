package UAS_1;
//untuk Main.java saya memodifikasi sedikit gak sesuai ketentuan soal 
public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();
        Review review = new Review("Adam ", "mengisahkan seorang pemuda Fang Yuan yang kembali ke masalalu tapi tetap berjalan pada pendiriannya yang berada pada jalan Demonic", 5);

        pengguna.login();
        pengguna.daftar();

        buku.setJudul("Reverend Insanity"); //FYI ini komik/novelnya  sampai kena banned di China karna benar benar ngeri wkwkwkwk
        buku.setPengarang("Gu Zhen Ren");
        buku.setHarga(50000);
        buku.MencekJumlahHalaman(15200);
        buku.Baca();
        buku.MelihatHarga();

        review.tampilkanReview();
    }
}
