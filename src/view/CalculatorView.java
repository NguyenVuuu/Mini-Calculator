package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controll.CalculatorListener;
import model.CalculatorModel;

public class CalculatorView extends JFrame {
	private CalculatorModel calculatorModel;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;

	public CalculatorView() throws HeadlessException {
		this.calculatorModel = new CalculatorModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Calculator");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Sheriff", Font.BOLD, 20);

		ActionListener ac = new CalculatorListener(this);

		JLabel jLabel_firstValue = new JLabel("Số thứ nhất", JLabel.CENTER);
		jLabel_firstValue.setFont(font);
		JLabel jLabel_secondValue = new JLabel("Số thứ hai", JLabel.CENTER);
		jLabel_secondValue.setFont(font);
		JLabel jLabel_answer = new JLabel("Kết quả", JLabel.CENTER);
		jLabel_answer.setFont(font);

		jTextField_firstValue = new JTextField(50);// 50 kí tự
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setEditable(false);
		jTextField_answer.setFont(font);

		JPanel jPanelIO = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
		jPanelIO.add(jLabel_firstValue);
		jPanelIO.add(jTextField_firstValue);
		jPanelIO.add(jLabel_secondValue);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(jTextField_answer);

		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(ac);
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(ac);
		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(ac);
		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(ac);
		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(ac);
		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(ac);

		JPanel jPanelBtn = new JPanel();
		jPanelBtn.setLayout(new GridLayout(2, 3, 5, 5));
		jPanelBtn.add(jButton_plus);
		jPanelBtn.add(jButton_minus);
		jPanelBtn.add(jButton_multiply);
		jPanelBtn.add(jButton_divide);
		jPanelBtn.add(jButton_mod);
		jPanelBtn.add(jButton_pow);

		this.setLayout(new BorderLayout());
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanelBtn, BorderLayout.SOUTH);

	}

	public void plus() {
		// tạo biến để lưu giá trị người dùng nhập vào từ bàn phím

		// người dùng nhập giá trị cho jTextField_firstValue sau đó ta dùng hàm
		// getText() để gán giá trị từjTextField_firstValue cho firstValue
		// Double.valueOf() để ép kiểu dữ liệu sang double
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());

		// sử dụng hàm setFirst_value để gán giá trị từ firstValue qua cho
		// first_value(CalculatorModel)
		this.calculatorModel.setFirst_value(firstValue);
		this.calculatorModel.setSecond_value(secondValue);

		this.calculatorModel.plus();
		this.jTextField_answer.setText(this.calculatorModel.getAnswer() + "");
	}

	public void minus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.calculatorModel.setFirst_value(firstValue);
		this.calculatorModel.setSecond_value(secondValue);
		this.calculatorModel.minus();
		this.jTextField_answer.setText(this.calculatorModel.getAnswer() + "");
	}

	public void multiply() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.calculatorModel.setFirst_value(firstValue);
		this.calculatorModel.setSecond_value(secondValue);
		this.calculatorModel.multiply();
		this.jTextField_answer.setText(this.calculatorModel.getAnswer() + "");
	}

	public void divide() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.calculatorModel.setFirst_value(firstValue);
		this.calculatorModel.setSecond_value(secondValue);
		this.calculatorModel.divide();
		this.jTextField_answer.setText(this.calculatorModel.getAnswer() + "");
	}

	public void mod() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.calculatorModel.setFirst_value(firstValue);
		this.calculatorModel.setSecond_value(secondValue);
		this.calculatorModel.mod();
		this.jTextField_answer.setText(this.calculatorModel.getAnswer() + "");
	}

	public void pow() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.calculatorModel.setFirst_value(firstValue);
		this.calculatorModel.setSecond_value(secondValue);
		this.calculatorModel.pow();
		this.jTextField_answer.setText(this.calculatorModel.getAnswer() + "");
	}

}
