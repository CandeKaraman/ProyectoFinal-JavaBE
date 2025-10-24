package Productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Libros {
    // use en vez de un array un mapa para disminuir la complejidad computacional
    HashMap<Integer, Libro> libros;

    public Libros() {
        this.libros = new HashMap<>();
    }

    public void addLibro(Libro libro){
        int id= libro.getId();
        libros.put(id,libro);
    }

    public ArrayList<Libro> getLibros() {
        ArrayList <Libro> aux= new ArrayList<>();
        aux.addAll(libros.values());
        return aux;
    }

    @Override
    public String toString() {
        String aux="";
        for(int i = 0; i< libros.size(); i++) {
            aux +=  libros.get(i).toString()+  " id "+ i +" ";
        }
        return aux;
    }

    // este metodo busca un libro esta hecho con una clase Filtro que sea mas escalable,
    // por si el dia de mañana necesito buscar tambien por genero, autor, etc;
    public Libro getBook(FiltroLibro filtro) {
        return filtro.buscar();
    }

    //metodo de editar el precio del libro, decidi solp modificar el precio para no complicarme demasiado
    // queda para la proxima entrega poder modificarlo completamente.
    public String editBook(int idLibro) {
        Libro libro= this.getBookById(idLibro);
        if(libro!=null) {
            System.out.println("Si desea editar el precio del libro ingrese 1, de lo contrario ingrese 0");
            Scanner entrada = new Scanner(System.in);
            int edit = entrada.nextInt();
            if (edit == 1) {
                System.out.println("precio actual: " + libro.getPrecio());
                double precio = entrada.nextDouble();
                libro.setPrecio(precio);
                return libro.toString();
            }
        }
         return  "No existe el libro que desea editar";
    }

    public String deleteBook(int idLibro) {
        Libro libro= this.getBookById(idLibro);
        if(libro!=null) {
            System.out.println("Para confirmar la eliminacion escribir 1, de lo contrario ingrese 0");
            Scanner entrada = new Scanner(System.in);
            int edit = entrada.nextInt();
            if (edit == 1) {this.libros.remove(libro);
                return "Eliminado exitosamente" + libros.toString();
            } else return "Productos.Libro no eliminado";

        }
        return "no existe el libro";
    }
// por mas que tengamos un metodo escalable para las distintas busquedas, mantengo
// este metodo para busquedas por id por su complejidad computacional simple
    public Libro getBookById(int idLibro) {
        return this.libros.get(idLibro);
    }



}
