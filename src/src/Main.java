import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libros libros = new Libros();
        System.out.println("Bienvendio el sistema...");
        System.out.println("Ingrese el numero de la operacion que desea realizar: ");
        System.out.println(" 0 - Finaliza el programa " +
               "1 - Crea un Producto " +
               "2 - Listar Productos " +
               "3 - Búsqueda por id " +
               "4 - Editar precio por id " +
               "5 - Borrar producto con ");
        Scanner entrada = new Scanner(System.in);
        int menu= entrada.nextInt();

        switch (menu) {
            case 2: {
                System.out.println(libros.getLibros());
                break;
            }
            case 3: {
                System.out.println("ingrese la id del libro");
                int id = entrada.nextInt();
                System.out.println(libros.getBook(id));
                break;
            }
            case 4: {
                System.out.println("ingrese la id del libro");
                int id= entrada.nextInt();
                libros.editBook(id);
                break;
            } case 5: {
                System.out.println("ingrese la id del libro");
                int id= entrada.nextInt();
                libros.deleteBook(id);
            }




        }



        /** Libro pp= new Libro("nose", 100, 14, "ll", "terror");
         Libro pp1= new Libro("noseee", 190, 1, "ll", "terror");
         Libro pp2= new Libro("nosee", 200, 4,"ll", "terror");
         libros.addLibro(pp);
         libros.addLibro(pp1);
         libros.addLibro(pp2);
         System.out.println(libros.editBook(1));
         System.out.println(libros.deleteBook(3));
         **/


    }
}