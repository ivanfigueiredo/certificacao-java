public class OperadoresNegacao {
	public static void main(String[] args) {
		double zooTemperature = 1.21;
		System.out.println(zooTemperature);  // 1.21
		zooTemperature = -zooTemperature;
		System.out.println(zooTemperature);  // -1.21
		zooTemperature = -(-zooTemperature);
		System.out.println(zooTemperature);  // -1.21
		
		// boolean b = -true; NÃO COMPILA
	    // boolean b = -(-true); NÃO COMPILA
	}
}