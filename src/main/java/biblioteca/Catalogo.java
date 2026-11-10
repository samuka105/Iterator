package biblioteca;

public class Catalogo {

    public static int contarPorAutor(Biblioteca biblioteca, String autor) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getAutor().equals(autor)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int contarTotal(Biblioteca biblioteca) {
        int quantidade = 0;
        java.util.Iterator<Livro> it = biblioteca.iterator();
        while (it.hasNext()) {
            it.next();
            quantidade++;
        }
        return quantidade;
    }
}
