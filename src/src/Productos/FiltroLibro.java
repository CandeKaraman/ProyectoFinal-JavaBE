package Productos;

public abstract class FiltroLibro {

    Libros libros;

    public FiltroLibro( Libros libros) {
        this.libros = libros;
    }

    public abstract Libro buscar();
}
