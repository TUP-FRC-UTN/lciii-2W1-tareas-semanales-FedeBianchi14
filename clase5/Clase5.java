package clase5;

import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bib;
        
        bib = new Biblioteca(3);
        
        //Prueas sobre la biblioteca
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese titulo: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese precio: ");
            int precio = sc.nextInt();
            
            Libro l = new Libro(titulo, precio);
                    
            bib.agregarLibro(l);
            
            System.out.println("Ingrese solicitante: ");
            sc.nextLine();
            String solicitante = sc.nextLine();
            System.out.println("Ingrese cantidad dias prestamo: ");
            int cantidadDias = sc.nextInt();
            System.out.println("Ingrese devuelto (0 false, 1 true): ");
            int dev = sc.nextInt();
            boolean devuelto = false;
            if(dev == 1){
                devuelto = true;
            }
            Prestamo p = new Prestamo(solicitante, cantidadDias, devuelto);
            l.agregarPrestamo(p);
            
            int[] resultado = bib.cantidadLibrosPorEstado();
            System.out.println("Cantidad libros disponible:");
            System.out.println(resultado[0]);
            System.out.println("Cantidad libros prestado:");
            System.out.println(resultado[1]);
            System.out.println("Cantidad libros extraviados:");
            System.out.println(resultado[2]);
            
        }
        

    }
    
}
