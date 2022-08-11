package exercicio02_GuilhermeACamargo;

public class Livro02 extends Produto02 implements Imposto02 {

	public Livro02(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	private String autor;
	private String tema;
	private int qtdPag;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	@Override
	public void calculaImposto() {
		double imposto = 0;
		if(getTema() == "educativo") {
			imposto = 0;
			System.out.println("Livro de tema educativo nao tem imposto! (" + getNome() + ")");
		} else {
			imposto = getPreco() * 1/10;
			System.out.println("R$" + imposto + " de impostos no livro! (" + getNome() + ")");
		}
	}
}
