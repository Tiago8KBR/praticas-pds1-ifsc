package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class exercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNumero;
	private JTextField textResultado;
	private JLabel lblNewLabel;
	
	private ArrayList<Double> numeros = new ArrayList<>();
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio1 frame = new exercicio1();
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
	public exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBounds(20, 125, 367, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		textNumero = new JTextField();
		textNumero.setBounds(92, 63, 140, 20);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		lblNewLabel = new JLabel("Numero:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 63, 62, 17);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num = textNumero.getText();
				Double numero = Double.valueOf(num);
				numeros.add(numero);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(259, 63, 128, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIBIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(numeros.toString());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(146, 156, 114, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Numeros");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(164, 100, 82, 14);
		contentPane.add(lblNewLabel_1);
	}
}
