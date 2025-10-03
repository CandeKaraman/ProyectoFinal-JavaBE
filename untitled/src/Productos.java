import java.util.ArrayList;

public class Productos {
    ArrayList<Producto> productos;

    public Productos() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        ArrayList <Producto> aux= new ArrayList<>();
        aux.addAll(productos);
        return aux;
    }

    @Override
    public String toString() {
        String aux="";
        for(int i=0;i<productos.size();i++) {
            aux +=  productos.get(i).toString()+  " id "+ i +" ";
        }
        return aux;
    }

    public String buscarProducto(String nombre) {
        boolean encontrado=false;
        Producto aux=null;
        for(int i=0;i<productos.size();i++) {
            if(nombre.equals(productos.get(i).getNombre())) {
                encontrado=true;
                aux=productos.get(i);
            }
        }
        if(encontrado){
        return aux.toString();
        }else{
            return "Producto no encontrado";
        }
    }
}
