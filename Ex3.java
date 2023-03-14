package exe3;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Qual foi a nota da primeira prova");
		String nota2 = JOptionPane.showInputDialog("Qual foi a nota da primeira prova");
		String nota3 = JOptionPane.showInputDialog("Qual foi a nota da primeira prova");

		Double n1 = Double.valueOf(nota1);
		Double n2 = Double.valueOf(nota2);
		Double n3 = Double.valueOf(nota3);

		Double notafinal = notafinal(n1, n2, n3);

		JOptionPane.showMessageDialog(null, "A nota final é " + notafinal);
		
		if (notafinal >= 60) {
			JOptionPane.showMessageDialog(null, "Você está passado");
		} else {
			JOptionPane.showMessageDialog(null, "Você não passou");
		}

	}

	public static double notafinal(Double n1, Double n2, Double n3) {
		return ((n1 * n2 * n3) / 3);
	}

}