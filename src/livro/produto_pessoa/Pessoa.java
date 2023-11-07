package produto_pessoa;

public class Pessoa {

	String nome,email;
	int ano_nascimento;
	
	// Construtor vazio
	public Pessoa(){};

	public Pessoa(String nome, String email, int ano_nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	};
	
	void imprime_informacoes() {
		System.out.println("nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de nascimento: " + this.ano_nascimento);

	}
}
