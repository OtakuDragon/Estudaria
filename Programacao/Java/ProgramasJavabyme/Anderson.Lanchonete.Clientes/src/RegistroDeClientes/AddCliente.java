package RegistroDeClientes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AddCliente extends JFrame {

	private JPanel contentPane;
	public JTextField nomeTF;
	public JTextField endereçoTF;
	public JTextField telefoneTF;
	static HashMap<String , Cliente> bancoDeDados;
	public JButton btnConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCliente frame = new AddCliente();
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
	public AddCliente() {
		setTitle("Adicionar Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("  Nome:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 1.0;
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		nomeTF = new JTextField();
		nomeTF.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_nomeTF = new GridBagConstraints();
		gbc_nomeTF.anchor = GridBagConstraints.WEST;
		gbc_nomeTF.insets = new Insets(0, 0, 5, 0);
		gbc_nomeTF.gridx = 1;
		gbc_nomeTF.gridy = 0;
		contentPane.add(nomeTF, gbc_nomeTF);
		nomeTF.setColumns(30);
		
		JLabel lblNewLabel_1 = new JLabel("  Endere\u00E7o:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 1.0;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		endereçoTF = new JTextField();
		endereçoTF.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_endereçoTF = new GridBagConstraints();
		gbc_endereçoTF.anchor = GridBagConstraints.WEST;
		gbc_endereçoTF.insets = new Insets(0, 0, 5, 0);
		gbc_endereçoTF.gridx = 1;
		gbc_endereçoTF.gridy = 1;
		contentPane.add(endereçoTF, gbc_endereçoTF);
		endereçoTF.setColumns(30);
		
		JLabel lblNewLabel_2 = new JLabel("  Telefone:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 1.0;
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		telefoneTF = new JTextField();
		telefoneTF.setHorizontalAlignment(SwingConstants.LEFT);
		telefoneTF.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_telefoneTF = new GridBagConstraints();
		gbc_telefoneTF.anchor = GridBagConstraints.WEST;
		gbc_telefoneTF.insets = new Insets(0, 0, 5, 0);
		gbc_telefoneTF.gridx = 1;
		gbc_telefoneTF.gridy = 2;
		contentPane.add(telefoneTF, gbc_telefoneTF);
		telefoneTF.setColumns(30);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_panel.gridwidth = 2;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}//action performed
		});
		panel.add(btnConfirmar);
	}

}

