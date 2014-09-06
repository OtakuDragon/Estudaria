package RegistroDeClientes;



import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



public class GUICliente extends JFrame {

	static public JPanel contentPane;
	private final JPanel panel_1 = new JPanel();
	public static HashMap<String , Cliente> bancoDeDados ;
	public static File caminho; 
	AddCliente janela;
	static Object ob;

	public static void getBanco(){
		
		
		try (FileInputStream fis = new FileInputStream(caminho)){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				bancoDeDados = (HashMap<String,Cliente>) ois.readObject();
			}catch(Exception e){e.printStackTrace();}
		
		}catch(Exception e){e.printStackTrace();}
		
		
		
		
	}
	public static void setBanco(){
	try(FileOutputStream fos = new FileOutputStream(GUICliente.caminho)){
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new HashMap<String , Cliente>());
			
			oos.close();
		
		
	}catch(IOException ex){
		
		
		ex.printStackTrace();
		
						}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, URISyntaxException {
	/*	String c = GUICliente.class.getResource("Banco/BancoDeDados.ser").toString().replace("file:/", "");
		caminho = new File(c);*/
	//setBanco();
		
		URL c = GUICliente.class.getResource("Banco/BancoDeDados.ser");
		String d = c.toString();
		
		caminho = new File(c.toURI());
		
	getBanco();
	
	
	
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICliente frame = new GUICliente();
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
	public GUICliente() {
		// localizar o arquivo serializado neste caminho
		
		addWindowListener(new WindowOnClose());
		
		setTitle("Clientes Alpha Vers\u00E3o 0.1 ");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{564, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial Black", Font.PLAIN, 18));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setRows(20);
		textArea.setColumns(30);
		panel.add(textArea);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weightx = 10.0;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 30));
		
		JButton btnNewButton = new JButton("Novo Cliente...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final AddCliente janela = new AddCliente();
				janela.setVisible(true);
				janela.btnConfirmar.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						Cliente cl = new Cliente(janela.nomeTF.getText(),janela.endereçoTF.getText(),janela.telefoneTF.getText());
						String telefone = janela.telefoneTF.getText();
						
						
						try{
						GUICliente.bancoDeDados.put(telefone,cl);
						}catch(Exception v){JOptionPane.showMessageDialog(GUICliente.contentPane,"Um Erro Ocorreu");v.printStackTrace();}
						janela.setVisible(false);
						janela.dispose();
						
					}
					
					
					
					
				});
				
			}
		});
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Cliente...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tel = JOptionPane.showInputDialog(GUICliente.contentPane, "Entre com o telefone:");
			try{
			Cliente c	= bancoDeDados.get(tel);
			String dados = "Cliente: \n" + "Nome: " + c.nome + "\n" + "Endereço: " + c.endereço;
			textArea.setText(dados);
			}catch(Exception c){
				JOptionPane.showMessageDialog(GUICliente.contentPane,"Cliente não encontrado");
			}
				
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar Tela");
		btnNewButton_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		panel_1.add(btnNewButton_2);
	}

}
