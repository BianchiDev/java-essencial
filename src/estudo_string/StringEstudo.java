package estudo_string;

public class StringEstudo {
	public static void main(String[] args) {
		
		String original = " abcd FGH  ijc TUVX  " ;
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(5);
		String s05 = original.substring(5,9);
		String s06 = original.replace("abcd", "modificado");
		
		System.out.println("Original: --" + original+ "--"); 
		System.out.println("Converte para menúsculo: --" + s01 + "--");
		System.out.println("Converte para maiúsculo: --"+ s02 + "--");
		System.out.println("Elimina os espaços no canto da string: --"+ s03 + "--");
		System.out.println("Criou uma nova string apartir do caracter marcado: --" + s04 + "--");
		System.out.println("Criou uma nova string apartir do caracter marcado até  o caracter final: --" + s05 + "--");
		System.out.println("Modifica para o novo parêmtro: --" + s06 + "--");
	}

}
