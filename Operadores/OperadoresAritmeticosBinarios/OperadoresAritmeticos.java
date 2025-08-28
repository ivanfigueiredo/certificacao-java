public class OperadoresAritmeticos {
	public static void main(String... args) {
		int preco = 2 * 5 + 3 * 4 - 8;
		System.out.println(preco); // Resultado 14
		
		//Alterando ordem com parêntese
		
		preco = 2 * ((5 + 3) * 4 - 8);
		System.out.println(preco); // Resultado 48
		
		// Reduzindo expressão acima
		preco = 2 * (8 * 4 - 8);
		System.out.println(preco); // Resultado 48
		
		// Reduzindo expressão acima 
		preco = 2 * (32 - 8);
		System.out.println(preco); // Resultado 48
		
		// Reduzindo expressão acima 
		preco = 2 * 24;
		System.out.println(preco); // Resultado 48
		
		// Erro de balanceamento de parêntese
		// long preco = 1 + ((3 * 5) / 3; NÃO COMPILA
		// int blueJay = (9 + 2) + 3) / (2 * 4; NÃO COMPILA
		
		// short robin = 3 + [(4 * 2) + 4]; Java não permiti substituir parênteses por colchetes
		
		// Operador módulo ou resto
		
		System.out.println(9 / 3);  // 3
		System.out.println(9 % 3);  // 0

		System.out.println(10 / 3); // 3
		System.out.println(10 % 3); // 1

		System.out.println(11 / 3); // 3
		System.out.println(11 % 3); // 2

		System.out.println(12 / 3); // 4
		System.out.println(12 % 3); // 0
	}
}