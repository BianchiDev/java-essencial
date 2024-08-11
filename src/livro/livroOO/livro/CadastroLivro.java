package livro.livroOO.livro;

import livro.livro.Livro;
import livro.livro.Autor;

public class CadastroLivro {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Ariano Suaruna";
        autor.cpf = "312.236.670-30";
        autor.email = "certao@gmail.com";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.setValor(59.99);  // Definindo o valor com o método setter
        livro.isbn = "000 00000 0000";
        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Desconhecido";
        outroAutor.email = "anonimos@gmail.com";
        outroAutor.cpf = "941.955.750-28";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seu primeiro projeto";
        outroLivro.setValor(59.99);  // Definindo o valor com o método setter
        outroLivro.isbn = "123 00000 0000";
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();
    }
}
