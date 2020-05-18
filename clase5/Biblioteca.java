package clase5;

class Biblioteca {

    private Libro[] libros;

    public Biblioteca(int cantidadLibros) {
        libros = new Libro[cantidadLibros];
    }

    public void agregarLibro(Libro l) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = l;
                break;
            }

        }
    }

    public int cantidadLibros(int estado) {
        return 0;
    }

    public int[] cantidadLibrosPorEstado() {
        int[] resultado = new int[3];
        resultado[0] = 0;
        resultado[1] = 0;
        resultado[2] = 0;

        for (Libro l : libros) {
            if (l != null) {
                if (l.getEstado() == 1) {
                    resultado[0]++;
                }
                if (l.getEstado() == 2) {
                    resultado[1]++;
                }
                if (l.getEstado() == 3) {
                    resultado[2]++;
                }
            }
        }

        return resultado;
    }

    public String listadoSolicitantes(String titulo) {
        String resultado = "";
        return resultado;
    }

    public float promedioPrestamos() {
        float promedio = 0;
        return promedio;
    }

    public float sumaPrecioExtraviados() {
        float promedioPrestamo = 0;
        return promedioPrestamo;
    }
}
