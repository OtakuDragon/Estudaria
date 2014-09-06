import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class SeriesGUI extends JFrame {

	private static JPanel contentPane;
	static ArrayList<Serie> seriesUPDT;
	static ArrayList<JLabel> Imagens;
	static ArrayList<GridBagConstraints> ImagensC;
	static ArrayList<JLabel> Episodios;
	static ArrayList<GridBagConstraints> EpisodiosC;
	static ArrayList<JLabel> Temporada;
	static ArrayList<GridBagConstraints> TemporadaC;
	static ArrayList<JButton> Mais;
	static ArrayList<GridBagConstraints> MaisC;
	static ArrayList<JButton> Finale;
	static ArrayList<GridBagConstraints> FinaleC;
	static int linha = 0;
	static int linhaserie = 0;
	static SeriesGUI frame;
	
	
	/**
	 * Launch the application.
	 * @return 
	 * @throws ClassNotFoundException 
	 */
	public static void getSeries() throws ClassNotFoundException{
		
		
		try(FileInputStream fis = new FileInputStream("Series.ser")){

		ObjectInputStream ois = new ObjectInputStream(fis);
			
		seriesUPDT = (ArrayList<Serie>) ois.readObject();
	
		
		ois.close();
		
		
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}//get series
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		SeriesGUI.getSeries();
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new SeriesGUI();
					frame.setVisible(true);
					frame.setTitle("Series");
					frame.setLocationRelativeTo(null);//Posiciona a janela no centro da tela do windows
			       frame.addWindowListener(new WindowL());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	

		
	}

	/**
	 * Create the frame.
	 */
	public SeriesGUI() {
		Border border = BorderFactory.createLineBorder(Color.BLACK,2);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 800, 935);
		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{209, 93, 103, 58};
		gbl_contentPane.rowHeights = new int[]{35, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		/* Titulo e Rotulo*/
		
		JLabel lblSeries = new JLabel("                                                                                                 Series                                                                                                               ");
		lblSeries.setOpaque(true);
		lblSeries.setBackground(Color.GREEN);
		Border border2 = BorderFactory.createLineBorder(Color.BLACK,4);
		lblSeries.setBorder(border2);
		lblSeries.setSize(600, 100);
		lblSeries.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeries.setFont(new Font("Tekton Pro Ext", Font.BOLD, 14));
		GridBagConstraints gbc_lblSeries = new GridBagConstraints();
		gbc_lblSeries.insets = new Insets(0, 0, 0, 0);
		gbc_lblSeries.weightx = 0;
		gbc_lblSeries.ipady = 50;
		gbc_lblSeries.ipadx = 110;
		gbc_lblSeries.gridwidth = 5;
		gbc_lblSeries.gridx = 0;
		gbc_lblSeries.gridy = linha;
		contentPane.add(lblSeries, gbc_lblSeries);
		
		linha++;
		
		JLabel lblCampos = new JLabel("  Serie:                                                                                                                    Temporada:    Episodio:   Assistiu?         Acabou?  ");
		lblCampos.setOpaque(true);
		lblCampos.setBackground(Color.GREEN);
		lblCampos.setBorder(border2);
		lblCampos.setSize(600, 100);
		lblCampos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampos.setFont(new Font("Tekton Pro Ext", Font.BOLD, 14));
		GridBagConstraints gbc_lblCampos = new GridBagConstraints();
		gbc_lblCampos.insets = new Insets(0, 0, 0, 0);
		gbc_lblCampos.weightx = 0;
		gbc_lblCampos.ipady = 35;
		gbc_lblCampos.ipadx = 35;
		gbc_lblCampos.gridwidth = 5;
		gbc_lblCampos.gridx = 0;
		gbc_lblCampos.gridy = linha;
		contentPane.add(lblCampos, gbc_lblCampos);
		
		
		//fim do titulo  e rotulo
		linha++;
		/*Linha 1 */
		
		JLabel lblNewLabel1 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel1.setBorder(border);
		GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
		gbc_lblNewLabel1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel1.gridx = 0;
		gbc_lblNewLabel1.gridy = linha;
		gbc_lblNewLabel1.ipadx = 0;
		gbc_lblNewLabel1.ipady = 0;
		contentPane.add(lblNewLabel1, gbc_lblNewLabel1);
		
		JLabel lblEpisodio1 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio1.setBorder(border);
		GridBagConstraints gbc_lblEpisodio1 = new GridBagConstraints();
		gbc_lblEpisodio1.ipady = 50;
		gbc_lblEpisodio1.ipadx = 80;
		gbc_lblEpisodio1.gridx = 2;
		gbc_lblEpisodio1.gridy = linha;
		contentPane.add(lblEpisodio1, gbc_lblEpisodio1);
		
		JLabel lblTemporada1 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada1.setBorder(border);
		lblTemporada1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada1 = new GridBagConstraints();
		gbc_lblTemporada1.ipady = 50;
		gbc_lblTemporada1.ipadx = 80;
		gbc_lblTemporada1.gridx = 1;
		gbc_lblTemporada1.gridy = linha;
		contentPane.add(lblTemporada1, gbc_lblTemporada1);
		
		JButton button1 = seriesUPDT.get(linhaserie).mais;
		button1.setBorder(border);
		button1.addActionListener(new Tratadora());
		GridBagConstraints gbc_button1 = new GridBagConstraints();
		gbc_button1.ipady = 50;
		gbc_button1.ipadx = 65;
		gbc_button1.gridx = 3;
		gbc_button1.gridy = linha;
		contentPane.add(button1, gbc_button1);
		
		JButton btnFinale1 = seriesUPDT.get(linhaserie).finale;
		btnFinale1.setBorder(border);
		btnFinale1.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale1 = new GridBagConstraints();
		gbc_btnFinale1.ipady = 50;
		gbc_btnFinale1.ipadx = 90;
		gbc_btnFinale1.gridx = 4;
		gbc_btnFinale1.gridy = linha;
		contentPane.add(btnFinale1, gbc_btnFinale1);
		
		//fim da linha 1
		linha++;
		linhaserie++;
		/* Linha 2 */
		
		JLabel lblNewLabel2 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel2.setBorder(border);
		GridBagConstraints gbc_lblNewLabel2 = new GridBagConstraints();
		gbc_lblNewLabel2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel2.gridx = 0;
		gbc_lblNewLabel2.gridy = linha;
		gbc_lblNewLabel2.ipadx = 0;
		gbc_lblNewLabel2.ipady = 0;
		contentPane.add(lblNewLabel2, gbc_lblNewLabel2);
		
		JLabel lblEpisodio2 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio2.setBorder(border);
		GridBagConstraints gbc_lblEpisodio2 = new GridBagConstraints();
		gbc_lblEpisodio2.ipady = 50;
		gbc_lblEpisodio2.ipadx = 80;
		gbc_lblEpisodio2.gridx = 2;
		gbc_lblEpisodio2.gridy = linha;
		contentPane.add(lblEpisodio2, gbc_lblEpisodio2);
		
		JLabel lblTemporada2 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada2.setBorder(border);
		lblTemporada2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada2 = new GridBagConstraints();
		gbc_lblTemporada2.ipady = 50;
		gbc_lblTemporada2.ipadx = 80;
		gbc_lblTemporada2.gridx = 1;
		gbc_lblTemporada2.gridy = linha;
		contentPane.add(lblTemporada2, gbc_lblTemporada2);
		
		JButton button2 = seriesUPDT.get(linhaserie).mais;
		button2.setBorder(border);
		button2.addActionListener(new Tratadora());
		GridBagConstraints gbc_button2 = new GridBagConstraints();
		gbc_button2.ipady = 50;
		gbc_button2.ipadx = 65;
		gbc_button2.gridx = 3;
		gbc_button2.gridy = linha;
		contentPane.add(button2, gbc_button2);
		
		JButton btnFinale2 = seriesUPDT.get(linhaserie).finale;
		btnFinale2.setBorder(border);
		btnFinale2.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale2 = new GridBagConstraints();
		gbc_btnFinale2.ipady = 50;
		gbc_btnFinale2.ipadx = 90;
		gbc_btnFinale2.gridx = 4;
		gbc_btnFinale2.gridy = linha;
		contentPane.add(btnFinale2, gbc_btnFinale2);
		
		//fim da linha 2
		linha++;
		linhaserie++;
		/* Linha 3 */
		
		JLabel lblNewLabel3 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel3.setBorder(border);
		GridBagConstraints gbc_lblNewLabel3 = new GridBagConstraints();
		gbc_lblNewLabel3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel3.gridx = 0;
		gbc_lblNewLabel3.gridy = linha;
		gbc_lblNewLabel3.ipadx = 0;
		gbc_lblNewLabel3.ipady = 0;
		contentPane.add(lblNewLabel3, gbc_lblNewLabel3);
		
		JLabel lblEpisodio3 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio3.setBorder(border);
		GridBagConstraints gbc_lblEpisodio3 = new GridBagConstraints();
		gbc_lblEpisodio3.ipady = 50;
		gbc_lblEpisodio3.ipadx = 73;
		gbc_lblEpisodio3.gridx = 2;
		gbc_lblEpisodio3.gridy = linha;
		contentPane.add(lblEpisodio3, gbc_lblEpisodio3);
		
		JLabel lblTemporada3 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada3.setBorder(border);
		lblTemporada3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada3 = new GridBagConstraints();
		gbc_lblTemporada3.ipady = 50;
		gbc_lblTemporada3.ipadx = 73;
		gbc_lblTemporada3.gridx = 1;
		gbc_lblTemporada3.gridy = linha;
		contentPane.add(lblTemporada3, gbc_lblTemporada3);
		
		JButton button3 = seriesUPDT.get(linhaserie).mais;
		button3.setBorder(border);
		button3.addActionListener(new Tratadora());
		GridBagConstraints gbc_button3 = new GridBagConstraints();
		gbc_button3.ipady = 50;
		gbc_button3.ipadx = 65;
		gbc_button3.gridx = 3;
		gbc_button3.gridy = linha;
		contentPane.add(button3, gbc_button3);
		
		JButton btnFinale3 = seriesUPDT.get(linhaserie).finale;
		btnFinale3.setBorder(border);
		btnFinale3.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale3 = new GridBagConstraints();
		gbc_btnFinale3.ipady = 50;
		gbc_btnFinale3.ipadx = 90;
		gbc_btnFinale3.gridx = 4;
		gbc_btnFinale3.gridy = linha;
		contentPane.add(btnFinale3, gbc_btnFinale3);
		
		
		//fim da linha 3
		
		linha++;
		linhaserie++;
		/* Linha 4 */
		
		JLabel lblNewLabel4 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel4.setBorder(border);
		GridBagConstraints gbc_lblNewLabel4 = new GridBagConstraints();
		gbc_lblNewLabel4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel4.gridx = 0;
		gbc_lblNewLabel4.gridy = linha;
		gbc_lblNewLabel4.ipadx = 0;
		gbc_lblNewLabel4.ipady = 0;
		contentPane.add(lblNewLabel4, gbc_lblNewLabel4);
		
		JLabel lblEpisodio4 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio4.setBorder(border);
		GridBagConstraints gbc_lblEpisodio4 = new GridBagConstraints();
		gbc_lblEpisodio4.ipady = 50;
		gbc_lblEpisodio4.ipadx = 80;
		gbc_lblEpisodio4.gridx = 2;
		gbc_lblEpisodio4.gridy = linha;
		contentPane.add(lblEpisodio4, gbc_lblEpisodio4);
		
		JLabel lblTemporada4 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada4.setBorder(border);
		lblTemporada4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada4 = new GridBagConstraints();
		gbc_lblTemporada4.ipady = 50;
		gbc_lblTemporada4.ipadx = 80;
		gbc_lblTemporada4.gridx = 1;
		gbc_lblTemporada4.gridy = linha;
		contentPane.add(lblTemporada4, gbc_lblTemporada4);
		
		JButton button4 = seriesUPDT.get(linhaserie).mais;
		button4.setBorder(border);
		button4.addActionListener(new Tratadora());
		GridBagConstraints gbc_button4 = new GridBagConstraints();
		gbc_button4.ipady = 50;
		gbc_button4.ipadx = 65;
		gbc_button4.gridx = 3;
		gbc_button4.gridy = linha;
		contentPane.add(button4, gbc_button4);
		
		JButton btnFinale4 = seriesUPDT.get(linhaserie).finale;
		btnFinale4.setBorder(border);
		btnFinale4.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale4 = new GridBagConstraints();
		gbc_btnFinale4.ipady = 50;
		gbc_btnFinale4.ipadx = 90;
		gbc_btnFinale4.gridx = 4;
		gbc_btnFinale4.gridy = linha;
		contentPane.add(btnFinale4, gbc_btnFinale4);
		
		//fim da linha 4
		
		linha++;
		linhaserie++;
		/* Linha 5 */
		
		JLabel lblNewLabel5 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel5.setBorder(border);
		GridBagConstraints gbc_lblNewLabel5 = new GridBagConstraints();
		gbc_lblNewLabel5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel5.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel5.gridx = 0;
		gbc_lblNewLabel5.gridy = linha;
		gbc_lblNewLabel5.ipadx = 0;
		gbc_lblNewLabel5.ipady = 0;
		contentPane.add(lblNewLabel5, gbc_lblNewLabel5);
		
		JLabel lblEpisodio5 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio5.setBorder(border);
		GridBagConstraints gbc_lblEpisodio5 = new GridBagConstraints();
		gbc_lblEpisodio5.ipady = 50;
		gbc_lblEpisodio5.ipadx = 80;
		gbc_lblEpisodio5.gridx = 2;
		gbc_lblEpisodio5.gridy = linha;
		contentPane.add(lblEpisodio5, gbc_lblEpisodio5);
		
		JLabel lblTemporada5 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada5.setBorder(border);
		lblTemporada5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada5 = new GridBagConstraints();
		gbc_lblTemporada5.ipady = 50;
		gbc_lblTemporada5.ipadx = 80;
		gbc_lblTemporada5.gridx = 1;
		gbc_lblTemporada5.gridy = linha;
		contentPane.add(lblTemporada5, gbc_lblTemporada5);
		
		JButton button5 = seriesUPDT.get(linhaserie).mais;
		button5.setBorder(border);
		button5.addActionListener(new Tratadora());
		GridBagConstraints gbc_button5 = new GridBagConstraints();
		gbc_button5.ipady = 50;
		gbc_button5.ipadx = 65;
		gbc_button5.gridx = 3;
		gbc_button5.gridy = linha;
		contentPane.add(button5, gbc_button5);
		
		JButton btnFinale5 = seriesUPDT.get(linhaserie).finale;
		btnFinale5.setBorder(border);
		btnFinale5.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale5 = new GridBagConstraints();
		gbc_btnFinale5.ipady = 50;
		gbc_btnFinale5.ipadx = 90;
		gbc_btnFinale5.gridx = 4;
		gbc_btnFinale5.gridy = linha;
		contentPane.add(btnFinale5, gbc_btnFinale5);
		
		//fim da linha 5
		
		linha++;
		linhaserie++;
		/* Linha 6 */
		
		JLabel lblNewLabel6 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel6.setBorder(border);
		GridBagConstraints gbc_lblNewLabel6 = new GridBagConstraints();
		gbc_lblNewLabel6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel6.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel6.gridx = 0;
		gbc_lblNewLabel6.gridy = linha;
		gbc_lblNewLabel6.ipadx = 0;
		gbc_lblNewLabel6.ipady = 0;
		contentPane.add(lblNewLabel6, gbc_lblNewLabel6);
		
		JLabel lblEpisodio6 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio6.setBorder(border);
		GridBagConstraints gbc_lblEpisodio6 = new GridBagConstraints();
		gbc_lblEpisodio6.ipady = 50;
		gbc_lblEpisodio6.ipadx = 73;
		gbc_lblEpisodio6.gridx = 2;
		gbc_lblEpisodio6.gridy = linha;
		contentPane.add(lblEpisodio6, gbc_lblEpisodio6);
		
		JLabel lblTemporada6 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada6.setBorder(border);
		lblTemporada6.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada6 = new GridBagConstraints();
		gbc_lblTemporada6.ipady = 50;
		gbc_lblTemporada6.ipadx = 80;
		gbc_lblTemporada6.gridx = 1;
		gbc_lblTemporada6.gridy = linha;
		contentPane.add(lblTemporada6, gbc_lblTemporada6);
		
		JButton button6 = seriesUPDT.get(linhaserie).mais;
		button6.setBorder(border);
		button6.addActionListener(new Tratadora());
		GridBagConstraints gbc_button6 = new GridBagConstraints();
		gbc_button6.ipady = 50;
		gbc_button6.ipadx = 65;
		gbc_button6.gridx = 3;
		gbc_button6.gridy = linha;
		contentPane.add(button6, gbc_button6);
		
		JButton btnFinale6 = seriesUPDT.get(linhaserie).finale;
		btnFinale6.setBorder(border);
		btnFinale6.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale6 = new GridBagConstraints();
		gbc_btnFinale6.ipady = 50;
		gbc_btnFinale6.ipadx = 90;
		gbc_btnFinale6.gridx = 4;
		gbc_btnFinale6.gridy = linha;
		contentPane.add(btnFinale6, gbc_btnFinale6);
		
		//fim da linha 6
		
		linha++;
		linhaserie++;
		/* Linha 7 */
		
		JLabel lblNewLabel7 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel7.setBorder(border);
		GridBagConstraints gbc_lblNewLabel7 = new GridBagConstraints();
		gbc_lblNewLabel7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel7.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel7.gridx = 0;
		gbc_lblNewLabel7.gridy = linha;
		gbc_lblNewLabel7.ipadx = 0;
		gbc_lblNewLabel7.ipady = 0;
		contentPane.add(lblNewLabel7, gbc_lblNewLabel7);
		
		JLabel lblEpisodio7 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio7.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio7.setBorder(border);
		GridBagConstraints gbc_lblEpisodio7 = new GridBagConstraints();
		gbc_lblEpisodio7.ipady = 50;
		gbc_lblEpisodio7.ipadx = 73;
		gbc_lblEpisodio7.gridx = 2;
		gbc_lblEpisodio7.gridy = linha;
		contentPane.add(lblEpisodio7, gbc_lblEpisodio7);
		
		JLabel lblTemporada7 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada7.setBorder(border);
		lblTemporada7.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada7 = new GridBagConstraints();
		gbc_lblTemporada7.ipady = 50;
		gbc_lblTemporada7.ipadx = 73;
		gbc_lblTemporada7.gridx = 1;
		gbc_lblTemporada7.gridy = linha;
		contentPane.add(lblTemporada7, gbc_lblTemporada7);
		
		JButton button7 = seriesUPDT.get(linhaserie).mais;
		button7.setBorder(border);
		button7.addActionListener(new Tratadora());
		GridBagConstraints gbc_button7 = new GridBagConstraints();
		gbc_button7.ipady = 50;
		gbc_button7.ipadx = 65;
		gbc_button7.gridx = 3;
		gbc_button7.gridy = linha;
		contentPane.add(button7, gbc_button7);
		
		JButton btnFinale7 = seriesUPDT.get(linhaserie).finale;
		btnFinale7.setBorder(border);
		btnFinale7.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale7 = new GridBagConstraints();
		gbc_btnFinale7.ipady = 50;
		gbc_btnFinale7.ipadx = 90;
		gbc_btnFinale7.gridx = 4;
		gbc_btnFinale7.gridy = linha;
		contentPane.add(btnFinale7, gbc_btnFinale7);
		
		//fim da linha 7
		
		linha++;
		linhaserie++;
		/* Linha 8 */
		
		JLabel lblNewLabel8 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel8.setBorder(border);
		GridBagConstraints gbc_lblNewLabel8 = new GridBagConstraints();
		gbc_lblNewLabel8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel8.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel8.gridx = 0;
		gbc_lblNewLabel8.gridy = linha;
		gbc_lblNewLabel8.ipadx = 0;
		gbc_lblNewLabel8.ipady = 0;
		contentPane.add(lblNewLabel8, gbc_lblNewLabel8);
		
		JLabel lblEpisodio8 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio8.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio8.setBorder(border);
		GridBagConstraints gbc_lblEpisodio8 = new GridBagConstraints();
		gbc_lblEpisodio8.ipady = 50;
		gbc_lblEpisodio8.ipadx = 73;
		gbc_lblEpisodio8.gridx = 2;
		gbc_lblEpisodio8.gridy = linha;
		contentPane.add(lblEpisodio8, gbc_lblEpisodio8);
		
		JLabel lblTemporada8 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada8.setBorder(border);
		lblTemporada8.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada8 = new GridBagConstraints();
		gbc_lblTemporada8.ipady = 50;
		gbc_lblTemporada8.ipadx = 80;
		gbc_lblTemporada8.gridx = 1;
		gbc_lblTemporada8.gridy = linha;
		contentPane.add(lblTemporada8, gbc_lblTemporada8);
		
		JButton button8 = seriesUPDT.get(linhaserie).mais;
		button8.setBorder(border);
		button8.addActionListener(new Tratadora());
		GridBagConstraints gbc_button8 = new GridBagConstraints();
		gbc_button8.ipady = 50;
		gbc_button8.ipadx = 65;
		gbc_button8.gridx = 3;
		gbc_button8.gridy = linha;
		contentPane.add(button8, gbc_button8);
		
		JButton btnFinale8 = seriesUPDT.get(linhaserie).finale;
		btnFinale8.setBorder(border);
		btnFinale8.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale8 = new GridBagConstraints();
		gbc_btnFinale8.ipady = 50;
		gbc_btnFinale8.ipadx = 90;
		gbc_btnFinale8.gridx = 4;
		gbc_btnFinale8.gridy = linha;
		contentPane.add(btnFinale8, gbc_btnFinale8);
		
		//fim da linha 8
		
		linha++;
		linhaserie++;
		/* Linha 9 */
		
		JLabel lblNewLabel9 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel9.setBorder(border);
		GridBagConstraints gbc_lblNewLabel9 = new GridBagConstraints();
		gbc_lblNewLabel9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel9.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel9.gridx = 0;
		gbc_lblNewLabel9.gridy = linha;
		gbc_lblNewLabel9.ipadx = 0;
		gbc_lblNewLabel9.ipady = 0;
		contentPane.add(lblNewLabel9, gbc_lblNewLabel9);
		
		JLabel lblEpisodio9 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio9.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio9.setBorder(border);
		GridBagConstraints gbc_lblEpisodio9 = new GridBagConstraints();
		gbc_lblEpisodio9.ipady = 50;
		gbc_lblEpisodio9.ipadx = 80;
		gbc_lblEpisodio9.gridx = 2;
		gbc_lblEpisodio9.gridy = linha;
		contentPane.add(lblEpisodio9, gbc_lblEpisodio9);
		
		JLabel lblTemporada9 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada9.setBorder(border);
		lblTemporada9.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada9 = new GridBagConstraints();
		gbc_lblTemporada9.ipady = 50;
		gbc_lblTemporada9.ipadx = 80;
		gbc_lblTemporada9.gridx = 1;
		gbc_lblTemporada9.gridy = linha;
		contentPane.add(lblTemporada9, gbc_lblTemporada9);
		
		JButton button9 = seriesUPDT.get(linhaserie).mais;
		button9.setBorder(border);
		button9.addActionListener(new Tratadora());
		GridBagConstraints gbc_button9 = new GridBagConstraints();
		gbc_button9.ipady = 50;
		gbc_button9.ipadx = 65;
		gbc_button9.gridx = 3;
		gbc_button9.gridy = linha;
		contentPane.add(button9, gbc_button9);
		
		JButton btnFinale9 = seriesUPDT.get(linhaserie).finale;
		btnFinale9.setBorder(border);
		btnFinale9.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale9 = new GridBagConstraints();
		gbc_btnFinale9.ipady = 50;
		gbc_btnFinale9.ipadx = 90;
		gbc_btnFinale9.gridx = 4;
		gbc_btnFinale9.gridy = linha;
		contentPane.add(btnFinale9, gbc_btnFinale9);
		
		//fim da linha 9
		
		linha++;
		linhaserie++;
		/* Linha 10 */
		
		JLabel lblNewLabel10 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel10.setBorder(border);
		GridBagConstraints gbc_lblNewLabel10 = new GridBagConstraints();
		gbc_lblNewLabel10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel10.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel10.gridx = 0;
		gbc_lblNewLabel10.gridy = linha;
		gbc_lblNewLabel10.ipadx = 0;
		gbc_lblNewLabel10.ipady = 0;
		contentPane.add(lblNewLabel10, gbc_lblNewLabel10);
		
		JLabel lblEpisodio10 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio10.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio10.setBorder(border);
		GridBagConstraints gbc_lblEpisodio10 = new GridBagConstraints();
		gbc_lblEpisodio10.ipady = 50;
		gbc_lblEpisodio10.ipadx = 65;
		gbc_lblEpisodio10.gridx = 2;
		gbc_lblEpisodio10.gridy = linha;
		contentPane.add(lblEpisodio10, gbc_lblEpisodio10);
		
		JLabel lblTemporada10 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada10.setBorder(border);
		lblTemporada10.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada10 = new GridBagConstraints();
		gbc_lblTemporada10.ipady = 50;
		gbc_lblTemporada10.ipadx = 71;
		gbc_lblTemporada10.gridx = 1;
		gbc_lblTemporada10.gridy = linha;
		contentPane.add(lblTemporada10, gbc_lblTemporada10);
		
		JButton button10 = seriesUPDT.get(linhaserie).mais;
		button10.setBorder(border);
		button10.addActionListener(new Tratadora());
		GridBagConstraints gbc_button10 = new GridBagConstraints();
		gbc_button10.ipady = 50;
		gbc_button10.ipadx = 65;
		gbc_button10.gridx = 3;
		gbc_button10.gridy = linha;
		contentPane.add(button10, gbc_button10);
		
		JButton btnFinale10 = seriesUPDT.get(linhaserie).finale;
		btnFinale10.setBorder(border);
		btnFinale10.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale10 = new GridBagConstraints();
		gbc_btnFinale10.ipady = 50;
		gbc_btnFinale10.ipadx = 90;
		gbc_btnFinale10.gridx = 4;
		gbc_btnFinale10.gridy = linha;
		contentPane.add(btnFinale10, gbc_btnFinale10);
		
		//fim da linha 10
		
		linha++;
		linhaserie++;
		/* Linha 11 */
		
		JLabel lblNewLabel11 = seriesUPDT.get(linhaserie).imagem;
		
		lblNewLabel11.setBorder(border);
		GridBagConstraints gbc_lblNewLabel11 = new GridBagConstraints();
		gbc_lblNewLabel11.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel11.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel11.gridx = 0;
		gbc_lblNewLabel11.gridy = linha;
		gbc_lblNewLabel11.ipadx = 0;
		gbc_lblNewLabel11.ipady = 0;
		contentPane.add(lblNewLabel11, gbc_lblNewLabel11);
		
		JLabel lblEpisodio11 = seriesUPDT.get(linhaserie).episodio;
		lblEpisodio11.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodio11.setBorder(border);
		GridBagConstraints gbc_lblEpisodio11 = new GridBagConstraints();
		gbc_lblEpisodio11.ipady = 50;
		gbc_lblEpisodio11.ipadx = 73;
		gbc_lblEpisodio11.gridx = 2;
		gbc_lblEpisodio11.gridy = linha;
		contentPane.add(lblEpisodio11, gbc_lblEpisodio11);
		
		JLabel lblTemporada11 = seriesUPDT.get(linhaserie).temporada;
		
		lblTemporada11.setBorder(border);
		lblTemporada11.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTemporada11 = new GridBagConstraints();
		gbc_lblTemporada11.ipady = 50;
		gbc_lblTemporada11.ipadx = 80;
		gbc_lblTemporada11.gridx = 1;
		gbc_lblTemporada11.gridy = linha;
		contentPane.add(lblTemporada11, gbc_lblTemporada11);
		
		JButton button11 = seriesUPDT.get(linhaserie).mais;
		button11.setBorder(border);
		button11.addActionListener(new Tratadora());
		GridBagConstraints gbc_button11 = new GridBagConstraints();
		gbc_button11.ipady = 50;
		gbc_button11.ipadx = 65;
		gbc_button11.gridx = 3;
		gbc_button11.gridy = linha;
		contentPane.add(button11, gbc_button11);
		
		JButton btnFinale11 = seriesUPDT.get(linhaserie).finale;
		btnFinale11.setBorder(border);
		btnFinale11.addActionListener(new Tratadora());
		GridBagConstraints gbc_btnFinale11 = new GridBagConstraints();
		gbc_btnFinale11.ipady = 50;
		gbc_btnFinale11.ipadx = 90;
		gbc_btnFinale11.gridx = 4;
		gbc_btnFinale11.gridy = linha;
		contentPane.add(btnFinale11, gbc_btnFinale11);
		
		//fim da linha 11
		
	}// fim do construtor SeriesGUI
	
	
		
		
		
	
	
}//Fim da classe Series GUI
