package exercicio07_GuilhermeACamargo;

public abstract class Funcionario07 {
	private String nome;
	private int idade;
	private double salario;

	public Funcionario07(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	protected double bonificacao() {
		return salario + 0;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

}
