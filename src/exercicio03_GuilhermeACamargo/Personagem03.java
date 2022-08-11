package exercicio03_GuilhermeACamargo;

public abstract class Personagem03 {
	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;
	
	private static int pInstancias = 0;
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getVida() {
		return vida;
	}
	protected void setVida(int vida) {
		this.vida = vida;
	}
	protected int getMana() {
		return mana;
	}
	protected void setMana(int mana) {
		this.mana = mana;
	}
	protected float getXp() {
		return xp;
	}
	protected void setXp(float xp) {
		this.xp = xp;
	}
	protected int getInteligencia() {
		return inteligencia;
	}
	protected void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	protected int getForca() {
		return forca;
	}
	protected void setForca(int forca) {
		this.forca = forca;
	}
	protected int getLevel() {
		return level;
	}
	protected void setLevel(int level) {
		this.level = level;
	}
	protected static int getpInstancias() {
		return pInstancias;
	}
	protected static void setpInstancias(int pInstancias) {
		Personagem03.pInstancias = pInstancias;
	}
	
	protected Personagem03(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		setpInstancias(getpInstancias() + 1);
	}
	
	protected void lvlUp() {
		setLevel(getLevel() + 1);
	}
	
	protected abstract void attack();
}
