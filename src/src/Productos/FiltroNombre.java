package Productos;

import java.util.ArrayList;

public class FiltroNombre extends FiltroLibro {

    String titulo;

    public FiltroNombre(String titulo,  Libros libros) {
        super( libros);
        this.titulo = titulo;
    }

    @Override
    public Libro buscar() {
        ArrayList<Libro> ll= libros.getLibros();
       for(Libro l : ll){
            if(l.getNombre().equals(titulo)){
                return l;
            }
        }
       return null;

    }
}
