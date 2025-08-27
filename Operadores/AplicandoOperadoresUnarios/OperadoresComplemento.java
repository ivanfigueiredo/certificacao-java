public class OperadoresComplemento {
	public static void main(String[] args) {
		// Operador de Complemento lógico (!) 
		// Inverte o valor de uma expressão boolean
		boolean isAnimalAsleep = false;
		System.out.println(isAnimalAsleep);  // false
		isAnimalAsleep = !isAnimalAsleep;
		System.out.println(isAnimalAsleep);  // true
		
		// Operador de Complemento bit a bit
		// Aplicado a tipos inteiros como byte, short, char, int e long
		// Para calcular resultado, multiplique o valor por -1, depois subtraia um (-1).
		// Ex: -1 * 15 - 1 = -16
		int value = 15;                   // 0011
		int complement = ~value;         // 1100
		System.out.println(value);       // 15
		System.out.println(complement);  // -16
		
		// int value = !5; NÃO COMPILA
		// long value = !1L; NÃO COMPILA
		// boolean b = !1; NÃO COMPILA
		// boolean b = !"Teste"; NÃO COMPILA
		// boolean b = !1L; NÃO COMPILA
	}
}