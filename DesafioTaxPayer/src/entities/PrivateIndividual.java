package entities;

public class PrivateIndividual extends TaxPayer {

	private double healthSpending;

	public PrivateIndividual(){
		super();
	}

	public PrivateIndividual(String name, Double anualIncome, double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxToPay() {
		if (super.getAnualIncome() < 20000) {
			return super.getAnualIncome() * 0.15 - healthSpending * 0.5;
		} else {
			return super.getAnualIncome() * 0.25 - healthSpending * 0.5;
		}
	}
}