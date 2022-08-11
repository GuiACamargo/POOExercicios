package exercicio06_GuilhermeACamargo;

public class Main06 {

	public static void main(String[] args) {
		Lista06 l = new Lista06();
		
		int contador = 0;
		
		for(int n = 0; n < 2; n++) {
			if(l.nomes[n] == "Jessica") {
				System.out.println("O nome Jessica foi localizado, sua idade e: " + l.idade[contador]);
			} else {
				contador++;
			}
		}
	}
}
