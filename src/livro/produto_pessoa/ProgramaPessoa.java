package livro.produto_pessoa;

/*
 * O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * Por padrçao, a JVM - Java virtual machine, cira em tempo de execução
 * Um construtor padrão -  construtor vazio;
 */

public class ProgramaPessoa {

	public static void main(String[] args) {
		Pessoa pessoal = new Pessoa();// Método construtor

		pessoal.nome = "Bianchi";
		pessoal.email = "ifpebianchi@gmail.com";
		pessoal.ano_nascimento = 1988;

		System.out.println("Nome " + pessoal.nome);
		System.out.println("E-mail: " + pessoal.email);
		System.out.println("Ano de Nascimento: " + pessoal.ano_nascimento);

	}
}
