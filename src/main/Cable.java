package src.main;

public class Cable {
    private int idCable;
    private float saldoCable;
    
    public Cable(int idCable, float saldoCable) {
        this.idCable = idCable;
        this.saldoCable = saldoCable;
    }
    
    public int getIdCable() {
        return idCable;
    }
    
    public float getSaldoCable() {
        return saldoCable;
    }
}
