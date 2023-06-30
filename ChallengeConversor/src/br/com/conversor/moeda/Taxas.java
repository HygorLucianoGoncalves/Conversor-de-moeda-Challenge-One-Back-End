package br.com.conversor.moeda;

import javax.swing.JOptionPane;

public class Taxas {

	public void opcaoMoeda() {
		try {
			double dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
			String[] opcaoDeMoeda = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
					"De Reais a Won Correano", "De Dólares a Reais", "De Euro a Real", "De Libras a Reais",
					"De Yenes a Reais", "De Won Coreano a Reais" };
			String menuMoeda = (String) JOptionPane.showInputDialog(null,
					"Escolha a moeda para qual você deseja converter seu dinheiro", "Moedas",
					JOptionPane.QUESTION_MESSAGE, null, opcaoDeMoeda, opcaoDeMoeda[0]);
			if (menuMoeda.equals(opcaoDeMoeda[0])) {
				double taxa = dinheiro / 5.00;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[0] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[1])) {
				double taxa = dinheiro / 5.24;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[1] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[2])) {
				double taxa = dinheiro / 6.09;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[2] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[3])) {
				double taxa = dinheiro / 0.033;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[3] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[4])) {
				double taxa = dinheiro / 0.036;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[4] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[5])) {
				double taxa = dinheiro * 5.00;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[5] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[6])) {
				double taxa = dinheiro * 5.24;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[6] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[7])) {
				double taxa = dinheiro * 6.09;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[7] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[8])) {
				double taxa = dinheiro * 0.033;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[8] + ": " + taxa);
			}
			if (menuMoeda.equals(opcaoDeMoeda[9])) {
				double taxa = dinheiro * 0.036;
				JOptionPane.showMessageDialog(null, "A conversão " + opcaoDeMoeda[9] + ": " + taxa);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro no valor informado");

		}

	}

}
