
public class main {

	public static void main(String[] args) {
		
		System.out.println("Exercício Calculadora");
		Calculadora.somar(5, 5);
		Calculadora.subtrair(5, 5);
		Calculadora.multiplicacao(5, 5);
		Calculadora.divisao(5, 5);
		
		System.out.println("Exercício Mensagem");
		Mensagem.diaMensagem(2);
		Mensagem.diaMensagem(6);
		Mensagem.diaMensagem(12);
		Mensagem.diaMensagem(15);
		Mensagem.diaMensagem(19);
		
		System.out.println("Exercício Empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
