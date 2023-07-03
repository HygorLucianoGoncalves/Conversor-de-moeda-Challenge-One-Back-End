package br.com.conversor.moeda;

import javax.swing.JOptionPane;

public class Taxas {

	public void OpcaoMoeda() {
		try {

			// PEGA O VALOR
			double dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));

			// OPÇÂO DE MOEDAS
			String[] opcaoDeMoeda = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
					"De Reais a Won Correano", "De Dólares a Reais", "De Euro a Real", "De Libras a Reais",
					"De Yenes a Reais", "De Won Coreano a Reais" };

			double[] taxas = { 5.00, 5.24, 6.09, 0.033, 0.036, 1 / 5.00, 1 / 5.24, 1 / 6.09, 1 / 0.033, 1 / 0.0, 036 };

			String menuMoeda = (String) JOptionPane.showInputDialog(null,
					"Escolha a moeda para qual você deseja converter seu dinheiro", "Moedas",
					JOptionPane.QUESTION_MESSAGE, null, opcaoDeMoeda, opcaoDeMoeda[0]);

			int indice = -1;
			
			//INDICE VAI CHAMA O VALORES NA TAXAS
			for (int i = 0; i < opcaoDeMoeda.length; i++) {
				if (menuMoeda.equals(opcaoDeMoeda[i])) {
					indice = i;
					break;
				}
			}
			if (indice <= 5) {
				double taxa = dinheiro / taxas[indice];
				JOptionPane.showMessageDialog(null,
						"A conversão " + opcaoDeMoeda[indice] + String.format("%s = %.2f", "", taxa));
			} else if (indice > 5) {
				double taxa = dinheiro * taxas[indice];
				JOptionPane.showMessageDialog(null,
						"A conversão " + opcaoDeMoeda[indice] + String.format("%s = %.2f", "", taxa));
			} else {
				JOptionPane.showMessageDialog(null, "Erro no valor informado");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro no valor informado");

		}

	}

}
