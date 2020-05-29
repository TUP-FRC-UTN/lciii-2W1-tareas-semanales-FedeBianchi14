
public class Ruleta {

    private String nombre;
    private Apuesta[] apuesta;

    public Ruleta(String nombre, int cantidadApuestas) {
        this.nombre = nombre;
        apuesta = new Apuesta[cantidadApuestas];
    }

    public void agregarApuesta(Apuesta ap) {
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] == null) {
                apuesta[i] = ap;
                break;
            }

        }
    }
    
    public int apuestasGanada(){
        int apuestaganada = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if(apuesta[i] != null){
                if (apuesta[i].getNumeroJugado() == apuesta[i].getNumeroSalio()) {
                    apuestaganada++;
                }
            }
        }
        return apuestaganada;
    }
    
    public int totalGanado(){
        int totalganado = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null) {
                if (apuesta[i].getNumeroJugado() == apuesta[i].getNumeroSalio()) {
                    totalganado += apuesta[i].getDinero() * 36;
                }else{
                 totalganado -= apuesta[i].getDinero();
                }
            }
        }
        return totalganado;
    }
    
    public int vecesSalio(int numero){
        int vecessalio = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null && apuesta[i].getNumeroSalio() == numero) {
                vecessalio++;
            }
        }
        return vecessalio;
    }
    
    public float totalPares(){
        float totalnumpares = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null && apuesta[i].getNumeroJugado() %2 == 0) {
                totalnumpares += apuesta[i].getDinero();
            }
        }
        return totalnumpares;
    }
}
