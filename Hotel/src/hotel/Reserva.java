package hotel;

public abstract class Reserva {
    protected String nroHabitacion;
    protected int diasReservados;
    protected boolean vigente;

    @Override
    public abstract String toString();

    
    
    public Reserva(String nroHabitacion, int diasReservados, boolean vigente) {
        this.nroHabitacion = nroHabitacion;
        this.diasReservados = diasReservados;
        this.vigente = vigente;
    }
    
    
}
