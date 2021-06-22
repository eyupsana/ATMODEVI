public class KurumsalMusteri {

    private String tcKimlikNo;
    private String name ;
    private String surname;
    private String sirketAdi;
    private double hesapBakiyesi;
    private String musteriNumarasi;


    public KurumsalMusteri(String tcKimlikNo, String name, String surname, String sirketAdi, double hesapBakiyesi, String musteriNumarasi) {
        this.tcKimlikNo = tcKimlikNo;
        this.name = name;
        this.surname = surname;
        this.sirketAdi = sirketAdi;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNumarasi = musteriNumarasi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(String musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
}
