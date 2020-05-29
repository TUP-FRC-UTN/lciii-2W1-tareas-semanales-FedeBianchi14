
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del jugador");
        sc.nextLine();
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de apuestas");
        int cantidadApuestas = sc.nextInt();

        //CREAR RULETA
        Ruleta ruleta = new Ruleta(nombre, cantidadApuestas);
        
// LLENAMOS LOS DATOS EN APUESTA
        for (int i = 0; i < cantidadApuestas; i++) {
            System.out.println("Ingrese el numero Jugado");
            int numeroJugado = sc.nextInt();
            System.out.println("Ingrese el dinero apostado");
            float dinero = sc.nextFloat();
            System.out.println("Ingrese el numero que salio");
            int numeroSalio = sc.nextInt();
            
            Apuesta apuesta = new Apuesta(numeroJugado, dinero, numeroSalio);
            ruleta.agregarApuesta(apuesta);
        }
        
        System.out.println("Apuestas ganadas: " + ruleta.apuestasGanada());
        System.out.println("Dinero total ganado: " + ruleta.totalGanado());
        System.out.println("Suma de numeros pares" + ruleta.totalPares());
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        System.out.println("Veces que salio el numero "+ numero +": "+  ruleta.vecesSalio(numero));
        
    }
    
}
