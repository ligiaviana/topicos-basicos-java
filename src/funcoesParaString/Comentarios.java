package funcoesParaString;

public class Comentarios {

	public static void main(String[] args) {

		/*
		 * Este programa demonstra as fun��es para String
		 */
		String original = "abcde FGHIJ ABC abc DEFG     ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();

		System.out.println("Original: - " + original + "-");
		System.out.println("ToLowerCase: - " + s01 + "-");
		System.out.println("ToUpperCase: - " + s02 + "-"); // sa�da em mai�sculas
		System.out.println("Trim: - " + s03 + "-");

	}

}
