package ex1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		String precoLitro = JOptionPane.showInputDialog("Insira preço do litro: ");

		String quantidadeLitro = JOptionPane.showInputDialog("Insira quantidade de litros: ");

		// Converter em numero
		Double preco = Double.valueOf(precoLitro);
		Double qtd = Double.valueOf(quantidadeLitro);

		// SEGUNDO PASSO: Substituir (qtd * preco)
		// pela funcao criada (CHAMAR ou USAR a funcao)

		JOptionPane.showMessageDialog(null, "O valor a pagar é: " + valoraagar(preco, qtd));

	}

	public static double valoraagar(Double precoLitro, Double quantidadeLitro) {

		return (precoLitro * quantidadeLitro);

	}

}
