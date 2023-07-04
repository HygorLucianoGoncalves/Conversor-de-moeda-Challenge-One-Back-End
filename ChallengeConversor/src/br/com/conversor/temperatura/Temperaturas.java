package br.com.conversor.temperatura;

import javax.swing.JOptionPane;

public class Temperaturas {
	private double resultado;

	public void ChamaTemp() {
		try {
			String[] opcaoDeTemp = { 
					"De Celsius(C) Para Fahrenheit(F)",
					"De Celsius(C) Para Kelvin(K)",
					"De Fahrenheit(F) Para Celsius(C)",
					"De Fahrenheit(F) Para Kelvin(K)",
					"De Kelvin(K) Para Fahrenheit(F)",
					"De Kelvin(K) Para Celsius(C)" };

			String menuTemo = (String) JOptionPane.showInputDialog(null, "Escolha a conversçao desejada", "Temperatura",
					JOptionPane.QUESTION_MESSAGE, null, opcaoDeTemp, opcaoDeTemp[0]);
			
			double temperatura = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Digite a Temperatura ", 0));
			
			int indice = -1;

			for (int i = 0; i < opcaoDeTemp.length; i++) {
				if (menuTemo.equals(opcaoDeTemp[i])) {
					indice = i;
					break;
				}
			}

			switch (indice) {
			case 0:
				setResultado((temperatura * 9 / 5) + 32);
				break;
			case 1:
				setResultado(temperatura + 273.15);
				break;
			case 2:
				setResultado((temperatura - 32) * 5 / 9);
				break;
			case 3:
				setResultado((temperatura - 32) * 5 / 9 + 273.15);
				break;
			case 4:
				setResultado((temperatura - 273.15) * 9 / 5 + 32);
				break;
			case 5:
				setResultado(temperatura - 273.15);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				return;
			}

			JOptionPane.showMessageDialog(null, "O resultado da conversão é: " + getResultado());
		}  catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Erro no valor Informado.\n informe uma Temperatura correto");

		}
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
}
