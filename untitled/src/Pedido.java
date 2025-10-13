import java.util.HashMap;

public class Pedido {

    HashMap<Libro, Integer> pedido;
    double precio;

    public Pedido(double precio) {
        pedido= new HashMap<Libro, Integer>();
        setPrecio();
    }

    public void setPrecio() {
        double precio=0;
        for(Libro libro: pedido.keySet()){
            precio+=libro.getPrecio();
        }
    }
    
}
