public abstract class Ayakkabı implements IAyakkabıOzellikleri{
    private ECinsiyet cinsiyet;

    private String Marka;

    private  int beden;

    private String model;

    private String materyal;

    private String renk;

    private int fiyat;
    private boolean ortopedik;
    private boolean suGecirmez;

    private int ortopedikFiyat=200;

    private int suGecirmezFiyat=300;



    public ECinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(ECinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public int getBeden() {
        return beden;
    }

    public void setBeden(int beden) {
        this.beden = beden;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMateryal() {
        return materyal;
    }

    public void setMateryal(String materyal) {
        this.materyal = materyal;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int setFiyat(int fiyat) {
        this.fiyat = fiyat;
        return fiyat;
    }

    public boolean isOrtopedik() {
        return ortopedik;
    }

    public void setOrtopedik(boolean ortopedik) {
        this.ortopedik = ortopedik;
    }

    public boolean isSuGecirmez() {
        return suGecirmez;
    }

    public void setSuGecirmez(boolean suGecirmez) {
        this.suGecirmez = suGecirmez;
    }

    public int getOrtopedikFiyat() {
        return ortopedikFiyat;
    }

    public void setOrtopedikFiyat(int ortopedikFiyat) {
        this.ortopedikFiyat = ortopedikFiyat;
    }

    public int getSuGecirmezFiyat() {
        return suGecirmezFiyat;
    }

    public void setSuGecirmezFiyat(int suGecirmezFiyat) {
        this.suGecirmezFiyat = suGecirmezFiyat;
    }
}
