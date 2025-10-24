package Productos;

public class Libro {
    private static int contadorId = 1;
    private String nombre;
    private double precio;
    private int cantidad;
    private String autor;
    private String genero;
    private int id;

    public Libro(){
        this.id = contadorId++;
    }

    public Libro(String nombre, double precio, int cantidad,  String autor, String genero) {
        this.nombre = nombre;
        setPrecio(precio);
        setCantidad(cantidad);
        this.autor = autor;
        this.genero = genero;
        this.id = contadorId++;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0){
            this.precio = precio;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
       if (cantidad > 0){
           this.cantidad = cantidad;
       }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Productos.Libro{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", id=" + id +
                '}';
    }
}
