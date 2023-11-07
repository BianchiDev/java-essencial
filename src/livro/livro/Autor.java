package livro.livro;

public class Autor {
	String nome;
	String cpf;
	String email;

	void mostrarDetalhes() {
		//System.out.println("--");
		System.out.println("Mostrar detalhes do autor");
		System.out.println("Nome do autor: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("E-mail: " + email);
		//System.out.println("--");
	}
}
