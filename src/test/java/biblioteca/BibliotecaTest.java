package biblioteca;

import org.junit.jupiter.api.Test;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Biblioteca comTresLivros() {
        Biblioteca b = new Biblioteca();
        b.adicionar(new Livro("Livro A", "Autor 1"));
        b.adicionar(new Livro("Livro B", "Autor 1"));
        b.adicionar(new Livro("Livro C", "Autor 2"));
        return b;
    }

    @Test
    public void testPercorreTodosComForEach() {
        int quantidade = 0;
        for (Livro livro : comTresLivros()) {
            quantidade++;
        }
        assertEquals(3, quantidade);
    }

    @Test
    public void testOrdemPreservada() {
        Iterator<Livro> it = comTresLivros().iterator();
        assertEquals("Livro A", it.next().getTitulo());
        assertEquals("Livro B", it.next().getTitulo());
        assertEquals("Livro C", it.next().getTitulo());
    }

    @Test
    public void testHasNextFalseNoFim() {
        Biblioteca b = new Biblioteca();
        b.adicionar(new Livro("Único", "Autor"));
        Iterator<Livro> it = b.iterator();
        it.next();
        assertFalse(it.hasNext());
    }

    @Test
    public void testNextLancaExcecaoNoFim() {
        Iterator<Livro> it = new Biblioteca().iterator();
        assertThrows(NoSuchElementException.class, () -> it.next());
    }

    @Test
    public void testCrescimentoDoArrayInterno() {
        Biblioteca b = new Biblioteca();
        for (int i = 0; i < 10; i++) {
            b.adicionar(new Livro("Livro " + i, "Autor"));
        }
        assertEquals(10, b.getTamanho());
        assertEquals(10, Catalogo.contarTotal(b));
    }

    @Test
    public void testContarPorAutor() {
        assertEquals(2, Catalogo.contarPorAutor(comTresLivros(), "Autor 1"));
        assertEquals(1, Catalogo.contarPorAutor(comTresLivros(), "Autor 2"));
    }

    @Test
    public void testDoisIteradoresSaoIndependentes() {
        Biblioteca b = comTresLivros();
        Iterator<Livro> a = b.iterator();
        Iterator<Livro> c = b.iterator();
        a.next();
        assertEquals("Livro A", c.next().getTitulo());
    }
}
