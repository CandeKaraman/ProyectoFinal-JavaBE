import java.util.ArrayList;
import java.util.Scanner;

public class Libros {
    ArrayList<Libro> libros;

    public Libros() {
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        ArrayList <Libro> aux= new ArrayList<>();
        aux.addAll(libros);
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

    // este metodo busca un libro en especifico por id
    public Libro getBook(int IdLibro) {
        Libro aux = null;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == IdLibro) {
                return libros.get(i);
            }
        }
        return null;
    }

    //metodo de editar el precio del libro, decidi solp modificar el precio para no complicarme demasiado
    // queda para la proxima entrega poder modificarlo completamente.
    public String editBook(int idLibro) {
        Libro libro= this.getBook(idLibro);
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
        Libro libro= this.getBook(idLibro);
        if(libro!=null) {
            System.out.println("Para confirmar la eliminacion escribir 1, de lo contrario ingrese 0");
            Scanner entrada = new Scanner(System.in);
            int edit = entrada.nextInt();
            if (edit == 1) {this.libros.remove(libro);
                return "Eliminado exitosamente" + libros.toString();
            } else return "Libro no eliminado";

        }
        return "no existe el libro";
    }



}
