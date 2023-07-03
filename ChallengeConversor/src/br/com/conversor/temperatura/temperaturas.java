package br.com.conversor.temperatura;

import javax.swing.JOptionPane;

public class temperaturas {
	private int fahrenheit = 32;
	public void ChamaTemp() {
		// CAIXA DE CONVEÇÃO TEMPERATURA
		double temperatura = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Digite a Temperatura ", "Temperatura"));
		
		String[] opcaoDeTemp = { 
				"De Celsius(C) Para Fahrenheit(F)",
				"De Celsius(C) Para Kelvin(K)",
				"De Fahrenheit(F) Para Celsius(C)",
				"De Fahrenheit(F) Para Kelvin(K)",
				"De Kelvin(K) Para Fahrenheit(F)",
				"De Kelvin(K) Para Celsius(C)" };
		

		String menuTemo = (String) JOptionPane.showInputDialog(null, "Escolha a conversçao dejejada", "Temperatura",
				JOptionPane.QUESTION_MESSAGE, null, opcaoDeTemp, opcaoDeTemp[0]);

		int indice = -1;

		for (int i = 0; i < opcaoDeTemp.length; i++) {
			if (menuTemo.equals(opcaoDeTemp[i])) {
				indice = i;
				break;
			}
		}
		if(indice == 0) {
			double calc0 = (temperatura * 9 / 5) + 32;
		}else if (indice == 1) {
			double calc1 = temperatura + 273.15;
		} else if (indice == 2) {
			double calc2 = (temperatura - 32) * 5/9;
		} else if (indice == 3) {
			double calc3 = (temperatura - 32) * 5/9 + 273.15;
		}else if (indice == 4) {
			double calc4 = (temperatura - 273.15) * 9/5 + 32;
		} else if (indice == 5) {
			double calc5 = temperatura - 273.15;
		} else {
			JOptionPane.showMessageDialog(null, "Erro no valor informado");
		}
		
	}
	public int getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
}
