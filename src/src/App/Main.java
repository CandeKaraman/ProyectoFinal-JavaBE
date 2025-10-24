package App;

import Excepciones.StockInsuficienteException;
import Pedidos.Pedido;
import Productos.FiltroLibro;
import Productos.FiltroNombre;
import Productos.Libro;
import Productos.Libros;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws StockInsuficienteException {
        Libros libros = new Libros();
        menu(libros);

    }

    public static void mensaje(){
        System.out.println("Ingrese el numero de la operacion que desea realizar: ");
        System.out.println(" 0 - Finaliza el programa " +
                "1 - Crea un libro " +
                "2 - Listar libros " +
                "3 - Búsqueda por id " +
                "4 - Editar precio por id " +
                "5 - Borrar libro con id "+
                "6- Crear pedido nuevo ");
    }

    public static void menu(Libros libros) throws StockInsuficienteException {
        mensaje();
        Scanner entrada = new Scanner(System.in);
        int menu= entrada.nextInt();
        switch (menu) {
            case 0:
                break;
            case 1: {
                Libro libro = new Libro();
                System.out.println("Ingrese el nombre del libro: ");
                libro.setNombre(entrada.next());
                System.out.println("Ingrese el precio del libro: ");
                libro.setPrecio(entrada.nextDouble());
                System.out.println("Ingrese el cantidad del libro: ");
                libro.setCantidad(entrada.nextInt());
                System.out.println("Ingrese el autor del libro: ");
                libro.setAutor(entrada.next());
                System.out.println("Ingrese el genero del libro: ");
                libro.setGenero(entrada.next());
                libros.addLibro(libro);
                menu(libros);
                break;
            }
            case 2: {
                System.out.println(libros.getLibros());
                menu(libros);
                break;
            }
            case 3: {
                System.out.println("ingrese la id del libro");
                int id = entrada.nextInt();
                System.out.println(libros.getBookById(id));
                menu(libros);
                break;
            }
            case 4: {
                System.out.println("ingrese la id del libro");
                int id = entrada.nextInt();
                libros.editBook(id);
                menu(libros);
                break;
            }
            case 5: {
                System.out.println("ingrese la id del libro");
                int id = entrada.nextInt();
                libros.deleteBook(id);
                menu(libros);
                break;
            }
            case 6:{
                System.out.println("ingrese la cantdad de items del pedido: ");
                Pedido pedido = new Pedido();
                int cantidad = entrada.nextInt();
                for(int i = 0; i < cantidad; i++){
                    System.out.println("ingrese el nombre del libro :");
                    String nombre = entrada.next();
                    FiltroLibro filtro= new FiltroNombre(nombre,libros);
                    Libro libro= libros.getBook(filtro);
                    System.out.println("Ingrese cantidad de libros:");
                    int cantidadLibro = entrada.nextInt();
                    pedido.addPedido(libro,cantidadLibro);

                }
                System.out.println(pedido.getPrecio());
                menu(libros);
                break;
            }



        }





    }
}