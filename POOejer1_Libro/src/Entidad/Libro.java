package Entidad;

public class Libro {

    //Atributos
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroPaginas;

    //constructor
    public Libro(int ISBN, String Titulo, String Autor, int NumeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    public Libro() {

    }
}
