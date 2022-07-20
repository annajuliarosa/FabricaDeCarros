package controle;


import javax.swing.JComboBox;
import javax.swing.JOptionPane;


import modelo.Carro;
import modelo.Fabrica;
import visualizacao.EntradaSaida;

public class Controladora {

	private Fabrica fabrica = null;
	private Carro carro = null;
	

	public void exibirMenu() {
			
		int opcao;
		
		this.fabrica = new Fabrica();

		do {
			
			int qtdCarros=0;
			
		
			opcao = EntradaSaida.solicitaOpcao();
			
			if(this.carro==null && opcao>0) {	
				
				do {
					JOptionPane.showMessageDialog(null, "Não há carros disponíveis");
					opcao= EntradaSaida.solicitaOpcao();
					
					
				}while(this.carro==null && opcao>0);
							
			}			

			switch (opcao) {

			case 0:			
				

				 qtdCarros = Integer.parseInt(
						JOptionPane.showInputDialog("Informe a quantidade de carros que gostaria de fabricar"));
											
				while (qtdCarros<1) {
					qtdCarros = Integer.parseInt(
							JOptionPane.showInputDialog("Valor inválido! Informe a quantidade de carros que gostaria de fabricar"));
				}
						
				for (int i = 0; i < qtdCarros; i++) {
					
					this.carro = new Carro();
			fabrica.fabricarCarro(carro);

				}

				break;

			case 1:
				
				 if (fabrica.getListaDeCarros().size()==0) {
					 JOptionPane.showMessageDialog(null, "Não há carros");
				 }else {
					
				
				String cor= fabrica.getListaDeCarros().get(0).getClass().getName();
		
				cor= cor.replaceAll(cor, "");
							
				int qtdCor= fabrica.getListaDeCarros().size();
				
				String[] coresCarros = new String[qtdCor];
			
				for (int i=0; i<qtdCor; i++) {
					
					coresCarros[i]=fabrica.getListaDeCarros().get(i).getCor();
								  
					
				}
				
				JComboBox exibicaoCor = new JComboBox(coresCarros);
				
				String msg = "Escolha o carro para comprar";
				int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoCor, msg, JOptionPane.OK_CANCEL_OPTION);
				fabrica.venderCarro(carro);
				
				 }
				
				break;

			case 2:
				 String info="";
				 
				 if (fabrica.getListaDeCarros().size()==0) {
					 JOptionPane.showMessageDialog(null, "Não há carros");
				 }else {
				for (Carro carro : fabrica.getListaDeCarros()) {
					 
					info+="Modelo: "+ carro.getModelo() + " | Cor: "+   carro.getCor()  + " | Ano: " + carro.getAno() + "\n";
					

				}
				
				fabrica.imprimeInfoCarros(carro, info);
				 }
				break;

			case 3:
				EntradaSaida.exibeMensagemEncerra();
				break;

			}

		} while (opcao != 3);
		

	}
	
}


	