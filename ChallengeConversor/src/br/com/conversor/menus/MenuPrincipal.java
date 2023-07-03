package br.com.conversor.menus;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {
		Menu menu = new Menu();

		while (true) {
			menu.ChamaMenu();

			int desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar", "continuar",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (desejaContinuar != JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break;
			}
		}
	}
}
