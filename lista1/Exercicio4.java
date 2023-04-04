package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textCampotexto1;
	private JTextField textCampotexto2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCampotexto1 = new JTextField();
		textCampotexto1.setBounds(112, 76, 86, 20);
		contentPane.add(textCampotexto1);
		textCampotexto1.setColumns(10);
		
		textCampotexto2 = new JTextField();
		textCampotexto2.setBounds(208, 76, 86, 20);
		contentPane.add(textCampotexto2);
		textCampotexto2.setColumns(10);
		
		JButton btnNewBotão1 = new JButton("+");
		btnNewBotão1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textCampotexto1.getText();
				String num2 = textCampotexto2.getText();
				
				Double n1 = Double.valueOf(num1);
				Double n2 = Double.valueOf(num2);
				
				Double soma = n1 + n2;
				
				JOptionPane.showMessageDialog(btnNewBotão1,"A soma dos números é " + soma);
			}
		});
		btnNewBotão1.setBounds(10, 164, 89, 23);
		contentPane.add(btnNewBotão1);
		
		JButton btnNewBotão2 = new JButton("*");
		btnNewBotão2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nu1 = textCampotexto1.getText();
				String nu2 = textCampotexto2.getText();
				
				Double N1 = Double.valueOf(nu1);
				Double N2 = Double.valueOf(nu2);
				
				Double multiplicacao = N1 * N2;
				
				JOptionPane.showMessageDialog(btnNewBotão1,"A multiplicação dos números é " + multiplicacao);
			}
		});
		btnNewBotão2.setBounds(112, 164, 89, 23);
		contentPane.add(btnNewBotão2);
		
		JButton btnNewBotão3 = new JButton("/");
		btnNewBotão3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Num1 = textCampotexto1.getText();
			String Num2 = textCampotexto2.getText();
			
			Double Nu1 = Double.valueOf(Num1);
			Double Nu2 = Double.valueOf(Num2);
			
			Double divisao = Nu1 / Nu2;
			
			JOptionPane.showMessageDialog(btnNewBotão1,"A divisão dos números é " + divisao);
			}
		});
		btnNewBotão3.setBounds(208, 164, 89, 23);
		contentPane.add(btnNewBotão3);
		
		JButton btnNewBotão4 = new JButton("-");
		btnNewBotão4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nun1 = textCampotexto1.getText();
				String Nun2 = textCampotexto2.getText();
				
				Double N1 = Double.valueOf(Nun1);
				Double N2 = Double.valueOf(Nun2);
				
				Double subtracao = N1 - N2;
				
				JOptionPane.showMessageDialog(btnNewBotão1,"A subtração dos números é " + subtracao);
			}
		});
		btnNewBotão4.setBounds(307, 164, 89, 23);
		contentPane.add(btnNewBotão4);
	}

}
