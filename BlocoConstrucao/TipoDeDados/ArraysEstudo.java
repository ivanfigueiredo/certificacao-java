public class ArraysEstudo {
	public float testeF;
	public double testeD;
	public static void main(final String[] args) {
		final ArraysEstudo ae = new ArraysEstudo();
		final int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		final double[] decimais = new double[5];
		decimais[0] = 1.2;
		decimais[1] = 2.2;
		
		final float[] values = new float[5];
		values[0] = 1.1f;
		values[1] = 2.1f;
		values[2] = 3.1f;
		
		System.out.println(numbers[0]);
		System.out.println(decimais[1]);
		System.out.println(values[1]);
		System.out.println(ae.testeF);
		System.out.println(ae.testeD);
	}
}