package exercicio05_GuilhermeACamargo;

import java.util.*;

public class Main05 {

	public static void main(String[] args) {
		Anos05 i = new Anos05();
		
		i.nomes.add("João");
		i.nomes.add("Leandro");
		i.nomes.add("Paulo");
		i.nomes.add("Jessica");
		
		i.idade.add(15);
		i.idade.add(21);
		i.idade.add(17);
		i.idade.add(19);
		
		System.out.println("Numero de pessoas na lista: " + i.nomes.size());
		
		Iterator<Integer> iteIdade = i.idade.iterator();
		int contador = 0;
		
		while (iteIdade.hasNext()) {
			int n = (Integer)iteIdade.next();
			if(n < 18) {
				iteIdade.remove();
				i.nomes.remove(contador);
				contador--;
			}
			contador++;
		}
		
		System.out.println("Numero de pessoas com mais de 18 anos: " + i.nomes.size());
		System.out.println("Nome das pessoas restantes: " + i.nomes);

	}

}
