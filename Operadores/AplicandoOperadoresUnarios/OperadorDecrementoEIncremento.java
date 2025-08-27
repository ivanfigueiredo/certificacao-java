public class OperadorDecrementoEIncremento {
	public static void main(String[] args) {
		int value = 0;
		System.out.println(value);    // 0
		System.out.println(++value); // 1
		System.out.println(value);    // 1
		System.out.println(value--); // 1
		System.out.println(value);    // 0
		
		int value2 = 5;
		System.out.println(++value2); // 6	
		System.out.println(value2++); // 6	
		System.out.println(value2); // Valor já atualizado pelo Pós-Incremento acima = 7	
		System.out.println(--value2); // 6
		System.out.println(value2--); // 6	
		System.out.println(value2); //  Valor já atualizado pelo Pós-Decremento acima = 5
	}
}