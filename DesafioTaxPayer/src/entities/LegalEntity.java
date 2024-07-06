package entities;

public class LegalEntity extends TaxPayer {

	private int umberOfWorkers;

	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double anualIncome, int umberOfWorkers) {
		super(name, anualIncome);
		this.umberOfWorkers = umberOfWorkers;
	}

	public int getWorkersOfNumber() {
		return umberOfWorkers;
	}

	public void setWorkersOfNumber(int umberOfWorkers) {
		this.umberOfWorkers = umberOfWorkers;
	}

	@Override
	public double taxToPay(){
		if (umberOfWorkers <= 10) {
			return super.getAnualIncome() * 0.16;
		} else {
			return super.getAnualIncome() * 0.14;
		}
	}
}