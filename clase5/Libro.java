package clase5;

public class Libro {
    private String titulo;
    private int precio;
    private int estado;
    private Prestamo[] prestamos;

    public Libro(String titulo, int precio) {
        this.titulo = titulo;
        this.precio = precio;
        
        this.estado = 1;
    }
    
    public int getEstado(){
        return this.estado;
    }

    public void agregarPrestamo(Prestamo nuevo){
        if(!nuevo.isDevuelto()){
            this.estado = 2;
        }else{
            this.estado = 1;
        }
    }
    
    public String listadoSolicitantes(){
        return "";
    }
    
    public int cantidadPrestamos() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + '}';
    }
    
    
    
    
}
