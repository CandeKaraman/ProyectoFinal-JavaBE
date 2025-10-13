import java.util.ArrayList;

public class Libros {
    ArrayList<Libro> libros;

    public Libros() {
        this.libros = new ArrayList<>();
    }

    public void addProducto(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> getProductos() {
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

    public String buscarProducto(String nombre) {
        boolean encontrado=false;
        Libro aux=null;
        for(int i = 0; i< libros.size(); i++) {
            if(nombre.equals(libros.get(i).getNombre())) {
                encontrado=true;
                aux= libros.get(i);
            }
        }
        if(encontrado){
        return aux.toString();
        }else{
            return "Producto no encontrado";
        }
    }
}
