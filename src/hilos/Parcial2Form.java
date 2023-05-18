package hilos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Parcial2Form extends JFrame {

	private JPanel contentPane;
	private JLabel hilo1Label;
	private JLabel hilo2Label;
	private JLabel hilo3Label;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parcial2Form frame = new Parcial2Form();
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
	public Parcial2Form() {
		setTitle("Parcial2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Activar Cronometro");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JLabel hilo1Label = new JLabel("New label");
				hilo1Label.setBounds(29, 114, 84, 29);
				contentPane.add(hilo1Label);
				
				JLabel hilo2Label = new JLabel("New label");
				hilo2Label.setBounds(159, 114, 71, 29);
				contentPane.add(hilo2Label);
				
				JLabel hilo3Label = new JLabel("New label");
				hilo3Label.setBounds(285, 114, 70, 29);
				contentPane.add(hilo3Label);

				Thread thread1 = new Thread(new Cronometro(1, hilo1Label));
				Thread thread2 = new Thread(new Cronometro(2, hilo2Label));
				Thread thread3 = new Thread(new Cronometro(3, hilo3Label));
				
				thread1.start();
				thread2.start();
				thread3.start();
			}
			
		});
		btnNewButton.setBounds(79, 38, 276, 40);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Hilo1");
		lblNewLabel_3.setBounds(29, 89, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hilo2");
		lblNewLabel_4.setBounds(159, 89, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hilo3");
		lblNewLabel_5.setBounds(285, 89, 46, 14);
		contentPane.add(lblNewLabel_5);
	}
	public void setHilo1LabelText(String text) {
	    hilo1Label.setText(text);
	}

	public void setHilo2LabelText(String text) {
	    hilo2Label.setText(text);
	}

	public void setHilo3LabelText(String text) {
	    hilo3Label.setText(text);
	}
}
