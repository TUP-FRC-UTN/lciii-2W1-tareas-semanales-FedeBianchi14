package inmobiliaria_gui;

public abstract class Propiedad {
    protected String direccion;
    protected int cantidadHabitaciones;
    protected int precioBaseAlquiler;
    protected boolean usoComercial;
    protected int cantidadInquilinos;

    public Propiedad(String direccion, int cantidadHabitaciones, int precioBaseAlquiler, boolean usoComercial, int cantidadInquilinos) {
        this.direccion = direccion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precioBaseAlquiler = precioBaseAlquiler;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
    }

    @Override
    public abstract String toString();
    
    
    
}
