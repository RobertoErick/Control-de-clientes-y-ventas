package src.main;

public class Cable {
    private int idCable;
    private float saldoCable;
    private String paquete;
    private String extra;
    
    public Cable(int idCable, float saldoCable, String paquete, String extra) {
        this.idCable = idCable;
        this.saldoCable = saldoCable;
        this.paquete = paquete;
        this.extra = extra;
    }
    
    public int getIdCable() {
        return idCable;
    }
    
    public float getSaldoCable() {
        return saldoCable;
    }

    public String getPaquete() {
        return paquete;
    }

    public String getExtra() {
        return extra;
    }
}
