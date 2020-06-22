package hotel;

public class Vacaciones extends Reserva {

    private int cantidadHijos;

    public Vacaciones(String nroHabitacion, int diasReservados, boolean vigente, int cantidadHijos) {
        super(nroHabitacion, diasReservados, vigente);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public String toString() {
        return "Vacaciones \n"
                + "Numero de habitacion: " + nroHabitacion + ", Dias reservados: " + diasReservados + ", Vigencia: " + vigente + ", Cant hijos: " + cantidadHijos;
    }
    
    public int getCantidadHijos(){
        return cantidadHijos;
    }
    
    public int getDiasReservados(){
        return diasReservados;
    }
    
    public boolean isVigente(){
        return vigente;
    }
    
}
