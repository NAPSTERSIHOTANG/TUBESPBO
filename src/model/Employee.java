package model;

public class Employee {
    private int id_karawan;
    private String nama;
    private String umur;
    private String jabatan;
    private String no_telepon;

    public Employee(int id_karawan, String nama, String umur, String jabatan, String no_telepon) {
        this.id_karawan = id_karawan;
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.no_telepon = no_telepon;
    }

    public Employee(String nama, String umur, String jabatan, String no_telepon) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.no_telepon = no_telepon;
    }

    public int getId_karawan() {
        return id_karawan;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setId_karawan(int id_karawan) {
        this.id_karawan = id_karawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }
}
