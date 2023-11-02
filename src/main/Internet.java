package src.main;

public class Internet {
    private int idInternet;
    private float saldoInternet;
    private String paquete;
    private String extra;
    
    public Internet(int idInternet, float saldoInternet, String paquete, String extra) {
        this.idInternet = idInternet;
        this.saldoInternet = saldoInternet;
        this.paquete = paquete;
        this.extra = extra;
    }
    
    public int getIdInternet() {
        return idInternet;
    }
    
    public float getSaldoInternet() {
      return saldoInternet;
    }

}
