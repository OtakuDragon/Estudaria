

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Serie implements Serializable {
	ImageIcon logo;
	String nome;
	String nomeabrev;
	JLabel 	imagem;
	JLabel episodio;
	JLabel temporada;
	JButton mais;
	JButton finale;
	static ArrayList<Serie> Series;
	
	Serie(String nome,String nomeabrev,String temporada,
		String episodio){
		
		
		this.nome = nome;
		this.nomeabrev = nomeabrev;
		this.logo = new ImageIcon(getClass().getResource("SeriesPck/Logos/"+ nomeabrev +".jpg"));
		this.imagem = new JLabel(this.logo);
		this.episodio =new JLabel(episodio);
		this.temporada =new JLabel(temporada);
		this.mais = new JButton("+");
		this.finale = new JButton("Finale");
		
		
		
		
		
		
		
		
	}
	
	public static void setSeries(){
		Serie americanHorrorStory = new Serie("American Horror Story","ahs","3","1");
		Serie breakingBad = new Serie("Breaking Bad","bb","5","9");
		Serie familyGuy = new Serie("Family Guy","fg","11","16");
		Serie gameOfThrones = new Serie("Game Of Thrones","got","3","2");
		Serie rulesOfEngagement = new Serie("Rules Of Engagement","roe","7","8");
		Serie supernatural = new Serie("Supernatural","spn","8","17");
		Serie twoAndAHalfMen = new Serie("Two And A Half Men","tahm","10","20");
		Serie theBigBangTheory = new Serie("The Big Bang Theory","tbbt","6","20");
		Serie theWalkingDead = new Serie("The Walking Dead","twd","4","1");
		Serie naruto = new Serie("Naruto","naruto","XX","268");
		Serie howIMetYourMother = new Serie("How I Met Your Mother","himym","8","21");
		
		Series = new ArrayList<Serie>();
		
		Series.add(americanHorrorStory);
		Series.add(breakingBad);
		Series.add(familyGuy);
		Series.add(gameOfThrones);
		Series.add(rulesOfEngagement);
		Series.add(supernatural);
		Series.add(twoAndAHalfMen);
		Series.add(theBigBangTheory);
		Series.add(theWalkingDead);
		Series.add(naruto);
		Series.add(howIMetYourMother);
		
		
		
		try(FileOutputStream fos = new FileOutputStream("D:/Users/Gilson/workspace/SeriesProj2/src/ArrayList/Series.ser")){
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(Series);
				
				oos.close();
			
			
		}catch(IOException e){
			
			
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
	}	
	
	
	
	
	
	

}
