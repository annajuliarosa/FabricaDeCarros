package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Carro;
import modelo.Fabrica;

public class EntradaSaida {
	
	
	public static int solicitaOpcao() {
		
		
		
		String[] opcoes = {"Fabricar Carros", "Vender um carro", "Ver informações do carro","Sair do programa"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
	
	return menu.getSelectedIndex();
	
		
		
	}

	public static void exibeMensagemEncerra() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
		
	}		
	
	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor do carro");
		
	}
	
	public static String solicitaModelo() {
		return JOptionPane.showInputDialog("Informe o modelo do carro");		
		
	}
	
	public static int solicitaAno() {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));	
		while (ano<1) {

		}
		
		 return ano;
		
	}

	

	

}
