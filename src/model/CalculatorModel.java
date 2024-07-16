package model;

public class CalculatorModel {
	private double first_value;
	private double second_value;
	private double answer;

	public CalculatorModel() {
	}

	/**
	 * @return the first_value
	 */
	public double getFirst_value() {
		return first_value;
	}

	/**
	 * @param first_value the first_value to set
	 */
	public void setFirst_value(double first_value) {
		this.first_value = first_value;
	}

	/**
	 * @return the second_value
	 */
	public double getSecond_value() {
		return second_value;
	}

	/**
	 * @param second_value the second_value to set
	 */
	public void setSecond_value(double second_value) {
		this.second_value = second_value;
	}

	/**
	 * @return the answer
	 */
	public double getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public void plus() {
		this.answer = this.first_value + this.second_value;
	}

	public void minus() {
		this.answer = this.first_value - this.second_value;
	}

	public void multiply() {
		this.answer = this.first_value * this.second_value;
	}

	public void divide() {
		this.answer = this.first_value / this.second_value;
	}

	public void mod() {
		this.answer = this.first_value % this.second_value;
	}

	public void pow() {
		this.answer = Math.pow(this.first_value, this.second_value);
	}

}
