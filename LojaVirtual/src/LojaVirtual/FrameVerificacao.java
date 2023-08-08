package LojaVirtual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameVerificacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameVerificacao frame = new FrameVerificacao();
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
	public FrameVerificacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 180);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(196, 194, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voc\u00EA tem certeza?");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel.setBounds(152, 22, 154, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnverificacaoNao = new JButton("N\u00E3o");
		btnverificacaoNao.setBounds(239, 67, 89, 23);
		contentPane.add(btnverificacaoNao);
		
		btnverificacaoNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePadrao frame = new FramePadrao();
				frame.setVisible(true);
				dispose();
			}
		});
			
		JButton btnVerficacaoSim = new JButton("Sim");
		btnVerficacaoSim.setBounds(102, 67, 89, 23);
		contentPane.add(btnVerficacaoSim);
		
		btnVerficacaoSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame frame = new MainFrame();
				frame.setVisible(true);
				dispose();		
			}
		});
		
	}

}
