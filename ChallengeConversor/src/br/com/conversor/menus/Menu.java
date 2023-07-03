package br.com.conversor.menus;

import javax.swing.JOptionPane;

import br.com.conversor.moeda.Taxas;
import br.com.conversor.quilometragem.Quilometragem;
import br.com.conversor.temperatura.Temperaturas;

public class Menu {
	Taxas t = new Taxas();
	Temperaturas t1 = new Temperaturas();
	Quilometragem t2 = new Quilometragem();

	public void ChamaMenu() {
		String[] opcaoDeEscolhaConversor = { "Conversor de Moeda", "Conversor de Temperatura",
				"Conversor de Quilometragem" };

		// CAIXA DE MENU
		String entrada = (String) JOptionPane.showInputDialog(null, "Escolha uma opçao", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opcaoDeEscolhaConversor, opcaoDeEscolhaConversor[0]);

		// CAIXA DE CONVEÇÃO
		if (entrada == opcaoDeEscolhaConversor[0])
			t.OpcaoMoeda();
		else if (entrada == opcaoDeEscolhaConversor[1])
			t1.ChamaTemp();
		else if (entrada == opcaoDeEscolhaConversor[2])
			t2.ChamaKM();

	}
}
