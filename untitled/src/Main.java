//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libros libros = new Libros();
        Libro pp= new Libro("nose", 100, 14, "ll", "terror");
        Libro pp1= new Libro("noseee", 190, 1, "ll", "terror");
        Libro pp2= new Libro("nosee", 200, 4,"ll", "terror");
        libros.addLibro(pp);
        libros.addLibro(pp1);
        libros.addLibro(pp2);
        System.out.println(libros.editBook(1));
        System.out.println(libros.deleteBook(3));





    }
}