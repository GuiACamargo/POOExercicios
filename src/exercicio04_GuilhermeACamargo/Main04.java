package exercicio04_GuilhermeACamargo;

public class Main04 {

	public static void main(String[] args) {
		Lista04 l = new Lista04();
		
		for(int n = 0; n < 4; n++) {
			if(l.idade[n] > l.idadeVelha) {
				l.idadeVelha = l.idade[n];
				l.nomeVelha = l.nomes[n];
			}
		}
		
		System.out.println("Idade da pessoa mais velha: " + l.idadeVelha);
		System.out.println("Nome da pessoa mais velha: " + l.nomeVelha);

	}

}
