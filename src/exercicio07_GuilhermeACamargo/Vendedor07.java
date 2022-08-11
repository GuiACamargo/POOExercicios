package exercicio07_GuilhermeACamargo;

public class Vendedor07 extends Funcionario07 {

	public Vendedor07(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return getSalario() + 3000.00;
	}

}
