package snake;



import javax.swing.JFrame;



public class Main extends JFrame {

	DrawPane tela = new DrawPane(); 
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	Main() throws InterruptedException{
		super();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setContentPane(tela);
		setVisible(true);
		Thread.sleep(2000);
		getContentPane().update(getGraphics());
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		new Main();
	}

}
