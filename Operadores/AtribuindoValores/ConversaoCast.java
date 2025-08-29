public class ConversaoCast {
	public static void main(String... args) {
		// Exemplos de operações inválidas sem Conversão (Cast)
		
		// Este codigo não compila, porque, o 9 (int) é automaticamente promovido
		// para o tipo de dado maoir, ou seja, o double, resultando em um double
		// float value = 2.0 / 9;
		
		
		// Este código não compila, porque, o cast (int)5 só é aplicado ao 5
		// e não a expressão completa, é preciso envolver a expressão num parêntese
		// int value = (int)5 * 2L;
		
		
		// Este código não compila, porque, o 3 (int) é promovido para o tipo de dado
		// maior da operação, isto é, o double 2.0 (64 bits), resultando num double
		// e lançando uma exceção porque o short (16 bits) é tipo menor que o double (64 bits)
		// short value = 3 - 2.0;
		
		// Corrigindo as operações acima
		
		float value = (float)(2.0 / 9);
		
		int value2 = (int)(5 * 2L);
		
		short value3 = (short)(3 - 2.0);
		
		System.out.printf("Value: %f%n", value);
		System.out.printf("Value2: %d%n", value2);
		System.out.printf("Value3: %d%n", value3);
		
		// Exemplo de Cast inválido
		// Este código não compila, porque, o número é lido primeiro como int
		// ao ser lido como int, é verificado que ele é maior que o int
		// long reptile = (long)192301398193810323; 
		
		// Corrigindo
		long reptile = 192301398193810323L;

		long goat = 10;
		int sheep = 5;
		// Não compila, porque, o sheep é promovido para long, e o resultado é um long.
		// O erro ocorre ao tentar inserir esse long numa variavel do tipo int.
		// sheep = sheep * goat;
		
		// Além da conversão explícita (cast), é possível corrigir com o operador de atribuição composto.
		// Primeiro ele promove sheep para long, depois realiza a multiplicação, por fim, transforma o resultado
		// para int novamente.
		sheep *= goat;
	}
}