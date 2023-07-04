package br.com.conversor.moeda;

import javax.swing.JOptionPane;

public class Taxas {

	public void OpcaoMoeda() {
		try {

			// OPÇÂO DE MOEDAS
			String[] opcaoDeMoeda = { 
					"De Reais a Dólares",
					"De Reais a Euros", 
					"De Reais a Libras Esterlinas", 
					"De Reais a Peso Argentino",
					"De Reais a Peso Chileno",
					"De Reais a Yenes",
					"De Reais a Won Correano", 
					"De Dólares a Reais",
					"De Euro a Real",
					"De Libras Esterlinas a Reais",
					"De Peso Argentino a Reais",
					"De Peso Chileno a Reais",
					"De Yenes a Reais", 
					"De Won Coreano a Reais" };

			double[] taxas = { 
					5.00, 
					5.24,
					6.07,
					0.019,
					0.0060,
					0.033,
					0.0037,
					1 / 5.00,
					1 / 5.24,
					1 / 6.07,
					1 / 0.019,
					1 / 0.0060,
					1 / 0.033,
					1 / 0.0037 };

			String menuMoeda = (String) JOptionPane.showInputDialog(null,
					"Escolha a moeda para qual você deseja converter seu dinheiro", "Moedas",
					JOptionPane.QUESTION_MESSAGE, null, opcaoDeMoeda, opcaoDeMoeda[0]);
			
			// PEGA O VALOR
			double dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor",0));


			int indice = -1;
			
			//INDICE VAI CHAMA O VALORES NA TAXAS
			for (int i = 0; i < opcaoDeMoeda.length; i++) {
				if (menuMoeda.equals(opcaoDeMoeda[i])) {
					indice = i;
					break;
				}
			}
			if (indice <= 6) {
				double taxa = dinheiro / taxas[indice];
				JOptionPane.showMessageDialog(null,
						"A conversão " + opcaoDeMoeda[indice] + String.format("%s = %.2f", "", taxa));
			} else if (indice > 6) {
				double taxa = dinheiro * taxas[indice];
				JOptionPane.showMessageDialog(null,
						"A conversão " + opcaoDeMoeda[indice] + String.format("%s = %.2f", "", taxa) + " R$");
			} else {
				JOptionPane.showMessageDialog(null, "Erro no valor informado");
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Erro no valor informado,\n Informe um valor correto");

		}

	}

}
