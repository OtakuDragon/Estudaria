package CalcGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tratadora implements ActionListener {
	
	static Tela monitor = Calculadora.getTela();
	static String TextoAtual = "";
	static String operacao;
	static boolean pnBool = false;
	static boolean snBool = false;
	static String pn;
	static String sn;
	Tratadora(){
		monitor.setText(TextoAtual);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Teclado.um){
			TextoAtual +=  "1";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.dois){
			TextoAtual +=  "2";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.tres){
			TextoAtual +=  "3";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.quatro){
			TextoAtual +=  "4";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.cinco){
			TextoAtual +=  "5";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.seis){
			TextoAtual +=  "6";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.sete){
			TextoAtual +=  "7";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.oito){
			TextoAtual +=  "8";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.nove){
			TextoAtual +=  "9";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.zero){
			TextoAtual +=  "0";
			monitor.setText(TextoAtual);
			
		}if(e.getSource() == Teclado.mais){
			monitor.setText("");
			operacao ="+";
			if (pnBool == false){
				pn = TextoAtual;
				pnBool = true;
				TextoAtual = "";
			}
			
		}if(e.getSource() == Teclado.menos){
			
			monitor.setText("");
			operacao ="-";
			if (pnBool == false){
				pn = TextoAtual;
				pnBool = true;
				TextoAtual = "";
			}
			
		}if(e.getSource() == Teclado.multiplicacao){
			
			monitor.setText("");
			operacao = "*";
			if (pnBool == false){
				pn = TextoAtual;
				pnBool = true;
				TextoAtual = "";
			}
			
		}if(e.getSource() == Teclado.divisao){
			
			monitor.setText("");
			operacao = "/";
			if (pnBool == false){
				pn = TextoAtual;
				pnBool = true;
				TextoAtual = "";
			}
			
			
		}if(e.getSource() == Teclado.clear){
			
			monitor.setText("");
			TextoAtual = "";
			pnBool = false;
			pn = "";
			snBool = false;
			sn = "";
			
			
			
			
			
		}if(e.getSource() == Teclado.igual){
			
			if (snBool == false){ sn = TextoAtual;
			snBool=true;
		       TextoAtual = "";}
			
		
			
			int num1 = Integer.parseInt(pn);
			int num2 = Integer.parseInt(sn);
			
			Integer soma = num1 + num2;
			Integer subtracao = num1 - num2;
			Integer multiplicacao = num1 * num2;
			Float divisao = (float) (num1 / num2);
			
			if (operacao.equals("+")){
				monitor.setText(soma.toString());
			}else if (operacao.equals("*")){
				monitor.setText(multiplicacao.toString());
			}else if (operacao.equals("-")){
				monitor.setText(subtracao.toString());
			}else if(operacao.equals("/")){
					monitor.setText(divisao.toString());
			}
				
			
			
		}//fim do ultimo if
		
	}//fim actionPerformed

}//fim da classe
