package br.com.caelum.fj11.cap14;

public class Exe11 {
	public static void main(String[] args) {

		String str = "Fernando";

		Exe11.imprime(str);
		
		Exe11.reversa("Socorram-me, subi no onibus em Marrocos");
		System.out.println();
		Exe11.reversa("Anotaram A Data Da Maratona");
		System.out.println();
		Exe11.invertePalavras("Socorram-me, subi no onibus em Marrocos");

	}

	private static void invertePalavras(String string) {
		String[] palavras = string.split(" ");		
		StringBuffer saida = new StringBuffer();
		for (int i=palavras.length-1; i>=0; i--)
			saida.append(palavras[i] + " ");
		System.out.println(saida);
	}

	private static void reversa(String s) {
		for (int i = (s.length()-1); i >= 0; i--)
			System.out.print(s.charAt(i));
	}

	public static void imprime(String s) {
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
	}

}
