package test;

import javax.swing.UIManager;

import view.CalculatorView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new CalculatorView();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
