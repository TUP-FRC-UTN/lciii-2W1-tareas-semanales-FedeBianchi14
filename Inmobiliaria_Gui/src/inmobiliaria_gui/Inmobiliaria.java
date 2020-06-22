package inmobiliaria_gui;

import java.util.ArrayList;

public class Inmobiliaria {

    private ArrayList<Propiedad> listaPropiedad;

    public Inmobiliaria(){
        this.listaPropiedad = new ArrayList<>();

    }
    
    public void agregarPropiedad(Propiedad propiedad){
        listaPropiedad.add(propiedad);
    }
    
    public ArrayList<Propiedad> getListaPropiedad(){
        return listaPropiedad;
    }

    // CALCULAR PRECIO ALQUILER
    public double precioAlquiler(){
        double precioAlquiler = 0;
        
        for (Propiedad propiedad : listaPropiedad) {
            if(propiedad instanceof Casa){
                if(((Casa) propiedad).usoComercial){
                    precioAlquiler = ((Casa) propiedad).getPrecioBaseAlquiler() + 1000;
                }else{
                    precioAlquiler = ((Casa) propiedad).getPrecioBaseAlquiler();
                }
            }else{
                if(((Departamento) propiedad).usoComercial){
                    precioAlquiler = ((Departamento) propiedad).getPrecioBaseAlquiler() + ((Departamento) propiedad).getPrecioExpensas() + 500;
                }else{
                    precioAlquiler = ((Departamento) propiedad).getPrecioBaseAlquiler() + ((Departamento) propiedad).getPrecioExpensas();
                }
            }
        }
        return precioAlquiler;
    }
    
    
    
    //ALQUILER PROMEDIO PROPIEDADES 2 INQUILINOS
    public double alquilerPromedio(){
        
        float promedioInquilinos = 0;
        int contadorInquilinos = 0;
        
        for (Propiedad propiedad : listaPropiedad) {
            if(propiedad instanceof Casa){
                if(((Casa) propiedad).getCantidadInquilinos() == 2){
                    contadorInquilinos++;
                    promedioInquilinos += this.precioAlquiler();
                }
                
            }else{
                if(((Departamento) propiedad).getCantidadInquilinos() == 2){
                    contadorInquilinos++;
                    promedioInquilinos += this.precioAlquiler();
                }
            }
        }
        return promedioInquilinos / contadorInquilinos;
    }
    
    //CASAS DE 3 o + HABITACIONES CON GARAJE
    public int casas3Habitaciones(){
        int contadorCasas = 0;
        for (Propiedad propiedad : listaPropiedad) {
            if(propiedad instanceof Casa){
                if(((Casa) propiedad).getCantidadHabitaciones() >= 3 && ((Casa) propiedad).isPoseeGaraje()){
                contadorCasas++;
            }
            }
        }
        return contadorCasas;
    }
    
    

}
