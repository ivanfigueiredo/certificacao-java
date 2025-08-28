public class PromocaoNumerica {
	public static void main(String... args) {
		// Promovendo um dos valores para o maior dos dois tipos de dados
		int a = 10;
		long b = 11L;
		// Promovendo a para Long
		long result = a + b;
		
		System.out.println(result); // 21 Long
		
		//-----------------------------------------------------------------------
		
		// Promovendo valor integral para o tipo de dados do valor de ponto flutuante
		int c = 10;
		float d = 11.f;
		// Promovendo c para float
		float result2 = c + d;
		
		System.out.println(result2); // 21.0 float
		
		long e = 10L;
		double f = 11.0;
		// Promovendo 'e' double antes de realizar a soma'
		double result3 = e + f;
		
		System.out.println(result3); // 21.0 double
		
		//------------------------------------------------------------------------
		
		// Tipos de dados menores, byte, short e char são promovidos para int primeiro sempre
		// que são utilizados com operador aritmético binário (+, -, *, /, %)
		// mesmo que nenhum dos operadores sejam do tipo int
		
		byte g = 10;
		short h = 11;
		// Ambos, 'g' e 'h' são promovidos para int antes de serem somados
		int result4 = g + h;
		
		System.out.println(result4); // 21 int
		
		short i = 10;
		short j = 11;
		// Ambos, 'i' e 'j' são promovidos para int antes de serem somados
		int result5 = i * j;
		
		System.out.println(result5); // 110 int
	
	}
}