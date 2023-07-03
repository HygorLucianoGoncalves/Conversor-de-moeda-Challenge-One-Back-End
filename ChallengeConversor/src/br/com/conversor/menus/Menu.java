package br.com.conversor.menus;

import javax.swing.JOptionPane;

import br.com.conversor.moeda.Taxas;
import br.com.conversor.temperatura.Temperaturas;

public class Menu {

	public void ChamaMenu() {
		String[] opcaoDeEscolhaConversor = { "Conversor de Moeda", "Conversor de Temperatura" };

		// CAIXA DE MENU
		String entrada = (String) JOptionPane.showInputDialog(null, "Escolha uma opçao", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opcaoDeEscolhaConversor, opcaoDeEscolhaConversor[0]);

		// CAIXA DE CONVEÇÃO DINHEIRO
		if (entrada == opcaoDeEscolhaConversor[0]) {
			Taxas t = new Taxas();
			t.OpcaoMoeda();			
		}else if (entrada == opcaoDeEscolhaConversor[1]) {
			Temperaturas t1 = new Temperaturas();
			t1.ChamaTemp();
		}
	}
}
