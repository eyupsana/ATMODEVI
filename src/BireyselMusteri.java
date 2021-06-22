
public class BireyselMusteri {


    private String tcKimlikNo;
    private String name ;
    private String surname;
    private double hesapBakiyesi;
    private String musteriNumarasi;
    private String adres;


    public BireyselMusteri(String tcKimlikNo, String name, String surname, double hesapBakiyesi, String musteriNumarasi, String adres) {
        this.tcKimlikNo = tcKimlikNo;
        this.name = name;
        this.surname = surname;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNumarasi = musteriNumarasi;
        this.adres = adres;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
