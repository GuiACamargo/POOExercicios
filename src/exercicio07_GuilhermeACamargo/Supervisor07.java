package exercicio07_GuilhermeACamargo;

public class Supervisor07 extends Funcionario07 {

	public Supervisor07(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return getSalario() + 5000.00;
	}

}
