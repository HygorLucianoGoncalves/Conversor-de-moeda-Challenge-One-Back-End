package br.com.conversor.menus;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {
		while (true) {
			Menu menu = new Menu();
			menu.ChamaMenu();
			int desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar", "continuar",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (desejaContinuar == 0) {
				menu.ChamaMenu();
				int continuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar", "continuar",
						JOptionPane.YES_NO_CANCEL_OPTION);
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break;
			}
		}
	}
}
