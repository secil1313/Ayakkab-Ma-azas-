public class Sandalet extends Mevsimlik{
    @Override
    public boolean ortopedikMi(boolean o) {
        if(o==true){
            int fiyat=setFiyat(getOrtopedikFiyat()+getFiyat());
            System.out.println("Ayakkabının fiyatı "+fiyat+"dır.");
        }else{
            System.out.println("Ayakkabının fiyatı "+getFiyat()+"dır.");

        }
        return o;
    }

    @Override
    public void suGecirmezMi(boolean s) {
        if(s==true){
            System.out.println("Ayakkabının fiyatı "+setFiyat(getSuGecirmezFiyat()+getFiyat())+"dır.");
        }else{
            System.out.println("Ayakkabının fiyatı "+getFiyat()+"dır.");
        }
    }

    @Override
    public void isikliMi(boolean i) {
        if(i==true) {
            System.out.println("Bu ayakkabı ışıklı bir ayakkabıdır.");
        }else{
            System.out.println("Bu ayakkabı ışıksızdır");
        }
    }

    @Override
    public void cinsiyet(Enum c) {
        System.out.println("Bu ayakkabı "+c+" bireyler içindir.");
    }

    @Override
    public void marka(String m) {
        System.out.println("Ayakabı "+m+" marka seçilmiştir.");
    }

    @Override
    public void beden(int b) {
        System.out.println("Ayakkabı "+b+" numaradır.");
    }

    @Override
    public void model(String m) {
        System.out.println("Ayakkabının modeli "+m+"dır.");
    }

    @Override
    public void materyal(String m) {
        System.out.println("Ayakkabının materyali "+m+"dir.");
    }

    @Override
    public void fiyat(int f) {
        System.out.println("Fiyatı "+f+"dır");
    }

    @Override
    public void renk(String r) {
        System.out.println("Rengi "+r+"dir.");
    }

    @Override
    public void mevsimi(EMevsim mevsim) {
        System.out.println("Ayakkabının mevsimi "+mevsim+"dır.");
    }
}
