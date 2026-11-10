package biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionar(new Livro("Memórias Póstumas", "Machado de Assis"));
        biblioteca.adicionar(new Livro("O Cortiço", "Aluísio Azevedo"));
        biblioteca.adicionar(new Livro("Vidas Secas", "Graciliano Ramos"));
        biblioteca.adicionar(new Livro("Capitães da Areia", "Jorge Amado"));

        System.out.println("Acervo:");
        for (Livro livro : biblioteca) {
            System.out.println("  " + livro.getTitulo() + " — " + livro.getAutor());
        }

        System.out.println("Total: " + Catalogo.contarTotal(biblioteca));
        System.out.println("De Machado de Assis: " + Catalogo.contarPorAutor(biblioteca, "Machado de Assis"));
    }
}
