public class InicializadorInstancia {
	private String name = "Fluffy";
	{ System.out.println("setting field"); }
	
	public InicializadorInstancia() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(final String[] args) {
		InicializadorInstancia inicInstancia = new InicializadorInstancia();
		System.out.println(inicInstancia.name);
	}
}