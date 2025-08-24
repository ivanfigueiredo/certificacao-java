public class DeclaracaoVariavel {
	public static void main(String args[]) {
		// Exemplos de declaracao de variaveis validos
		long okidentifier = 1L;
		float $OK2Identifier = 11.2f;
		boolean _alsoOK1d3ntifi3r = false;
		char __SStillOkbutKnotsonice$ = 'c';
		
		System.out.println(okidentifier);
		System.out.println($OK2Identifier);
		System.out.println(_alsoOK1d3ntifi3r);
		System.out.println(__SStillOkbutKnotsonice$);
		
		//Exemplo de declaracao de variaveis invalidos
		//int 3DPointClass;  Nao pode comecar com numeros, pode conter numeros mas nao iniciar
		//byte hollywood@vine; Nao deveria conter @, somente $ ou _ podem ser utilizados
		//String *$coffee;  Nao deveria conter *, somente $ ou _ podem ser utilizados
		//double public;  Nao pode ser utilizada palavras reservadas do Java
		//short _;  Somente o underscore _ nao e um nome valido
	}
}