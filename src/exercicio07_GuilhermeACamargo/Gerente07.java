package exercicio07_GuilhermeACamargo;

public class Gerente07 extends Funcionario07 {

	public Gerente07(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return  getSalario() + 10000.00;
	}

}
