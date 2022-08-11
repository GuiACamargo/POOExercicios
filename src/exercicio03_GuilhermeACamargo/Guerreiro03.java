package exercicio03_GuilhermeACamargo;

import java.util.*;

public class Guerreiro03 extends Personagem03 {
	
	public Guerreiro03(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	private List<String> habilidades = new ArrayList<String>();
	private Random random = new Random();

	@Override
	public void attack() {
		int dano = (getForca() * getLevel()) + random.nextInt(300);
		System.out.println("Voce como guerreiro efetuou: " + dano + " de dano!");
		
	}
	
	public void aprenderMagia(String Habilidade) {
		habilidades.add(Habilidade);
		System.out.println("Magia " + Habilidade + " aprendida!");
		System.out.println("Suas magias agora sao: " + habilidades);
	}

	public List<String> getMagia() {
		return habilidades;
	}
	
	@Override
	public void lvlUp() {
		setLevel(getLevel() + 1);
		setMana(getVida() + 3);
		setInteligencia(getForca() + 3);
	}
	
}
