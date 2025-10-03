//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Productos productos = new Productos();
        Producto pp= new Producto("nose", 100, 14);
        Producto pp1= new Producto("noseee", 190, 1);
        Producto pp2= new Producto("nosee", 200, 4);
        productos.addProducto(pp);
        productos.addProducto(pp1);
        productos.addProducto(pp2);
        System.out.println(productos.buscarProducto("nose"));
        System.out.println(productos.buscarProducto("nos"));




    }
}