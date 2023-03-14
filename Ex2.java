package exe2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex2 
{
	public static void main(String[]args) 
	{
	
		ArrayList<String> exercicios = new ArrayList(); 
		
		for (int i = 0; i < 10; i++) {
			exercicios.add(JOptionPane.showInputDialog("Qual é o Exercicio"));
		}
		
		JOptionPane.showMessageDialog(null, exercicios);
		
	}

	

}
