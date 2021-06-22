import java.util.Scanner;

public class Para {

    private  BireyselMusteri bireyselMusteri;
    private  KurumsalMusteri kurumsalMusteri;

    public Para(BireyselMusteri bireyselMusteri) {
        this.bireyselMusteri = bireyselMusteri;
        System.out.println(" Para yatirma islemi icin 1 e basiniz para cekme icin 2 ye basiniz");
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        while (loop){
            int number = scanner.nextInt();
            if(number == 1) {
                paraYatirma();
                loop =false;
            }
            else if(number == 2){
                paraCekme();
                loop =false;
            }
            else {
                System.out.println(" Yanlis deger girdiniz");
                System.out.println(" Para yatirma islemi icin 1 e basiniz para cekme icin 2 ye basiniz");
            }
        }
    }

    public Para(KurumsalMusteri kurumsalMusteri) {
        this.kurumsalMusteri = kurumsalMusteri;
        System.out.println(" Para yatirma islemi icin 1 e basiniz para cekme icin 2 ye basiniz");
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        while (loop){
            int number = scanner.nextInt();
            if(number == 1) {
                paraYatirmaKurumsalMusteri();
                loop =false;
            }
            else if(number == 2){
                paraCekmeKurumsalMusteri();
                loop =false;
            }
            else {
                System.out.println(" Yanlis deger girdiniz");
                System.out.println(" Para yatirma islemi icin 1 e basiniz para cekme icin 2 ye basiniz");
            }
        }
    }


    public void paraCekme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Param miktarini giriniz ");
        double para = scanner.nextDouble();
        bireyselMusteri.setHesapBakiyesi(bireyselMusteri.getHesapBakiyesi() - para);

    }

    public void paraYatirma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Param miktarini giriniz ");
        double para = scanner.nextDouble();
        bireyselMusteri.setHesapBakiyesi(bireyselMusteri.getHesapBakiyesi() + para);

    }

    public void paraCekmeKurumsalMusteri(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Param miktarini giriniz ");
        double para = scanner.nextDouble();
        kurumsalMusteri.setHesapBakiyesi(kurumsalMusteri.getHesapBakiyesi() - para);

    }

    public void paraYatirmaKurumsalMusteri(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Param miktarini giriniz ");
        double para = scanner.nextDouble();
        kurumsalMusteri.setHesapBakiyesi(kurumsalMusteri.getHesapBakiyesi() + para);

    }

    public BireyselMusteri getBireyselMusteri() {
        return bireyselMusteri;
    }

    public void setBireyselMusteri(BireyselMusteri bireyselMusteri) {
        this.bireyselMusteri = bireyselMusteri;
    }
}
