package br.com.conversor.quilometragem;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Quilometragem {

	private int indice;
	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public void ChamaKM() {
		try {
			String[] opcaoconversao = {
					"De Quilômetros para Metro",
					"De Quilômetros para Centímetros",
					"De Quilômetros para Milhas",
					"De Quilômetros para Jarda",
					"De Quilômetros para Pé",
					"De Quilômetros para Polegada",
					"De Quilômetros para Milhas Náutica",
					"De Metros para Quilômetros",
					"De Centímetros para Quilômetros",
					"De Milhas para Quilômetros",
					"De Jarda para Quilômetros",
					"De Pé para Quilômetros",
					"De Polegada para Quilômetros",
					"De Milhas Náutica para Quilômetros"
			};

			
			
			String menuQuilo= (String) JOptionPane.showInputDialog(null, "Escolha a conversçao desejada", "Temperatura",
					JOptionPane.QUESTION_MESSAGE, null, opcaoconversao, opcaoconversao[0]);
			
			double quilometragem = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor", 0));
			
			ArrayList<Double> valores = new ArrayList<Double>();
			valores.add(quilometragem * 1000);//Q PRA METRO
			valores.add(quilometragem * 10000);// Q PRA CENTRIMETRO
			valores.add(quilometragem * 1.609);//Q PRA MILHAS
			valores.add(quilometragem * 1094);// JARDA
			valores.add(quilometragem * 3281);//PÈ
			valores.add(quilometragem * 39370);//POLEGADA
			valores.add(quilometragem * 1.852);// MILHAS NÀUTICA
			//
			valores.add(quilometragem / 1000);
			valores.add(quilometragem / 10000);
			valores.add(quilometragem / 1.609);
			valores.add(quilometragem / 1094);
			valores.add(quilometragem / 3281);
			valores.add(quilometragem / 39370);
			valores.add(quilometragem / 1.852);
			
			for (int i = 0; i < opcaoconversao.length; i++) {
				if (menuQuilo.equals(opcaoconversao[i])) {
					setIndice(i);
					break;
				}
			}
			if (getIndice() <= 7) {
				JOptionPane.showMessageDialog(null, "A conversão é de: " + valores.get(getIndice()));
			}else if (getIndice() > 7) {
				JOptionPane.showMessageDialog(null, "A conversão é de: " + valores.get(getIndice()));
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Erro no valor Informado.\n informe uma Quilometragem correto");

		}
	}
}
