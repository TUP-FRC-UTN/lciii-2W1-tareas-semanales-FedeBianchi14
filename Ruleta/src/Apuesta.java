public class Apuesta {
    private int numeroJugado;
    private float dinero;
    private int numeroSalio;

    public Apuesta(int numeroJugado, float dinero, int numeroSalio) {
        this.numeroJugado = numeroJugado;
        this.dinero = dinero;
        this.numeroSalio = numeroSalio;
    }

    public int getNumeroJugado() {
        return numeroJugado;
    }

    public int getNumeroSalio() {
        return numeroSalio;
    }

    public float getDinero() {
        return dinero;
    }
    
    
    

}
