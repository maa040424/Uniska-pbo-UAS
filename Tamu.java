package UAS_1;

public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }
}
