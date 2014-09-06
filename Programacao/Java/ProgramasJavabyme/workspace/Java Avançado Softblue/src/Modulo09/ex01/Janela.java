package Modulo09.ex01;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Properties props;
	private JComboBox comboBox;
	private JCheckBox chckbxNewCheckBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Janela frame = new Janela();
		frame.setVisible(true);
		
		
				
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowListener(){

			@Override
			public void windowOpened(WindowEvent e) {
				props = new Properties();

				try {
					FileInputStream fis = new FileInputStream("config.txt");
					props.load(fis);
					fis.close();
				} catch (FileNotFoundException e1) {
					
					e1.getMessage();
				} catch (IOException e1) {
					
					e1.getMessage();
				}
				if(props.getProperty("nome").equals("vazio")){
					
				}else{ 
					textField.setText(props.getProperty("nome"));
					textField_1.setText(props.getProperty("idade"));
					comboBox.setSelectedItem(props.getProperty("sexo"));
					if(props.getProperty("praticaEsportes").equals("sim")){
					chckbxNewCheckBox.setSelected(true);
					}else{chckbxNewCheckBox.setSelected(false);}
					
				}
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					FileOutputStream fos = new FileOutputStream("config.txt");
					props.store(fos,"");
					fos.close();
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				setVisible(false);
				dispose();
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnOk = new JButton("OK");
		btnOk.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnOk.setHorizontalAlignment(SwingConstants.RIGHT);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				props.setProperty("nome", textField.getText());
				props.setProperty("idade", textField_1.getText());
				props.setProperty("sexo", comboBox.getSelectedItem().toString());
				String value = null;
				if (chckbxNewCheckBox.isSelected()){
					value = "sim";
				}else{value ="nao";}
				props.setProperty("praticaEsportes", value);
				try {
					FileOutputStream fos = new FileOutputStream("config.txt");
					props.store(fos,"");
					fos.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
				dispose();
				
			}
		});
		panel_1.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setAlignmentX(3.0f);
		btnCancel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnCancel);
		btnCancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.setName("");
		panel.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{150, 246, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNome = new JLabel("Nome :");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(20, 80, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		panel.add(lblNome, gbc_lblNome);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(20, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(20);
		
		JLabel lblIdade = new JLabel("Idade:");
		GridBagConstraints gbc_lblIdade = new GridBagConstraints();
		gbc_lblIdade.anchor = GridBagConstraints.EAST;
		gbc_lblIdade.insets = new Insets(0, 80, 5, 5);
		gbc_lblIdade.gridx = 0;
		gbc_lblIdade.gridy = 1;
		panel.add(lblIdade, gbc_lblIdade);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(3);
		
		JLabel lblSexo = new JLabel("Sexo:");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.insets = new Insets(0, -5, 5, 5);
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 2;
		panel.add(lblSexo, gbc_lblSexo);
		
		
		String[] ops ={"Masculino","Feminino"};
		comboBox = new JComboBox(ops);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblPraticaEsportes = new JLabel("Pratica esportes:");
		GridBagConstraints gbc_lblPraticaEsportes = new GridBagConstraints();
		gbc_lblPraticaEsportes.anchor = GridBagConstraints.EAST;
		gbc_lblPraticaEsportes.insets = new Insets(0, 0, 0, 5);
		gbc_lblPraticaEsportes.gridx = 0;
		gbc_lblPraticaEsportes.gridy = 3;
		panel.add(lblPraticaEsportes, gbc_lblPraticaEsportes);
		
		chckbxNewCheckBox = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 3;
		panel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
	}

}
