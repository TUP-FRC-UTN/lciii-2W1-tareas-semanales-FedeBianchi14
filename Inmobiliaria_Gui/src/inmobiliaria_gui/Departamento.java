package inmobiliaria_gui;

public class Departamento extends Propiedad {

    private float precioExpensas;

    public Departamento(String direccion, int cantidadHabitaciones, int precioBaseAlquiler, boolean usoComercial, int cantidadInquilinos, float precioExpensas) {
        super(direccion, cantidadHabitaciones, precioBaseAlquiler, usoComercial, cantidadInquilinos);
        this.precioExpensas = precioExpensas;
    }

    @Override
    public String toString() {
        return "Negocio \n"
                + "Direccion: " + direccion + ", Cantidad Habitaciones: " + cantidadHabitaciones
                + ", Precio Base Alquiler: " + precioBaseAlquiler + ", Uso Comercial: " + usoComercial
                + ", Cantidad Inquilinos: " + cantidadInquilinos + ", Precio Expensas: " + precioExpensas;
    }

    
    public int getCantidadHabitaciones(){
        return cantidadHabitaciones;
    }
    
    public int getPrecioBaseAlquiler(){
        return precioBaseAlquiler;
    }
    
    public boolean getUsoComercial(){
        return usoComercial;
    }
    
    public int getCantidadInquilinos(){
        return cantidadInquilinos;
    }
    
    public float getPrecioExpensas(){
        return precioExpensas;
    }
}
