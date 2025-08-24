public class StringMultilinha {
	public static void main(final String[] args) {
		final String block = """
			doe \
			deer"""; // O \ indica ao Java para ignorar nova linha antes do deer
		// final String invalidBlock = """doe""";
		
		final String block2 = """
			doe \n
			deer
			""";
		final String block3 = """
			"doe\"\"\"
			\"deer\"""
			""";
		
		System.out.println(block);
		System.out.println(block2);
		System.out.println("*" + block3 + "*");
	}
}