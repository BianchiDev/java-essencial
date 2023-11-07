package livro.livroOO.livro;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		
		Livro livro = new Livro();
	//	livro.valor = 59.9;
		
//		System.out.println("Valor do livro: "+ livro.valor);
		
		if(!livro.aplicandoDesconctoDe(0.1)) {
			System.out.println("Desconto não pode ser maior que 30% ");
		}else {
	//		System.out.println("Valor com desconto" + livro.valor);
		}
	}

}
