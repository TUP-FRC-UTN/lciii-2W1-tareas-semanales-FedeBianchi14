package hotel;

import java.util.ArrayList;

public class Hotele {
    ArrayList<Reserva> listaReservas;
    
    public Hotele(){
        this.listaReservas = new ArrayList();
    }
    
    public void agregarReserva(Reserva reserva){
        listaReservas.add(reserva);
    }
    
    public ArrayList<Reserva> getListaReservas(){
        return listaReservas;
    }
    
    
    public float tarifaReserva(){
       float tarifaTotal = 0;
       
        for (Reserva reserva : listaReservas) {
            if(reserva instanceof Negocio){
                if(reserva instanceof Negocio && ((Negocio) reserva).IsConferencia()){
                    tarifaTotal = (500 * ((Negocio) reserva).getDiasReservados()) + 700;
                }else{
                    tarifaTotal = (500 * ((Negocio) reserva).getDiasReservados());
                }   
            }else{
                tarifaTotal = (600 * ((Vacaciones) reserva).getDiasReservados()) + (100 * ((Vacaciones) reserva).getCantidadHijos());
            }
        }
        return tarifaTotal;
    }
    
    public float tarifaTotal(){
        float tarifaTotal = 0;
        
        for (Reserva reserva : listaReservas) {
            if(reserva instanceof Negocio){
                if(((Negocio) reserva).isVigente()){
                    if(((Negocio) reserva).IsConferencia()){
                        tarifaTotal = (500 * ((Negocio) reserva).getDiasReservados() + 700);
                    }else
                        tarifaTotal = (500 * ((Negocio) reserva).getDiasReservados());
                }
            }else{
                if(((Vacaciones) reserva).isVigente()){
                    tarifaTotal= (600 * ((Vacaciones) reserva).getDiasReservados() + 100  * ((Vacaciones) reserva).getCantidadHijos());
                }
            }
        }
        return tarifaTotal;
    }
    
        public int[] cantReservasTipo(){
        int[] cantReservas = new int[2];
        
        
        for (Reserva reserva : listaReservas) {
            if(reserva instanceof Negocio){
                cantReservas[0]++;
            }
            else{
                cantReservas[1]++;
            }
        }
        return cantReservas;
    }
            
}
