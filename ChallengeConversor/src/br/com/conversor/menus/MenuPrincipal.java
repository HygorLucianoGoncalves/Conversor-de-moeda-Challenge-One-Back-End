package br.com.conversor.menus;

import javax.swing.JOptionPane;

import br.com.conversor.moeda.Taxas;


public class MenuPrincipal {

	public static void main(String[] args) {
		//VETORE DE OPÇÂO
		String[] opcaoDeEscolhaConversor = { "Conversor de Moeda", "Conversor de Temperatura" };

		//CAIXA DE MENU
		String entrada = (String) JOptionPane.showInputDialog(null, "Escolha uma opçao", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opcaoDeEscolhaConversor, opcaoDeEscolhaConversor[0]);
		
		
		//CAIXA DE CONVEÇÃO DINHEIRO
		if (entrada == opcaoDeEscolhaConversor[0]) {
			Taxas t = new Taxas();
			t.opcaoMoeda();
			
		}
		
		
		
		
		
		//CAIXA DE CONVEÇÃO TEMPERATURA
		
		
		
		
		
		
//		else if (entrada == opcaoDeEscolhaConversor[1]) {
//			double Temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Temperatura ","Temperatura"));
//			
//			String[] opcaoDeTemp = {"De Celsius(C) Para Fahrenheit(F)","De Celsius(C) Para Kelvin(K)",
//					"De Fahrenheit(F) Para Celsius(C)","De Fahrenheit(F) Para Kelvin(K)",
//					"De Kelvin(K) Para Fahrenheit(F)","De Kelvin(K) Para Celsius(C)"};
//			
//			String menuTemo = (String) JOptionPane.showInputDialog(null, "Escolha a conversçao dejejada", "Temperatura",
//					JOptionPane.QUESTION_MESSAGE, null, opcaoDeTemp, opcaoDeTemp[0]);
//			}

		}
	}































//	// DESEJA CONTINUAR
//	int desejaContinuar = JOptionPane.showConfirmDialog(null, entrada,"Confirmar essa opção?",JOptionPane.YES_NO_CANCEL_OPTION);if(desejaContinuar==0)
//	{
//		// COLOCAR O INPUT DO VALOR PARA SOMA
//	}else if(desejaContinuar==1)
//	{
//
//	}System.out.println(desejaContinuar);
