package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class CalculatorListener implements ActionListener {

	private CalculatorView calculatorView;

	public CalculatorListener(CalculatorView calculatorView) {
		this.calculatorView = calculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		
		//vì nó là 1 cái chuỗi nên phải dùng hàm equals để xem có bằng nhau hay không
		if(btn.equals("+")) {
			this.calculatorView.plus();
		}else if(btn.equals("-")) {
			this.calculatorView.minus();
		}else if(btn.equals("*")) {
			this.calculatorView.multiply();
		}else if(btn.equals("/")) {
			this.calculatorView.divide();
		}else if(btn.equals("%")) {
			this.calculatorView.mod();
		}else if(btn.equals("^")) {
			this.calculatorView.pow();
		}
	}

}
