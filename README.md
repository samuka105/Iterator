# Padrão Iterator

Exemplo do padrão comportamental **Iterator** aplicado a uma biblioteca. A coleção
guarda os livros em um vetor interno próprio e oferece um iterador feito à mão, que
permite percorrer o acervo (inclusive com `for-each`) sem expor como ele é
armazenado por dentro.

## Conteúdo do repositório

- **Código-fonte** do exemplo implementando o padrão Iterator (biblioteca com iterador próprio).
- **Casos de teste** (JUnit) cobrindo a varredura completa, a ordem, o fim da coleção e a independência entre iteradores.
- **Diagrama UML** das classes, em formato de imagem.
