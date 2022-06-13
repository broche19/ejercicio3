
public class contarVocales {

	public static void main(String[] args) {

		String frase = "mañana me voy a la playa";
		contarVocales(frase);
	}

	public static void contarVocales(String frase) {
		int contA=0, contE=0, contI=0, contO=0, contU=0;
		
		for(int i=0;i<frase.length();i++) {
			if(String.valueOf(frase.charAt(i)).equals("a")){
				contA++;
			}else if(String.valueOf(frase.charAt(i)).equals("e")){
				contE++;
			}else if(String.valueOf(frase.charAt(i)).equals("i")){
				contI++;
			}else if(String.valueOf(frase.charAt(i)).equals("o")){
				contO++;
			}else if(String.valueOf(frase.charAt(i)).equals("u")){
				contU++;
			}
		}
		System.out.println("numero vocales a: " + contA);
		System.out.println("numero vocales e: " + contE);
		System.out.println("numero vocales i: " + contI);
		System.out.println("numero vocales o: " + contO);
		System.out.println("numero vocales u: " + contU);

	}
}
