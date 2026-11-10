package biblioteca;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BibliotecaIterator implements Iterator<Livro> {

    private Livro[] livros;
    private int tamanho;
    private int posicao = 0;

    public BibliotecaIterator(Livro[] livros, int tamanho) {
        this.livros = livros;
        this.tamanho = tamanho;
    }

    public boolean hasNext() {
        return posicao < tamanho;
    }

    public Livro next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return livros[posicao++];
    }
}
