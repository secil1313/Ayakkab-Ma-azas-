import java.util.ArrayList;

public class AyakkabıMagazası {
    public static void main(String[] args) {
        ayakkabıEkle();
    }
   public static int stok;
    public static void ayakkabıEkle(){
        ArrayList<Ayakkabı> ayakkabıArrayList=new ArrayList<>();
        Stiletto stiletto=new Stiletto("iskarpin");
        ayakkabıArrayList.add(stiletto);
        Bot bot=new Bot("AskerBotu");
        ayakkabıArrayList.add(bot);
        for(Ayakkabı item:ayakkabıArrayList){
            System.out.println(item);
            stok++;
        }
        System.out.println(stok);

    }
}
//Not:en aşağı classta constructor ya da tostring olusturmak istiyorsak sırasıyla tüm abstractlarda olusturmus olmamız gerekir.
//for ile liste döndürürken düzgün bir çıktı için oluşturduğumuz nesnelerin sınıflarının içinde tostring yazmalı