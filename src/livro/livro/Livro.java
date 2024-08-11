package livro.livro;

public class Livro {

    public String nome;
    public String descricao;
    public String isbn;
    public double valor;
    public Autor autor;
    String mensagem = "Mostrar detalhe do livro.";

    public Livro() {
        System.out.println("Novo Livro criado!");
    }

    boolean temAutor() {
        return this.autor != null;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void mostrarDetalhes() {
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("ISBN: " + isbn);
        System.out.println("Valor: " + valor);

        if (this.temAutor()) { // acessa o método temAutor e se sim, mostra os detalhes.
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

    public boolean aplicandoDescontoDe(double porcentagem) {

        if (porcentagem > 0.3) {
            System.out.println("Desconto não pode ser maior que 30%");
            return true;
        }
        this.valor -= this.valor * porcentagem;
        return false;
    }

}
