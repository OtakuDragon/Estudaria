package chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import java.awt.Component;
import javax.swing.DropMode;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static Socket s;
	static InputStream is; 
	static BufferedReader in;
	static String nome;
	static JTextArea textArea;
	static PrintStream out = null;
	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {	
		
		//Pergunta o nome do usuario para a indetificação do cliente
		String temp = JOptionPane.showInputDialog("Olá Digite seu nome:");
		nome = temp.trim();
		//cria a janela com o construtor abaixo e insere um titulo com o nome do cliente
			Cliente frame = new Cliente();
			frame.setVisible(true);
			frame.setTitle("Chat - Cliente: "+ nome);
			
			
			
			
			//cria um socket
			s = new Socket("25.231.250.126",5000);
			
			is = s.getInputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			//loop de repetição que fica esperando input do servidor
			while (true){
				
				try{
				String msgRecebida = in.readLine();
				textArea.append(msgRecebida+ "\n");
				}catch(Exception e ){}
			}
		
	}

	/**
	 * Create the frame.
	 */
	public Cliente() {
		
		
		addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				
				
				
				
				
			}
			//quando a janela for fechada finaliza todos os recursos.
			@Override
			public void windowClosing(WindowEvent arg0) {
				try {
					s.close();
					is.close();
					in.close();
					
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				
				
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		textArea = new JTextArea();
		textArea.setBorder(null);
		textArea.setAlignmentY(Component.TOP_ALIGNMENT);
		textArea.setMargin(new Insets(0, 0, 0, 0));
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setColumns(30);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(15);
		
		JButton btnNewButton = new JButton("Enviar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		//Implenta o envio da mensagem ao servidor quando o botão enviar é pressionado.
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String msg = textField.getText();
				textField.setText(" ");
				out = null;
				try {
					out = new PrintStream(s.getOutputStream());
				} catch (IOException e1) {
				
					e1.printStackTrace();
				}
				out.println(nome + ": " + msg);
				
			
			}
		});
	}

}
