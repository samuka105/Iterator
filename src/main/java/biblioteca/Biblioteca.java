package biblioteca;

import java.util.Arrays;
import java.util.Iterator;

public class Biblioteca implements Iterable<Livro> {

    private Livro[] livros = new Livro[4];
    private int tamanho = 0;

    public void adicionar(Livro livro) {
        if (tamanho == livros.length) {
            livros = Arrays.copyOf(livros, livros.length * 2);
        }
        livros[tamanho++] = livro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Iterator<Livro> iterator() {
        return new BibliotecaIterator(livros, tamanho);
    }
}
