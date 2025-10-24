package Pedidos;

import Excepciones.StockInsuficienteException;
import Productos.Libro;

import java.util.HashMap;

public class Pedido {

    HashMap<Libro, Integer> pedido;
    double precio;

    public Pedido() {
        pedido= new HashMap<Libro, Integer>();
        setPrecio();
    }

  public void setPrecio() {
        double precio=0;
        for(Libro libro: pedido.keySet()){
            precio+=libro.getPrecio();
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void addPedido(Libro libro, int cantidad) throws StockInsuficienteException {
        if (libro.getCantidad() < cantidad) {
            throw new StockInsuficienteException("Stock insuficiente para el libro: " + libro.getNombre());
        }

        libro.setCantidad(libro.getCantidad()-cantidad);
        pedido.put(libro, cantidad);
        this.setPrecio();


    }

}
