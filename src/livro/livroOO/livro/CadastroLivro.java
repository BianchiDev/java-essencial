package livro.livroOO.livro;

public class CadastroLivro {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.nome = "Ariano suasuna";
		autor.cpf = "312.236.670-30";
		autor.email = "certao@gmail.com";
		
		
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da lnguagem";
	//	livro.valor = 59.99;
		livro.isbn = " 000 00000 0000";
		
		livro.autor = autor;
		
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "desconhecido";
		outroAutor.email = "annonimos@gmail.com";
		outroAutor.cpf = "941.955.750-28";
		
		Livro outrolivro = new Livro();
		outrolivro.nome = "Lojica de programacao";
		outrolivro.descricao = "Crie seu primeiro projetol";
		//outrolivro.valor = 59.99;
		outrolivro.isbn = " 123 00000 0000";
		
		outrolivro.autor = outroAutor;
		
		outrolivro.mostrarDetalhes();
		
	}

}
