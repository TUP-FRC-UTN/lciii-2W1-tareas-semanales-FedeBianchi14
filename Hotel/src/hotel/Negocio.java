package hotel;


public class Negocio extends Reserva {
    private boolean conferencia;
    
    public Negocio(String nroReserva, int diasReservados, boolean vigente, boolean conferencia){
        super(nroReserva, diasReservados, vigente);
        this.conferencia = conferencia;
    }

    @Override
    public String toString() {
        return "Negocio \n"
                + "Numero de habitacion: " + nroHabitacion + ", Dias reservados: " + diasReservados + ", Vigencia: " + vigente + ", Conferencia: " + conferencia;
    }
    
    public int getDiasReservados(){
        return diasReservados;
    }
    
    public boolean isVigente(){
        return vigente;
    }
   
    public boolean IsConferencia() {
        return conferencia;
    }
}
