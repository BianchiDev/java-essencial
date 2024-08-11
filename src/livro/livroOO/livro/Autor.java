package livro.livroOO.livro;

public class Autor {
	public String nome;
	public String cpf;
	public String email;

	public void mostrarDetalhes() {
		//System.out.println("--");
		System.out.println("Mostrar detalhes do autor");
		System.out.println("Nome do autor: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("E-mail: " + email);
		//System.out.println("--");
	}
}
