package posttest2;

class Pasien {
    private String id;
    private String nama;
    private int umur;
    private String ruang;

    public Pasien(String id, String nama, int umur, String ruang) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.ruang = ruang;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Umur: " + umur + ", Ruang: " + ruang;
    }
}
