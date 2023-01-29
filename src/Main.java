public class Main {
    public static void main(String[] args) {
       Basket basket=new Basket();

      basket.fiyat(600);
Bot bot =new Bot();
bot.isikliMi(true);
//burda methodun istediği parametreyi verdik, method içindeki soutu yazdırdı
DolguTopuk dolguTopuk=new DolguTopuk();
dolguTopuk.topukBoyuKac(7);
Stiletto stiletto=new Stiletto("iskarpin");
System.out.println(stiletto);
//counstructor yazınca tostringin çalışması için soutun içine almak lazım
stiletto.setTopukBoyu(5);
System.out.println("Topuk boyu "+stiletto.getTopukBoyu()+" cmdir.");
//setleyince kendimiz bir sout olusturduk
        Sandalet sandalet=new Sandalet();
        sandalet.setFiyat(200);
        sandalet.ortopedikMi(true);
        sandalet.mevsimi(EMevsim.YAZ);

        Yuruyus yuruyus=new Yuruyus();
        yuruyus.setFiyat(300);
        yuruyus.isikliMi(true);
        yuruyus.suGecirmezMi(true);

        Voleybol voleybol=new Voleybol();
        voleybol.cinsiyet(ECinsiyet.KADIN);
    }
}

