package modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

import visualizacao.EntradaSaida;

public class Fabrica {

	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}

	public void  venderCarro(Carro carro) {				
			
		listaDeCarros.remove(carro);
		
		
	}

	public void fabricarCarro(Carro carro) {
		
		carro.setCor(EntradaSaida.solicitaCor());
		carro.setModelo(EntradaSaida.solicitaModelo());
		carro.setAno(EntradaSaida.solicitaAno());
		listaDeCarros.add(carro);
				
	}

	public void imprimeInfoCarros(Carro carro, String info) {

		JOptionPane.showMessageDialog(null, info);

	}

}
