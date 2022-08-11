package exercicio02_GuilhermeACamargo;

import java.util.*;

public class Loja02 {
	private String nome;
	private String cnpj;
	private List<Livro02> livros;
	private List<VideoGame02> videoGames;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro02> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro02> livros) {
		this.livros = livros;
	}
	public List<VideoGame02> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<VideoGame02> videoGames) {
		this.videoGames = videoGames;
	}
	
	public Loja02(String nome, String cnpj, List<Livro02> livros, List<VideoGame02> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		System.out.println("A loja Casas Bahia possui estes livros para venda:");
		for(int i = 0; i < livros.size(); i++) {
			if (livros.size() != 0) {
				System.out.println("Titulo: " + livros.get(i).getNome() + ", preco: " + livros.get(i).getPreco() + ", quantidade: " + livros.get(i).getQtd() + " em estoque.");
			} else {
				System.out.println("A loja não tem livros em seu estoque.");
			}
		}
	}
	
	public void listaVideoGames() {
		System.out.println("A loja Casas Bahia possui estes video-games para venda:");
		for(int i = 0; i < videoGames.size(); i++) {
		if (videoGames.size() != 0) {
				System.out.println("Video-game: " + videoGames.get(i).getNome() + " " + videoGames.get(i).getModelo() + ", preco: " + videoGames.get(i).getPreco() + ", quantidade: " + videoGames.get(i).getQtd() + " em estoque.");
			} else {
				System.out.println("A loja não tem consoles em seu estoque.");
			}
		}
	}
	
	public double calculaPatrimonio() {
		double multVideo = 0;
		for(int i = 0; i < videoGames.size(); i++) {
			multVideo = multVideo + (videoGames.get(i).getPreco() * videoGames.get(i).getQtd());
		}
		double multLivros = 0;
		for(int i = 0; i < livros.size(); i++) {
			multLivros = multLivros + (livros.get(i).getPreco() * livros.get(i).getQtd());
		}
		double total = multVideo + multLivros;
		System.out.println("O patrimonio da loja " + getNome() + " e de: R$");
		return total;
	}
}
