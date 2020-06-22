package inmobiliaria_gui;

public class Casa extends Propiedad {
    
    private boolean poseeGaraje;

    public Casa(String direccion, int cantidadHabitaciones, int precioBaseAlquiler, boolean usoComercial, int cantidadInquilinos, boolean poseeGaraje) {
        super(direccion, cantidadHabitaciones, precioBaseAlquiler, usoComercial, cantidadInquilinos);
        this.poseeGaraje = poseeGaraje;
    }

 @Override
    public String toString() {
        return "Negocio \n"
                + "Direccion: " + direccion + ", Cantidad Habitaciones: " + cantidadHabitaciones + 
                ", Precio Base Alquiler: " + precioBaseAlquiler + ", Uso Comercial: " + usoComercial + 
                ", Cantidad Inquilinos: " + cantidadInquilinos + ", Posee Garaje: " + poseeGaraje;
    }    
    
    public int getCantidadHabitaciones(){
        return cantidadHabitaciones;
    }
    
    public int getPrecioBaseAlquiler(){
        return precioBaseAlquiler;
    }
    
    public boolean isUsoComercial(){
        return usoComercial;
    }
    
    public int getCantidadInquilinos(){
        return cantidadInquilinos;
    }
    
    public boolean isPoseeGaraje(){
        return poseeGaraje;
    }
    
    
    
}
