import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Set<BireyselMusteri>  bireyselMusteriSet;
    private static Set<KurumsalMusteri>  kurumsalMusteriSet;

    public static void main(String[] args) {
        hesapBilgileri();
	    for(BireyselMusteri bireyselMusteri : bireyselMusteriSet){
            System.out.println("Tc kimlik no : "+bireyselMusteri.getTcKimlikNo());
            System.out.println("Ad: "+bireyselMusteri.getName() + " " + bireyselMusteri.getSurname());
	        System.out.println("Bakiye : "+bireyselMusteri.getHesapBakiyesi());
            System.out.println("Musteri Numarasi : "+bireyselMusteri.getHesapBakiyesi());
            System.out.println("Adres : "+bireyselMusteri.getAdres());
            System.out.println("------------------------------------");


        }
        for(KurumsalMusteri kurumsalMusteri : kurumsalMusteriSet){
            System.out.println("Tc kimlik no : "+kurumsalMusteri.getTcKimlikNo());
            System.out.println("Ad: "+kurumsalMusteri.getName() + " " + kurumsalMusteri.getSurname());
            System.out.println("Bakiye : "+kurumsalMusteri.getHesapBakiyesi());
            System.out.println("Musteri Numarasi : "+kurumsalMusteri.getHesapBakiyesi());
            System.out.println("Sirket adi : "+kurumsalMusteri.getSirketAdi());
            System.out.println("------------------------------------");


        }
        Scanner scanner = new Scanner(System.in);
	    Boolean loop = true;
        System.out.println("Lutfen bir musteri numarasi giriniz");
	    while (loop){
            String musteriNumarasi = scanner.next();
            for(BireyselMusteri bireyselMusteri : bireyselMusteriSet){
                if(bireyselMusteri.getMusteriNumarasi().equals(musteriNumarasi)) {
                    new Para(bireyselMusteri);
                    return;
                }
            }
            for(KurumsalMusteri kurumsalMusteri : kurumsalMusteriSet){
                if(kurumsalMusteri.getMusteriNumarasi().equals(musteriNumarasi)) {
                    new Para(kurumsalMusteri);
                    return;
                }
            }
            System.out.println("Yanlis bir numara girdiniz");
            System.out.println("Lutfen bir musteri numarasi giriniz");
        }
    }



    public static void hesapBilgileri(){

        BireyselMusteri bireyselMusteri = new BireyselMusteri("111111111111","eyup","sana",1000,"111","adres1");
        BireyselMusteri bireyselMusteri2 = new BireyselMusteri("111111111113","merve","demir",1000,"112","adres2");
        BireyselMusteri bireyselMusteri3 = new BireyselMusteri("111111111115","habip","sana",1000,"113","adres3");
        BireyselMusteri bireyselMusteri4 = new BireyselMusteri("111111111117","eda","sana",1000,"114","adres4");
        BireyselMusteri bireyselMusteri5 = new BireyselMusteri("111111111119","mehmet","aksahin",1000,"115","adres5");
        bireyselMusteriSet = new HashSet<>();
        bireyselMusteriSet.add(bireyselMusteri);
        bireyselMusteriSet.add(bireyselMusteri2);
        bireyselMusteriSet.add(bireyselMusteri3);
        bireyselMusteriSet.add(bireyselMusteri4);
        bireyselMusteriSet.add(bireyselMusteri5);

        KurumsalMusteri KurumsalMusteri = new KurumsalMusteri("111111111121","eyup","sana","test",500,"116");
        KurumsalMusteri KurumsalMusteri2 = new KurumsalMusteri("111111111123","merve","demir","test2",500,"117");
        KurumsalMusteri KurumsalMusteri3 = new KurumsalMusteri("111111111125","habip","sana","test3",500,"118");
        KurumsalMusteri KurumsalMusteri4 = new KurumsalMusteri("111111111127","eda","sana","test5",500,"119");
        KurumsalMusteri KurumsalMusteri5 = new KurumsalMusteri("111111111129","mehmet","aksahin","mahmuttuncer",500,"120");
        kurumsalMusteriSet = new HashSet<>();
        kurumsalMusteriSet.add(KurumsalMusteri);
        kurumsalMusteriSet.add(KurumsalMusteri2);
        kurumsalMusteriSet.add(KurumsalMusteri3);
        kurumsalMusteriSet.add(KurumsalMusteri4);
        kurumsalMusteriSet.add(KurumsalMusteri5);



    }
}
